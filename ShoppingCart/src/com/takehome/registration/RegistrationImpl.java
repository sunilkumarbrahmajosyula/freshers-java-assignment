package com.takehome.registration;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class RegistrationImpl extends JFrame implements ActionListener{
	
	JComboBox<String> box;
	JLabel lb;
	private static final long serialVersionUID = 1L;
	private String name,address,lightorheavyshooper,emailId,phoneNumber;
	private JFrame f=new JFrame("Add Customer Detatils ");
	private JTextField Name1=new JTextField(30);
	private JTextField Lightorheavyshooper1=new JTextField(22);
	private JTextField Address1=new JTextField(28);
	private JTextField EmailId1=new JTextField(28);
	private JTextField Phonenumber1=new JTextField(20);
	private JButton submit=new JButton("Add Customer");
    private JButton open =new JButton("open details");
public RegistrationImpl(){
    f.setLayout(new BorderLayout());
	JPanel p=new JPanel();
	p.setLayout(new FlowLayout());
	p.add(new JLabel("Name:"));
    p.add(Name1);
    p.add(new JLabel("Lightorheavyshooper:"));
    p.add(Lightorheavyshooper1);
    p.add(new JLabel("Address:"));
	p.add(Address1);
	p.add(new JLabel("EmailId:"));
	p.add(EmailId1);
	p.add(new JLabel("phonenuumber:"));
	p.add(Phonenumber1);
	f.add(p,BorderLayout.CENTER);
	JPanel P1=new JPanel();
	P1.setLayout(new FlowLayout());
		P1.add(submit);
		P1.add(open);
		submit.addActionListener(this);
		open.addActionListener(this);
		f.add(P1,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setSize(400,200);
	}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==submit){
		name=("");
		emailId=("");
		address=("");
		phoneNumber=("");
		lightorheavyshooper=("");
				
		name=Name1.getText().trim();
		lightorheavyshooper=Lightorheavyshooper1.getText().trim();
		emailId=EmailId1.getText().trim();
		address=Address1.getText().trim();
		phoneNumber=Phonenumber1.getText().trim();
	
	try{
		 
		   
		BufferedWriter reader=new BufferedWriter(new FileWriter(new File("d:/file.txt"),true));
	reader.write(name+"\t"+"||"+"\t");
	reader.write(lightorheavyshooper+"\t"+"||"+"\t");
	reader.write(emailId+"\t"+"||"+"\t");
	reader.write(address+"\t"+"||"+"\t");
	reader.write(phoneNumber+"\t"+"||"+"\t");
	reader.newLine();
	reader.close();
	System.out.println("done");
	}
	catch(IOException e1){
		System.out.println("error due to"+e1);
	}
	
	
	}
	if(e.getSource()==open )
	{
		JFileChooser chooser=new JFileChooser("d:/file.txt");
		int x=chooser.showOpenDialog(null);
		if(x==JFileChooser.APPROVE_OPTION){
			File file=chooser.getSelectedFile();
			try{
				Desktop.getDesktop().open(file);
				}
			catch(IOException e2)
			{
				System.out.println("failed");
			}
			}
	}
}

public static void main(String[] args) {
	new RegistrationImpl();
}
}


