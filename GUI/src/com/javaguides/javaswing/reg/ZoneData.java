package com.javaguides.javaswing.reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ZoneData extends JFrame{

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZoneData window = new ZoneData();
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
	public ZoneData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 869, 684);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 847, 127);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setBounds(181, 25, 430, 69);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		
		JButton btnNewButton = new JButton("LIVING ROOM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose();  
				LivingRoom window2 = new LivingRoom();
			       window2.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.setBounds(25, 211, 188, 295);
		getContentPane().add(btnNewButton);
		
		JButton btnBedRoom = new JButton("BED ROOM");
		btnBedRoom.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnBedRoom.setBounds(330, 211, 188, 295);
		getContentPane().add(btnBedRoom);
		
		JButton btnKitchen = new JButton("KITCHEN");
		btnKitchen.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnKitchen.setBounds(634, 211, 188, 295);
		getContentPane().add(btnKitchen);
		
		JButton btnNewButton_1 = new JButton("DASHBOARD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose();  
				DashBoard window2 = new DashBoard();
			       window2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(685, 591, 132, 32);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADD DEVICE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        dispose();  
				AddDevice window2 = new AddDevice();
			       window2.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(330, 558, 188, 32);
		getContentPane().add(btnNewButton_2);
	}
}
