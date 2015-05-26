/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controler.Calendrier;
import java.awt.Dimension;

/**
 *
 * @author TAN
 */
public class CalendrierPanel extends javax.swing.JPanel implements ActionListener {
        Choice anneeChoice = new Choice();
	Choice moisChoice = new Choice();
	JButton jButton1 = new JButton("Valider");
	JLabel dayLabels[] = new JLabel[42];
	JTextField textFieldsAM[] = new JTextField[42];
	JTextField textFieldsPM[] = new JTextField[42];
 	JTextField text = new JTextField(10);
	JButton titleName[] = new JButton[7];
	String weeks[] = { "lundi", "mardi", "mercredi", "jeudi", "vendredi","samedi", "dimanche" };
	int annee = 2015, mois = 1;
	Calendrier calendrier;
	private String[] jour;

	public CalendrierPanel() {
		JPanel pCenter = new JPanel();
                pCenter.setPreferredSize(new Dimension(400,400));
		pCenter.setLayout(new GridLayout(7, 7));
		for (int i = 0; i < 7; i++) {
			titleName[i] = new JButton(weeks[i]);
			pCenter.add(titleName[i]);
		}

		for (int i = 2010; i <= 2050; i++) {
			anneeChoice.addItem(i + "");
		}

		for (int i = 1; i <= 12; i++) {
			moisChoice.addItem(i + "");
		}

		anneeChoice.select(String.valueOf(annee));
		moisChoice.select(String.valueOf(mois));
		text.addActionListener(this);
		calendrier = new Calendrier();
		calendrier.setAnnee(annee);
		calendrier.setMois(mois);
		jour = calendrier.getCalendrier();

		for (int i = 0; i < jour.length; i++) {
			JPanel jPanel = new JPanel();
			jPanel.setLayout(new GridLayout(3, 1));
			dayLabels[i] = new JLabel("", JLabel.CENTER);
			textFieldsAM[i] = new JTextField();
			textFieldsPM[i] = new JTextField();
			jPanel.add(dayLabels[i]);
			jPanel.add(textFieldsAM[i]);
			jPanel.add(textFieldsPM[i]);
			pCenter.add(jPanel);
			dayLabels[i].setText(jour[i]);
			if (jour[i] == null || (i - 5) % 7 == 0 || (i - 6) % 7 == 0) {
				textFieldsAM[i].setEditable(false);
				textFieldsPM[i].setEditable(false);
			}
		}
               
		jButton1.addActionListener(this);
	//	JPanel pNorth = new JPanel();
		JPanel pSouth = new JPanel();
		pSouth.add(anneeChoice);
		pSouth.add(moisChoice);
		pSouth.add(jButton1);

		ScrollPane scrollPane = new ScrollPane();
		scrollPane.add(pCenter);              
		add(scrollPane, BorderLayout.NORTH);
	//	add(pNorth, BorderLayout.NORTH);
		add(pSouth, BorderLayout.SOUTH);
                
                scrollPane.setPreferredSize(new Dimension(450, 450));
                
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jButton1) {
			mois = Integer.parseInt(moisChoice.getSelectedItem());
			annee = Integer.parseInt(anneeChoice.getSelectedItem());
			calendrier.setMois(mois);
			calendrier.setAnnee(annee);
			jour = calendrier.getCalendrier();

			for (int i = 0; i < jour.length; i++) {
				dayLabels[i].setText(jour[i]);
				if (jour[i] == null || (i - 5) % 7 == 0 || (i - 6) % 7 == 0) {
					textFieldsAM[i].setEditable(false);
					textFieldsPM[i].setEditable(false);
				}else {
					textFieldsAM[i].setEditable(true);
					textFieldsPM[i].setEditable(true);
				}
			}

		}

	}

}
