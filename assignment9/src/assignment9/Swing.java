package assignment9;
/*Min Joung Kim
*CIS 35A
*Assignment9
*DueDate: June 20,2016
*June 25,2016*/

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class Swing extends JFrame {
	
	CustomerInfo customer;
	private char[]nameInChar;
	JButton button1;
	JPanel panelNorth,panelWest,panelCenter;
	JLabel label1, label2,label3,label4,label5;
	JTextField textfield1, textfield2, textfield3,textfield4;
	JTextArea textarea; 
	JCheckBox box1,box2,box3;
	Font font1,biggerFont1;
	ButtonGroup group;
	private String fullName;
	private int numOfBoat;
	private int date;
	private int numOfWeek;
	StringBuilder s1;

	
	Swing(){
		
		customer = new CustomerInfo();
		this.setTitle("Welcome to Disney");
		this.setSize(850, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panelNorth();
		panelWest();
		panelCenter();
		
		this.add(panelNorth, BorderLayout.NORTH);
		this.add(panelWest, BorderLayout.WEST);
		this.add(panelCenter);
		
		ListenForButton lForButton= new ListenForButton();
		button1.addActionListener(lForButton);
		print();
		
		this.setVisible(true);
		textfield1.requestFocus();
	}
	
	public void panelNorth(){
		
		panelNorth = new JPanel();
		panelNorth.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
		panelNorth.setBackground(Color.PINK);
		label1 = new JLabel("Disney Resort");
		font1 = new Font("", Font.BOLD,50);
		label1.setFont(font1);
		panelNorth.add(label1);
		panelNorth.add(new JLabel("Please enter you full name: "));
		textfield1 = new JTextField("MinJoungKim",15);
		textfield1.setToolTipText("FirstName and LastName(without space)");
		panelNorth.add(textfield1);
		
		
		
	}
	
	
	public void panelWest(){
		
		panelWest = new JPanel();
		panelWest.setBackground(Color.PINK);
		panelWest.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
		JPanel gridBagLayoutPanel = new JPanel(new GridBagLayout());
		gridBagLayoutPanel.setBackground(Color.PINK);
		panelWest.add(gridBagLayoutPanel);
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		

		gridBagLayoutPanel.add(new JLabel("                         "),c);
		//adjust position 
		c.anchor= GridBagConstraints.FIRST_LINE_START;
		c.gridy++;
		c.gridy++;
		
	
		gridBagLayoutPanel.add(new JLabel("Rental Choice:"),c);
		c.gridy = 6;
		box1 = new JCheckBox("one-bedroom cottage at $600.00 per week");
		box1.setBackground(Color.pink);
		gridBagLayoutPanel.add(box1,c);
		c.gridy = 8;
		box2 = new JCheckBox("two bedroom cottage at $850.00 per week");
		box2.setBackground(Color.pink);
		gridBagLayoutPanel.add(box2,c);
		c.gridy = 10;
		box3 = new JCheckBox("a rowboat rental at $60.00 per week");
		box3.setBackground(Color.pink);
		gridBagLayoutPanel.add(box3,c);
		c.gridy = 14;
		gridBagLayoutPanel.add(new JLabel("Check In: "),c);
		c.gridy = 17;
		textfield4  = new JTextField("YYYYMMDD", 10);
		gridBagLayoutPanel.add(textfield4,c);
		c.gridy = 22;
		gridBagLayoutPanel.add(new JLabel("How many weeks do you want to stay: "),c);
		c.gridy = 26;
		textfield2 = new JTextField("", 10);
		gridBagLayoutPanel.add(textfield2,c);
		
		//grouping one-bedroom and two-bedroom checkboxes
		group = new ButtonGroup();
		group.add(box1);
		group.add(box2);

		c.gridy = 30;
		c.gridx = 1;
		button1 = new JButton("SUBMIT");
		gridBagLayoutPanel.add(button1,c);
		c.gridy = 10;
		c.gridx = 1;
		textfield3 = new JTextField("HOW MANY?", 10);
		textfield3.setToolTipText("HOW MANY BOAT?(#)");
		gridBagLayoutPanel.add(textfield3,c);
		
		
		c.gridy = 60;
		c.gridx = 0;

		
		
		Image img = new ImageIcon(this.getClass().getResource("/m.jpg")).getImage();
		
		   JLabel icon = new JLabel("");
		   icon.setSize(5, 5);
		   icon.setIcon(new ImageIcon(img));
		   gridBagLayoutPanel.add(icon, c);
		
		
		
	}
	
	public void panelCenter(){
		
		panelCenter = new JPanel();
		panelCenter.setBackground(Color.pink);
		textarea = new JTextArea(19,28);
		textarea.setLineWrap(true);
		textarea.setBackground(Color.PINK);
		textarea.setFont(new Font("", Font.PLAIN,20));
		textarea.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
		
		panelCenter.add(textarea);
		
		
		
	}

	private class ListenForButton implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		int numOfSpace =0;
		if(e.getSource() == button1){
			try{
			fullName = textfield1.getText();
			nameInChar = fullName.toCharArray();
			for(int i =0; i< fullName.length(); i++){
				
				if(nameInChar[i] == ' '){
					numOfSpace++;
					
				}
				if(numOfSpace > 0){
					JOptionPane.showMessageDialog(Swing.this, "**Please enter fullname WITHOUT space**");
					System.exit(0);
				}
			}
			
			customer.setFullName(fullName);
			
			numOfBoat = Integer.parseInt(textfield3.getText());
			//customer.setNumOfBoat(numOfBoat);
			numOfWeek = Integer.parseInt(textfield2.getText());
			customer.setNumOfWeek(numOfWeek);
			date = Integer.parseInt(textfield4.getText());
			customer.setDate(date);
			
			if(numOfWeek <=0 || numOfBoat <=0){
				JOptionPane.showMessageDialog(Swing.this, "**It should be greater than 0**");
				System.exit(0);
			}
			}
			catch(NumberFormatException ex){
				
				JOptionPane.showMessageDialog(Swing.this,
				    "Error!",
				    "error message",
				    JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				
			}
			
			if(box1.isSelected()){
				
				//one cottage = $600
				customer.setOneBedroom(true);
				customer.setTwoBedroom(false);
				
				if(box3.isSelected()){
					customer.setNumOfBoat(true,numOfBoat);
				}else{
					customer.setNumOfBoat(false,numOfBoat);
				}
				
				
			}else if(box2.isSelected()){
				
				//two-bedroom cottage = $850
				customer.setOneBedroom(false);
				customer.setTwoBedroom(true);
				
				if(box3.isSelected()){
					customer.setNumOfBoat(true,numOfBoat);
				}else{
					customer.setNumOfBoat(false,numOfBoat);
				}
			}else{
				JOptionPane.showMessageDialog(Swing.this, "Please check at least one box", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}
			
			
			StringBuilder temp = new StringBuilder(" ");
			temp.append(customer.getInfo1());
			System.out.println(temp);
		}
		try {
			
		//	s1 = new StringBuilder(customer);
			customer.printInfo(textarea);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
	}
	
	}
	
	public void print(){
		

		
	}
	

}
