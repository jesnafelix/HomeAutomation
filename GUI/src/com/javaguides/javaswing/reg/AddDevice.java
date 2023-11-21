package com.javaguides.javaswing.reg;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class AddDevice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField devname;
	private JTextField devid;
	private JTextField devarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDevice window = new AddDevice();
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
	public AddDevice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		setBounds(100, 100, 657, 431);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_3 = new JLabel("ADDING DEVICE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(182, 11, 265, 40);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("DEVICE AREA");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(83, 227, 166, 40);
		getContentPane().add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel = new JLabel("DEVICE NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(83, 80, 166, 40);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DEVICE ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(83, 155, 166, 40);
		getContentPane().add(lblNewLabel_1);
		
				
		devname = new JTextField();
		devname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		devname.setBounds(344, 80, 210, 40);
		getContentPane().add(devname);
		devname.setColumns(10);
		
		devid = new JTextField();
		devid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		devid.setColumns(10);
		devid.setBounds(344, 155, 210, 40);
		getContentPane().add(devid);
		
		devarea = new JTextField();
		devarea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		devarea.setColumns(10);
		devarea.setBounds(344, 227, 210, 40);
		getContentPane().add(devarea);
		

		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String devName = devname.getText();
				String devId = devid.getText();
				String devArea = devarea.getText();
				 try {
	                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "2001");
	                    Statement sta = con.createStatement();
	                    boolean b = sta.execute("INSERT INTO device_add values('" +devName+ "','" +devId+ "','" +devArea+ "')");

	                   
	                    if (!b) {
	                        JOptionPane.showMessageDialog(add, "Device added");
	                        
	                    } else {
	                        JOptionPane.showMessageDialog(add, "The device already exists");
	                        
	                    }
	                    devname.setText("");
						devid.setText("");
						devarea.setText("");
						
	                    con.close();
	                   
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
	            }
	        });
	
		add.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add.setBounds(219, 308, 166, 58);
		getContentPane().add(add);
		
		JButton btnNewButton_1 = new JButton("DB");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose();  
				DashBoard window2 = new DashBoard();
			       window2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(527, 330, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		
	}
}
