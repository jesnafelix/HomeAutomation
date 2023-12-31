package exxx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;

public class Page1Gui extends JFrame{


private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;




/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Page1Gui window = new Page1Gui();
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
public Page1Gui() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
getContentPane().addContainerListener(new ContainerAdapter() {
@Override
public void componentAdded(ContainerEvent e) {
}
});
setTitle("SMART HOME AUTOMATION");
setBounds(100, 100, 897, 714);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(new Color(192, 192, 192));
panel.setBounds(10, 125, 171, 541);
getContentPane().add(panel);
panel.setLayout(null);

JButton btnNewButton_1 = new JButton("Login");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JTabbedPane jTabbedPane = new JTabbedPane();
jTabbedPane.setSelectedIndex(0);
}
});
btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));
btnNewButton_1.setBounds(43, 29, 89, 23);
panel.add(btnNewButton_1);

JButton btnNewButton_1_1 = new JButton("Device");
btnNewButton_1_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JTabbedPane jTabbedPane = new JTabbedPane();
jTabbedPane.setSelectedIndex(1);
}
});
btnNewButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
btnNewButton_1_1.setBounds(32, 92, 110, 23);
panel.add(btnNewButton_1_1);

JButton btnNewButton_1_2 = new JButton("Area");
btnNewButton_1_2.setFont(new Font("Dialog", Font.PLAIN, 20));
btnNewButton_1_2.setBounds(43, 161, 89, 23);
panel.add(btnNewButton_1_2);

JButton btnNewButton_1_4 = new JButton("Logout");
btnNewButton_1_4.setFont(new Font("Dialog", Font.PLAIN, 20));
btnNewButton_1_4.setBounds(32, 309, 110, 23);
panel.add(btnNewButton_1_4);

JButton btnNewButton_1_2_1 = new JButton("User");
btnNewButton_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
btnNewButton_1_2_1.setBounds(43, 233, 89, 23);
panel.add(btnNewButton_1_2_1);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(128, 128, 128));
panel_1.setBounds(10, 11, 863, 103);
getContentPane().add(panel_1);
panel_1.setLayout(null);

textField = new JTextField();
textField.setBounds(161, 0, 181, 43);
panel_1.add(textField);
textField.setFont(new Font("Dialog", Font.PLAIN, 20));
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setBounds(493, 0, 181, 43);
panel_1.add(textField_1);
textField_1.setFont(new Font("Dialog", Font.PLAIN, 20));
textField_1.setColumns(10);

JLabel lblNewLabel = new JLabel("IP Address");
lblNewLabel.setBounds(59, 7, 101, 29);
panel_1.add(lblNewLabel);
lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));

JLabel lblPortNumber = new JLabel("Port Number");
lblPortNumber.setBounds(362, 7, 124, 29);
panel_1.add(lblPortNumber);
lblPortNumber.setFont(new Font("Dialog", Font.PLAIN, 20));

JButton btnNewButton = new JButton("CONNECT");
btnNewButton.setBounds(478, 67, 138, 29);
panel_1.add(btnNewButton);
btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));

JButton btnDisconnect = new JButton("DISCONNECT");
btnDisconnect.setBounds(647, 67, 175, 29);
panel_1.add(btnDisconnect);
btnDisconnect.setFont(new Font("Dialog", Font.PLAIN, 20));

textField_2 = new JTextField();
textField_2.setBounds(36, 54, 219, 37);
panel_1.add(textField_2);
textField_2.setFont(new Font("Dialog", Font.PLAIN, 20));
textField_2.setColumns(10);

JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setBounds(191, 126, 682, 540);
getContentPane().add(tabbedPane);

JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.addTab("Login", null, tabbedPane_1, null);

JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.addTab("Device", null, tabbedPane_2, null);

JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.addTab("Area", null, tabbedPane_3, null);

JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.addTab("User", null, tabbedPane_4, null);
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
}
}