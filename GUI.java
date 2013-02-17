import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import org.powerbot.game.api.methods.input.Mouse;



/**
 * @author Jack Smith
 */
public class GUI extends JFrame {
	
    private boolean isRunning = true;

	public GUI() {
		initComponents();
	}
	private void button1ActionPerformed(ActionEvent e) {
			if (radioButton1.isSelected()) {
			settings.oreToMine = settings.TIN_ID;
			settings.oreIs = settings.TIN_ORE;
			} else if (radioButton2.isSelected()) {
			settings.oreToMine = settings.COPPER_ID;
			settings.oreIs = settings.COPPER_ORE;
			}else if (radioButton3.isSelected()) {
			settings.oreToMine = settings.IRON_ID;
			settings.oreIs = settings.IRON_ORE;
			} else if (radioButton4.isSelected()) {
			
			} else if (radioButton5.isSelected()) {
				
			} else if (radioButton6.isSelected()) {
			
			} else if (radioButton7.isSelected()) {
				
			} else if (radioButton8.isSelected()) {
		
			} if (radioButton9.isSelected()) { // Start Locations
				settings.isLumbridge = true;
			}  else if (radioButton10.isSelected()) {
				
			} else if (radioButton11.isSelected()) {
				
			} else if (radioButton12.isSelected()) {
				
			} else if (radioButton13.isSelected()) {
				
			} else if (radioButton14.isSelected()) {
				//end of Locations
			} if (radioButton15.isSelected()) { // Start of Powermine, smith, bank
			settings.powerMine = true;
			slider2.setValue(40);
			slider2.setEnabled(false);
			} else if (radioButton16.isSelected()) {
				
			}  else if (radioButton17.isSelected()) {// end of Powermine, smith, bank
				
			} 
	        int value1 = (int)slider1.getValue(); // Gets slider1 value to use selection statement
	        System.out.println(value1);
			if (value1 == 0) {
				Mouse.setSpeed(Mouse.Speed.VERY_SLOW);
			} else if (value1 == 10) {
				Mouse.setSpeed(Mouse.Speed.SLOW);
			} else if (value1 == 20) {
				Mouse.setSpeed(Mouse.Speed.NORMAL);
			} else if (value1 == 30) {
				Mouse.setSpeed(Mouse.Speed.FAST);
			} else if (value1 == 40) {
				Mouse.setSpeed(Mouse.Speed.VERY_FAST);
			}
int value2 = (int)slider2.getValue(); 
if (value2 == 0) {
settings.startDrop = 1300;
settings.endDrop = 1500;
} else if (value2 == 10) {
	settings.startDrop = 1000;
	settings.endDrop = 1200;
} else if (value2 == 20) {
	settings.startDrop = 500;
	settings.endDrop = 600;
} else if (value2 == 30) {
	settings.startDrop = 270;
	settings.endDrop = 350;
} else if (value2 == 40) {
	settings.startDrop = 100;
	settings.endDrop = 250;
}
			dispose();
	}
	  
    public boolean isRunning() {
        return isRunning;
    }
	

	private void radioButton1ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void radioButton2ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void radioButton3ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void radioButton4ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void radioButton5ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jack Smith
		tabbedPane1 = new JTabbedPane();
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		radioButton1 = new JRadioButton();
		radioButton2 = new JRadioButton();
		radioButton3 = new JRadioButton();
		radioButton4 = new JRadioButton();
		radioButton5 = new JRadioButton();
		radioButton6 = new JRadioButton();
		radioButton7 = new JRadioButton();
		radioButton8 = new JRadioButton();
		panel2 = new JPanel();
		radioButton9 = new JRadioButton();
		radioButton10 = new JRadioButton();
		radioButton11 = new JRadioButton();
		radioButton12 = new JRadioButton();
		radioButton13 = new JRadioButton();
		radioButton14 = new JRadioButton();
		label15 = new JLabel();
		separator1 = new JSeparator();
		label16 = new JLabel();
		radioButton15 = new JRadioButton();
		radioButton16 = new JRadioButton();
		radioButton17 = new JRadioButton();
		panel3 = new JPanel();
		slider1 = new JSlider();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		slider2 = new JSlider();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();
		button1 = new JButton();

		//======== this ========
		setTitle("Pre-Pentium Miner");
		Container contentPane = getContentPane();

		//======== tabbedPane1 ========
		{

			//======== panel1 ========
			{

				// JFormDesigner evaluation mark
				panel1.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.blue), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- label1 ----
				label1.setText("Pre-Mine Settings");
				label1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));

				//---- label2 ----
				label2.setText("Type of Ore:");

				//---- radioButton1 ----
				radioButton1.setText("Tin");
				radioButton1.setSelected(true);
				radioButton1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						radioButton1ActionPerformed(e);
						radioButton9.setVisible(true);
						radioButton10.setVisible(false);
						radioButton11.setVisible(false);
						radioButton12.setVisible(false);
						radioButton13.setVisible(false);
						radioButton14.setVisible(false);
					}
				});

				//---- radioButton2 ----
				radioButton2.setText("Coper");
				radioButton2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						radioButton2ActionPerformed(e);
						radioButton9.setVisible(true);
						radioButton10.setVisible(false);
						radioButton11.setVisible(false);
						radioButton12.setVisible(false);
						radioButton13.setVisible(false);
						radioButton14.setVisible(false);
					}
				});

				//---- radioButton3 ----
				radioButton3.setText("Iron");
				radioButton3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						radioButton3ActionPerformed(e);
						radioButton9.setVisible(false);
						radioButton10.setVisible(true);
						radioButton11.setVisible(false);
						radioButton12.setVisible(false);
						radioButton13.setVisible(false);
						radioButton14.setVisible(false);
					}
				});

				//---- radioButton4 ----
				radioButton4.setText("Coal");
				radioButton4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						radioButton4ActionPerformed(e);
						radioButton9.setVisible(false);
						radioButton10.setVisible(true);
						radioButton11.setVisible(false);
						radioButton12.setVisible(false);
						radioButton13.setVisible(false);
						radioButton14.setVisible(false);
					}
				});

				//---- radioButton5 ----
				radioButton5.setText("Steel - Iron, Coal");
				radioButton5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						radioButton5ActionPerformed(e);
						radioButton9.setVisible(false);
						radioButton10.setVisible(true);
						radioButton11.setVisible(false);
						radioButton12.setVisible(false);
						radioButton13.setVisible(false);
						radioButton14.setVisible(false);
					}
				});

				//---- radioButton6 ----
				radioButton6.setText("Mirthil");
				radioButton6.setEnabled(false);

				//---- radioButton7 ----
				radioButton7.setText("Addy");
				radioButton7.setEnabled(false);

				//---- radioButton8 ----
				radioButton8.setText("Runite");
				radioButton8.setEnabled(false);

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout.setHorizontalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addGroup(panel1Layout.createParallelGroup()
								.addGroup(panel1Layout.createSequentialGroup()
									.addContainerGap()
									.addGroup(panel1Layout.createParallelGroup()
										.addComponent(label1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
										.addGroup(panel1Layout.createSequentialGroup()
											.addGroup(panel1Layout.createParallelGroup()
												.addComponent(radioButton2)
												.addComponent(radioButton3)
												.addComponent(radioButton4)
												.addComponent(radioButton1))
											.addGap(139, 139, 139)
											.addGroup(panel1Layout.createParallelGroup()
												.addComponent(radioButton8)
												.addComponent(radioButton7)
												.addComponent(radioButton5)
												.addComponent(radioButton6)))))
								.addGroup(panel1Layout.createSequentialGroup()
									.addGap(108, 108, 108)
									.addComponent(label2)))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
				panel1Layout.setVerticalGroup(
					panel1Layout.createParallelGroup()
						.addGroup(panel1Layout.createSequentialGroup()
							.addComponent(label1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(label2)
							.addGap(7, 7, 7)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(radioButton5)
								.addComponent(radioButton1))
							.addGap(18, 18, 18)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(radioButton2)
								.addComponent(radioButton6))
							.addGap(18, 18, 18)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(radioButton3)
								.addComponent(radioButton7))
							.addGap(18, 18, 18)
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(radioButton4)
								.addComponent(radioButton8))
							.addGap(0, 7, Short.MAX_VALUE))
				);
			}
			tabbedPane1.addTab("Pick", panel1);


			//======== panel2 ========
			{

				//---- radioButton9 ----
				radioButton9.setText("Lumbridge");

				//---- radioButton10 ----
				radioButton10.setText("text");

				//---- radioButton11 ----
				radioButton11.setText("text");

				//---- radioButton12 ----
				radioButton12.setText("text");

				//---- radioButton13 ----
				radioButton13.setText("text");

				//---- radioButton14 ----
				radioButton14.setText("text");

				//---- label15 ----
				label15.setText("Location:");

				//---- label16 ----
				label16.setText("With Ore:");

				//---- radioButton15 ----
				radioButton15.setText("Power Mine");

				//---- radioButton16 ----
				radioButton16.setText("Smith");
				radioButton16.setEnabled(false);

				//---- radioButton17 ----
				radioButton17.setText("Bank");

				GroupLayout panel2Layout = new GroupLayout(panel2);
				panel2.setLayout(panel2Layout);
				panel2Layout.setHorizontalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panel2Layout.createParallelGroup()
								.addGroup(panel2Layout.createSequentialGroup()
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(radioButton9, GroupLayout.Alignment.LEADING)
										.addComponent(radioButton13, GroupLayout.Alignment.LEADING)
										.addComponent(radioButton14, GroupLayout.Alignment.LEADING))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(radioButton12, GroupLayout.Alignment.LEADING)
										.addGroup(GroupLayout.Alignment.LEADING, panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
											.addComponent(radioButton11)
											.addComponent(radioButton10))))
								.addComponent(separator1)
								.addGroup(panel2Layout.createSequentialGroup()
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(radioButton16)
										.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
											.addGroup(panel2Layout.createSequentialGroup()
												.addGap(122, 122, 122)
												.addComponent(label15))
											.addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
												.addComponent(radioButton15)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(label16))))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
									.addComponent(radioButton17)))
							.addContainerGap())
				);
				panel2Layout.setVerticalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label15)
							.addGap(5, 5, 5)
							.addGroup(panel2Layout.createParallelGroup()
								.addGroup(panel2Layout.createSequentialGroup()
									.addComponent(radioButton12)
									.addGap(4, 4, 4)
									.addComponent(radioButton10)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(radioButton11))
								.addGroup(panel2Layout.createSequentialGroup()
									.addComponent(radioButton9)
									.addGap(4, 4, 4)
									.addComponent(radioButton13)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(radioButton14)))
							.addGap(15, 15, 15)
							.addGroup(panel2Layout.createParallelGroup()
								.addGroup(panel2Layout.createSequentialGroup()
									.addComponent(separator1, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(radioButton15)
										.addComponent(radioButton17)))
								.addComponent(label16))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
							.addComponent(radioButton16))
				);
			}
			tabbedPane1.addTab("Options", panel2);


			//======== panel3 ========
			{

				//---- slider1 ----
				slider1.setPaintTicks(true);
				slider1.setSnapToTicks(true);
				slider1.setMaximum(40);
				slider1.setMajorTickSpacing(10);
				slider1.setValue(20);

				//---- label3 ----
				label3.setText("Adjust Mouse Speed");

				//---- label4 ----
				label4.setText("Very Slow");

				//---- label5 ----
				label5.setText("Slow");

				//---- label6 ----
				label6.setText("Normal");

				//---- label7 ----
				label7.setText("Fast");

				//---- label8 ----
				label8.setText("Very Fast");

				//---- slider2 ----
				slider2.setPaintTicks(true);
				slider2.setSnapToTicks(true);
				slider2.setMaximum(40);
				slider2.setMajorTickSpacing(10);
				slider2.setValue(20);

				//---- label9 ----
				label9.setText("Adjust Drop Speed");

				//---- label10 ----
				label10.setText("Very Slow");

				//---- label11 ----
				label11.setText("Slow");

				//---- label12 ----
				label12.setText("Normal");

				//---- label13 ----
				label13.setText("Fast");

				//---- label14 ----
				label14.setText("Very Fast");

				//---- button1 ----
				button1.setText("Start");
				button1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						button1ActionPerformed(e);
					}
				});

				GroupLayout panel3Layout = new GroupLayout(panel3);
				panel3.setLayout(panel3Layout);
				panel3Layout.setHorizontalGroup(
					panel3Layout.createParallelGroup()
						.addGroup(panel3Layout.createSequentialGroup()
							.addGroup(panel3Layout.createParallelGroup()
								.addGroup(panel3Layout.createSequentialGroup()
									.addGroup(panel3Layout.createParallelGroup()
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(98, 98, 98)
											.addComponent(label3))
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(47, 47, 47)
											.addComponent(slider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(26, 26, 26)
											.addComponent(label4)
											.addGap(18, 18, 18)
											.addComponent(label5)
											.addGap(18, 18, 18)
											.addComponent(label6)
											.addGap(18, 18, 18)
											.addComponent(label7)
											.addGap(18, 18, 18)
											.addComponent(label8))
										.addGroup(panel3Layout.createSequentialGroup()
											.addGap(34, 34, 34)
											.addGroup(panel3Layout.createParallelGroup()
												.addGroup(panel3Layout.createSequentialGroup()
													.addGap(72, 72, 72)
													.addComponent(label9))
												.addGroup(panel3Layout.createSequentialGroup()
													.addGap(21, 21, 21)
													.addComponent(slider2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(panel3Layout.createSequentialGroup()
													.addComponent(label10)
													.addGap(18, 18, 18)
													.addComponent(label11)
													.addGap(18, 18, 18)
													.addComponent(label12)
													.addGap(18, 18, 18)
													.addComponent(label13)
													.addGap(18, 18, 18)
													.addComponent(label14)))))
									.addGap(0, 32, Short.MAX_VALUE))
								.addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
									.addGap(0, 250, Short.MAX_VALUE)
									.addComponent(button1)))
							.addContainerGap())
				);
				panel3Layout.setVerticalGroup(
					panel3Layout.createParallelGroup()
						.addGroup(panel3Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label3)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(slider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label4)
								.addComponent(label5)
								.addComponent(label6)
								.addComponent(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label8))
							.addGap(18, 18, 18)
							.addComponent(label9)
							.addGap(6, 6, 6)
							.addComponent(slider2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6, 6, 6)
							.addGroup(panel3Layout.createParallelGroup()
								.addComponent(label10)
								.addComponent(label11)
								.addComponent(label12)
								.addComponent(label13)
								.addComponent(label14))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(button1)
							.addGap(9, 9, 9))
				);
			}
			tabbedPane1.addTab("Finalizing", panel3);

		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(tabbedPane1)
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
		);
		pack();
		setLocationRelativeTo(getOwner());

		//---- buttonGroup2 ----
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton1);
		buttonGroup2.add(radioButton2);
		buttonGroup2.add(radioButton3);
		buttonGroup2.add(radioButton4);
		buttonGroup2.add(radioButton5);
		buttonGroup2.add(radioButton6);
		buttonGroup2.add(radioButton7);
		buttonGroup2.add(radioButton8);

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton9);
		buttonGroup1.add(radioButton10);
		buttonGroup1.add(radioButton11);
		buttonGroup1.add(radioButton12);
		buttonGroup1.add(radioButton13);
		buttonGroup1.add(radioButton14);

		//---- buttonGroup3 ----
		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(radioButton15);
		buttonGroup3.add(radioButton16);
		buttonGroup3.add(radioButton17);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jack Smith
	private JTabbedPane tabbedPane1;
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private JRadioButton radioButton4;
	private JRadioButton radioButton5;
	private JRadioButton radioButton6;
	private JRadioButton radioButton7;
	private JRadioButton radioButton8;
	private JPanel panel2;
	private JRadioButton radioButton9;
	private JRadioButton radioButton10;
	private JRadioButton radioButton11;
	private JRadioButton radioButton12;
	private JRadioButton radioButton13;
	private JRadioButton radioButton14;
	private JLabel label15;
	private JSeparator separator1;
	private JLabel label16;
	private JRadioButton radioButton15;
	private JRadioButton radioButton16;
	private JRadioButton radioButton17;
	private JPanel panel3;
	private JSlider slider1;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JSlider slider2;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
