package com.javaguides.javaswing.reg;


import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.ListView;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.event.ListSelectionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LivingRoom extends JFrame{


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LivingRoom window = new LivingRoom();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LivingRoom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 915, 762);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIVING ROOM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 11, 881, 115);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(285, 139, 346, 379);
		getContentPane().add(scrollPane);
		
		
		JTable table = new JTable();
		table.setBackground(new Color(176,196,222));
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = {"Device", "Device ID", "Device Area"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);;
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton b2 = new JButton("Fetch");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 	Class.forName("com.mysql.jdbc.Driver");
				        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "2001");
				        PreparedStatement pst = con.prepareStatement("select * from device_add");
				        ResultSet rs = pst.executeQuery();
				        ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
				        int n=rsmd.getColumnCount();
				        DefaultTableModel dtm=(DefaultTableModel) table.getModel();
				        dtm.setRowCount(0);
				        while(rs.next()) {
				        	Vector v = new Vector();
				        	for(int i =1;i<=n;i++) {
				        		v.add(rs.getString("dname"));
				        		v.add(rs.getString("did"));
				        		v.add(rs.getString("darea"));
				        	}
				        	
				        	dtm.addRow(v);
				        	
				        }
				       

			}catch (Exception exception) {
                exception.printStackTrace();
			}}
	});
		b2.setBounds(410, 584, 89, 23);
		getContentPane().add(b2);
		
		
		
	
	}

}
