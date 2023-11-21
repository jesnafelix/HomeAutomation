package com.javaguides.javaswing.reg;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginUser extends JFrame{

	
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser window = new LoginUser();
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
	public LoginUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Login");
		setBounds(100, 100, 812, 711);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(80, 238, 246, 54);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN USER");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(262, 66, 258, 77);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPassword.setBounds(80, 373, 246, 54);
		getContentPane().add(lblPassword);
		
		user = new JTextField();
		user.setBounds(356, 238, 363, 54);
		getContentPane().add(user);
		user.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE A NEW USER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose();  
				UserRegistration window2 = new UserRegistration();
			       window2.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(96, 548, 324, 65);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo","root","2001");
					Statement stmt=con.createStatement();
					String sql= "Select * from account where user_name='"+user.getText()+"' and password='"+pass.getText()+"'";
					ResultSet rs= stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "WELCOME USER");
						setVisible(false);
				        dispose();
						DashBoard window3 = new DashBoard();
						window3.setVisible(true);
					}
						else {
						JOptionPane.showMessageDialog(null, "Incorrect username and Password");
						user.setText("");
						pass.setText("");
						}
					con.close();
				}catch(Exception e1) {System.out.print(e1);} 				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(527, 536, 192, 89);
		getContentPane().add(btnNewButton_1);
		
		pass = new JPasswordField();
		pass.setBounds(356, 371, 363, 56);
		getContentPane().add(pass);
	}

	
}
