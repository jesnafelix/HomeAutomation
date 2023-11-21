package com.javaguides.javaswing.reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class AreaNew {

	private JFrame frmArea;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaNew window = new AreaNew();
					window.frmArea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AreaNew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArea = new JFrame();
		frmArea.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmArea.setTitle("AREA");
		frmArea.setBounds(100, 100, 888, 707);
		frmArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArea.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 64, 743, 345);
		frmArea.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"AREA NAME", "AREA ID"
			}
		));
		
		JLabel lblNewLabel = new JLabel("AREA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(388, 11, 77, 56);
		frmArea.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("AREA ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(68, 456, 119, 33);
		frmArea.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("AREA NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(68, 510, 119, 33);
		frmArea.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("AREA TYPE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(68, 563, 140, 33);
		frmArea.getContentPane().add(lblNewLabel_3);
		
		btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(680, 440, 131, 37);
		frmArea.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(680, 590, 131, 37);
		frmArea.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(261, 464, 204, 20);
		frmArea.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(261, 518, 204, 20);
		frmArea.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(261, 570, 204, 22);
		frmArea.getContentPane().add(comboBox);
		
		btnNewButton_3 = new JButton("ADD");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBounds(680, 508, 131, 37);
		frmArea.getContentPane().add(btnNewButton_3);
	}

}
