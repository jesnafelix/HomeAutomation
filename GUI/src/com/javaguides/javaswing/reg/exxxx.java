package com.javaguides.javaswing.reg;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class exxxx {
   public exxxx() {
      setTitle("MultiPanel Test");
      setSize(849, 672);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      getContentPane().setLayout(null);
      
      JList list = new JList();
      list.setBounds(390, 142, 316, 323);
      getContentPane().add(list);
      
      JButton btnNewButton = new JButton("CLICK");
      btnNewButton.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  DefaultListModel DLM= new DefaultListModel();
    		 
    		  list.setModel(DLM);
    		  DLM.addElement("Mark");
    		  DLM.addElement("Jesna");
    		  DLM.addElement("Clifton");
    		  DLM.addElement("Alex");
      	}
      });
      btnNewButton.setBounds(79, 241, 89, 23);
      getContentPane().add(btnNewButton);
      setVisible(true);
   }
   private void setLocationRelativeTo(Object object) {
	// TODO Auto-generated method stub
	
}
private JFrame getContentPane() {
	// TODO Auto-generated method stub
	return null;
}
private void setDefaultCloseOperation(int exitOnClose) {
	// TODO Auto-generated method stub
	
}
private void setSize(int i, int j) {
	// TODO Auto-generated method stub
	
}
private void setTitle(String string) {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
      new exxxx();
   }
}