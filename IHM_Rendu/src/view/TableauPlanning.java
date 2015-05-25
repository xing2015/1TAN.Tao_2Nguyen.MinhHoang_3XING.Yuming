package View;

import View.TableauPlanning.TableauPlanningModele;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class TableauPlanning extends javax.swing.JPanel implements Observer {

    
    public TableauPlanningModele modele;
    private int annee;
    private int mois;
    
    
    
    public TableauPlanning() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
       
        TableauPlanningModele tbModel = new TableauPlanningModele(); 
         jTable1 = new javax.swing.JTable(tbModel);
         jTable1.setPreferredScrollableViewportSize(new Dimension(600,400));
        //jTable1.setModel(TableauPlanningModele);
        jScrollPane1.setViewportView(jTable1);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public class TableauPlanningModele extends AbstractTableModel{
        
        private final String[] entetes = {" ","Dimanche","Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi"};
        
        private int annee;
        private int mois;
        
        public TableauPlanningModele(){
            super();
        }
        
        public TableauPlanningModele(int an, int mois){
            super();
            this.annee = an;
            this.mois = mois;
            
        }       

        @Override
        public int getRowCount() {
            return 12;
            
        }

        @Override
        public int getColumnCount() {
            return 8;
        }
        
        @Override
        public String getColumnName(int columnIndex) {
            return entetes[columnIndex];
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            
            GregorianCalendar cal = new GregorianCalendar(annee, mois, 1);
            int nbJourDansMois = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
            int debutMois = cal.get(GregorianCalendar.DAY_OF_WEEK);
            int tabCalendrier [][] =  new int[12][7];
            for(int i = 1; i <= nbJourDansMois; i++){
                int rowMatin = ((i + debutMois -  2)/7)*2;
                int rowSoir = (((i + debutMois -  2)/7)*2)+1;
                int column = (i + debutMois -2)%7; 
                tabCalendrier[rowMatin][column] = i;
                tabCalendrier[rowSoir][column] = i;
            }
            if(columnIndex == 0){
                switch (rowIndex) {
                    case 1: case 3: case 5: case 7: case 9: case 11:
                        return "Soir";
                    default:
                        return "Matin";
                }
            }else{
                return tabCalendrier[rowIndex][columnIndex-1] /*+ info de la module à rajouter*/ ;
		
			
                }
			
            }
        }
    
   
    }