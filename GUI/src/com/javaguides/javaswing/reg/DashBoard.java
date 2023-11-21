package com.javaguides.javaswing.reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DashBoard extends JFrame{


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
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
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setTitle("Dash Board");
		setBounds(100, 100, 1116, 740);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO THE DASHBOARD, ADMIN!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 1082, 146);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ZONE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose();  
				ZoneData window2 = new ZoneData();
			       window2.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(396, 286, 308, 131);
		getContentPane().add(btnNewButton);
		
//		JButton device = new JButton("MANAGE DEVICES");
//		device.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				setVisible(false);
//				dispose();
//				ManageDevice window2= new ManageDevice();
//				window2.setVisible(true);
//				
//				
//			}
//		});
//		device.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		device.setBounds(181, 253, 255, 124);
//		getContentPane().add(device);
//		
//		JButton scenario = new JButton("MANAGE SCENARIO");
//		scenario.setFont(new Font("Tahoma", Font.PLAIN, 22));
//		scenario.setBounds(667, 253, 255, 124);
//		getContentPane().add(scenario);
//		
//		JButton report = new JButton("REPORTING");
//		report.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		report.setBounds(181, 430, 255, 124);
//		getContentPane().add(report);
//		
//		JButton weather = new JButton("GETWEATHER");
//		weather.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		weather.setBounds(667, 430, 255, 124);
//		getContentPane().add(weather);
//		
		JButton logout = new JButton("LOG OUT");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose(); 
				LoginUser window2= new LoginUser();
				window2.setVisible(true);
			}
		});
		logout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		logout.setBounds(1003, 650, 89, 23);
		getContentPane().add(logout);
		
		JButton btnNewButton_1 = new JButton("CREATE A USER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
						setVisible(false);
				        dispose();  
						UserRegistration window2 = new UserRegistration();
					       window2.setVisible(true);
			}
				});
				btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton_1.setBounds(453, 538, 205, 53);
				getContentPane().add(btnNewButton_1);
		
		
	}
}
