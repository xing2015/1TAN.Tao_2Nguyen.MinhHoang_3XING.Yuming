/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.Module;

/**
 *
 * @author YUMING
 * @author TAO
 * @author MINHHOANG
 */
public class ModulePanel extends JPanel {

    //private ModuleFenetre nf;
    private DefaultTableModel tableModel;
    private JTable moduleTable;
    private JPanel panelModule, panelAdd, panelSubmit;
    private JTextField moduleText, abbText, colorText, seanceText, nomText, dureeSText, dureeFmText, dureeMText;
    private JScrollPane jScrollPane1;
    private List<Module> mListe;

    public ModulePanel() {
        super();
        //setTitle("Gestion de module");
        setBounds(5, 5, 950, 350);
        //setMaximumSize(new Dimension(600, 600));
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }

    public void initModule() {
        mListe = new ArrayList<>();
        mListe.add(new Module("Java", "java", "red", 45, 90));
        mListe.add(new Module("Base de données", "BD", "blue", 45, 90));
    }

    private void initComponents() {

        panelSubmit = new JPanel();
        panelAdd = new JPanel();
        panelModule = new JPanel();
        jScrollPane1 = new JScrollPane();

        setLayout(new GridBagLayout());
        GridBagConstraints mainLayout = new GridBagConstraints();

        mainLayout.anchor = GridBagConstraints.CENTER;

        mainLayout.gridx = 0;
        mainLayout.gridy = 1;
        add(panelModule);
        add(panelModule, mainLayout);
        panelModule.setPreferredSize(new Dimension(750, 200));

        mainLayout.gridx = 0;
        mainLayout.gridy = 2;
       add(panelAdd);
        add(panelAdd, mainLayout);
        panelAdd.setBorder(BorderFactory.createEtchedBorder());
        panelAdd.setPreferredSize(new Dimension(900, 50));

        mainLayout.gridx = 0;
        mainLayout.gridy = 3;
       add(panelSubmit);
        add(panelSubmit, mainLayout);

//PanelModule************************************************************************************
        /**
         * PanelModule : liste des modules
         */
        Object[][] mRow = null;
        // Object[][] mRow = {{"Java","java", "red",45,90}};
        /* for (int i = 0; i <= mListe.size(); i++) {
         Module om = mListe.get(i);
         mRow[i][0]=mListe.get(i).getNom();
         mRow[i][1]=mListe.get(i).getAbbreviation();
         mRow[i][2]=mListe.get(i).getCouleur();
         mRow[i][3]=mListe.get(i).getNbSeance();
         mRow[i][4]=mListe.get(i).getDuree();
         };*/

        Object[] mCol = {"Module", "abbreviation", "Couleur", "Nombre de séance", "Durée "};
        tableModel = new DefaultTableModel(mRow, mCol);
        moduleTable = new JTable(tableModel);

        moduleTable.setBorder(BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(moduleTable);

        moduleTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        moduleTable.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int selectedRow = moduleTable.getSelectedRow();
                Object oModule = tableModel.getValueAt(selectedRow, 0);
                Object oAbb = tableModel.getValueAt(selectedRow, 1);
                Object oColor = tableModel.getValueAt(selectedRow, 2);
                Object oSeance = tableModel.getValueAt(selectedRow, 3);
                Object oDuree = tableModel.getValueAt(selectedRow, 4);

            }

        }
        );
        panelModule.add(new JLabel("Liste de module"));
        panelModule.add(jScrollPane1);
        jScrollPane1.setPreferredSize(new Dimension(750, 150));

//PanelAdd************************************************************************************        
        /**
         * panelSubmit de "Ajouter/supprimer/modifier"
         */
        panelAdd.add(new JLabel("Module: "));
        moduleText = new JTextField("Java", 5);
        panelAdd.add(moduleText);

        panelAdd.add(new JLabel("Abb: "));
        abbText = new JTextField("java", 5);
        panelAdd.add(abbText);

        panelAdd.add(new JLabel("Color: "));
        colorText = new JTextField("red", 5);
        panelAdd.add(colorText);

        panelAdd.add(new JLabel("Seance: "));
        seanceText = new JTextField("50h", 5);
        panelAdd.add(seanceText);

        panelAdd.add(new JLabel("Durée: "));
        dureeMText = new JTextField("50h", 5);
        panelAdd.add(dureeMText);

        final JButton addButton = new JButton("Ajouter");//ajouter
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] rowValues = {moduleText.getText(), abbText.getText(), colorText.getText(), seanceText.getText(),dureeMText.getText()};
                tableModel.addRow(rowValues); //ajouter un ligne
                int rowCount = moduleTable.getRowCount() + 1; //nb de ligne +1
                moduleText.setText("");
                abbText.setText("");
                colorText.setText("");
                seanceText.setText("");
                dureeMText.setText("");
                //dureeMText.setText("" + rowCount);
            }

        });
        panelAdd.add(addButton);

        final JButton updateButton = new JButton("Modifier"); //modifier
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = moduleTable.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.setValueAt(moduleText.getText(), selectedRow, 0);
                    tableModel.setValueAt(abbText.getText(), selectedRow, 1);
                    tableModel.setValueAt(colorText.getText(), selectedRow, 2);
                    tableModel.setValueAt(seanceText.getText(), selectedRow, 3);
                    tableModel.setValueAt(dureeMText.getText(), selectedRow, 4);
                }
            }
        });
        panelAdd.add(updateButton);

        final JButton delButton = new JButton("Supprimer");// supprimer un ligne
        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = moduleTable.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                }
            }
        });
        panelAdd.add(delButton);

//PanelSubmit************************************************************************************
        /**
         * PanelSubmit: Enregistrer les opérations;
         */
        // panelSubmit.setPreferredSize(new Dimension(100, 40));
        final JButton submitButton = new JButton("Enregistrer");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveData();
            }

            private void saveData() {
               // int col = tableModel.getColumnCount();
                int row = tableModel.getRowCount();
                int i=0;
                //for (int i = 0; i < row; i++) {                 
                       Module m= new Module();
                          m.setNom((String) tableModel.getValueAt(i, 1));
                          m.setAbbreviation((String) tableModel.getValueAt(i, 2));
                          m.setCouleur((String) tableModel.getValueAt(i, 3));
                          m.setNbSeance((int) tableModel.getValueAt(i, 4));
                          m.setDuree((int) tableModel.getValueAt(i, 5));
                       mListe.add(m);                   
               // }
            }
            
            

        });
        panelSubmit.add(submitButton);

        //boutton reset
        //JButton submitButton =new JButton("Reset");
        //JButton annulerButton = new JButton("Annuler");
        //panelSubmit.add(annulerButton);
    }

    /* public ModuleFenetre getNf() {
     if (nf == null) {
     nf = new ModuleFenetre();
     }
     return nf;
     }
     
    /**
     * @param args
     */
     
    public static void main(String args[]) {
        JFrame f=new JFrame();
         f.setBounds(5, 5, 950, 350);
          ModulePanel c=new ModulePanel();
        f.setVisible(true);
        f.add(c);
      
     }
}
