package com.javaguides.javaswing.reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartPage extends JFrame {
	public StartPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\clift\\Downloads\\smart home.jpg"));
		setTitle("HOME AUTOMATION");
		setBounds(0,0,1000, 676);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				LoginUser window1 = new LoginUser();
				window1.setVisible(true);
				
			
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\clift\\Desktop\\Project 3050 - 2023\\GUI\\Icons\\Power-icon.png"));
		btnNewButton.setBounds(470, 257, 73, 75);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\clift\\Downloads\\side-view-hand-with-smartphone-smart-light.jpg"));
		lblNewLabel.setBounds(0, 0, 986, 639);
		getContentPane().add(lblNewLabel);
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage frame = new StartPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

