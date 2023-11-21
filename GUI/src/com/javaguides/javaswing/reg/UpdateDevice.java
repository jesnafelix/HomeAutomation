package com.javaguides.javaswing.reg;

import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Logger;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class UpdateDevice extends JFrame{

	
	private JTextField device;
	private JTextField id;
	private JTextField area;
	PreparedStatement pst= null;
	ResultSet rs = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDevice window = new UpdateDevice();
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
	public UpdateDevice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	public Connection getConnection()
	{
		Connection con;
		 try {
			 	Class.forName("com.mysql.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "2001");
		        return con;
		        
		 }catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	}
	private void initialize() {
		
		setBounds(100, 100, 812, 707);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(379, 140, 346, 379);
		getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		table.setBackground(new Color(176,196,222));
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = {"Device", "Device ID", "Device Area"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);;
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		
		
		JLabel lblNewLabel = new JLabel("DEVICE ");
		lblNewLabel.setBounds(34, 152, 100, 40);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDeviceId = new JLabel("DEVICE ID");
		lblDeviceId.setBounds(34, 217, 100, 40);
		getContentPane().add(lblDeviceId);
		
		JLabel lblDeviceArea = new JLabel("DEVICE AREA");
		lblDeviceArea.setBounds(34, 284, 100, 40);
		getContentPane().add(lblDeviceArea);
		
		device = new JTextField();
		device.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		device.setBounds(157, 162, 134, 20);
		getContentPane().add(device);
		device.setColumns(10);
		
		id = new JTextField();
		id.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		id.setColumns(10);
		id.setBounds(157, 227, 134, 20);
		getContentPane().add(id);
		
		area = new JTextField();
		area.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		area.setColumns(10);
		area.setBounds(157, 294, 134, 20);
		getContentPane().add(area);
		
		
		
		JButton u = new JButton("UPDATE");
		u.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				 try {
					 Class.forName("com.mysql.jdbc.Driver");
	                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "2001");

	                    String query = "update device_add set dname = ?,did = ?, darea = ? where device = ? ";
	                    PreparedStatement pstmt = con.prepareStatement(query);
	                    pstmt.setString(0, device.getName());
	                    pstmt.setString(1, id.getName());
	                    pstmt.setString(2, area.getName());
	                    
	                    pstmt.executeUpdate();
	                    JOptionPane.showMessageDialog(null, "Updated Successfully");
	                    con.close();
	                   
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                    JOptionPane.showMessageDialog(null, exception);
	                }
	            	
			}
		
	});
		u.setBounds(109, 443, 176, 60);
		getContentPane().add(u);
		
		JButton b2 = new JButton("Fetch");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 	Class.forName("com.mysql.jdbc.Driver");
				        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "2001");
				        pst=con.prepareStatement("select * from device_add");
				        rs = pst.executeQuery();
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
		
		b2.setBounds(516, 570, 89, 23);
		getContentPane().add(b2);
	}
}
