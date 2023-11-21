package exxx;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientConnect extends JFrame {
	
	ClientHandler ClientHandler=null;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientConnect frame = new ClientConnect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientConnect() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1347, 810);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.lightGray);

		setContentPane(contentPane);
		
		    JPanel p1=new JPanel(); 
		    p1.setPreferredSize(new Dimension(800,600));
		    
		    JPanel p2=new JPanel();  
		    JPanel p3=new JPanel();  
		 JTabbedPane tp=new JTabbedPane();  
		    tp.setBounds(50,50,200,200);  
		    tp.add("Connect",p1);  
		    
		    
		    JFrame frameObj; 
		    frameObj = new JFrame();  
		    // creating 9 buttons  
  
		
		    
		    
		    JPanel panel = new JPanel();
		    panel.setPreferredSize(new Dimension(300,200));
		    panel.setBackground(Color.black);
		    
		    JTextField IpTxt = new JTextField("");    
		    JTextField PortNoTxt = new JTextField("");    
		    JButton ConnectBtn = new JButton("Connect"); 
		    ConnectBtn.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		if(ClientHandler!=null)
		    		{
		    		}
		    		else
		    		{
		    			String Ip=IpTxt.getText();
		    			int Port=Integer.parseInt(PortNoTxt.getText());
		    			ClientHandler=new ClientHandler(Ip, Port);
		    			ClientHandler.connectionEstablished();
		    			if(ClientHandler.isConnected())
		    			{
		    				
		    				
		    			}
		    			else
		    			{
		    				
		    			}
		    			
		    		}
		    			
		    	}
		    });
		    JButton Disconnectbtn = new JButton("Disconnect");   
		    panel.add(IpTxt); 
		    panel.add(PortNoTxt); 
		    panel.add(ConnectBtn);  
		    panel.add(Disconnectbtn);    
		    panel.setLayout(new GridLayout(4,1));    
		    panel.setSize(300, 300);    
		    panel.setVisible(true);  
		    
		    p1.add(panel);
		    tp.add("Login",p2);  
		    tp.add("Home",p3);    
		    contentPane.add(tp);  
			contentPane.setBackground(Color.WHITE);
			
//			tp.setUI(new BasicTabbedPaneUI() {
//			    @Override
//			    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
//			        return 45; // manipulate this number however you please.
//			    }
//			});
		
		
	}

}


