package com.javaguides.javaswing.reg;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class example extends JFrame {
   public example() {
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
   public static void main(String[] args) {
      new example();
   }
}