package Module;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class airline {

	
	private static final String String = null;
	JPanel Loginpage,Homepage,Registrationpage,Searchcustomerpage,Add_Flight_Details,Search_Flight,Ticket,Payment,Cancel_ticket,Book_Flight;
	JLabel lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_56, lblNewLabel_96;
	JComboBox comboBox,comboBox_1,comboBox_2,comboBox_3,comboBox_4,comboBox_5,comboBox_6;
	JSpinner spinner;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTable table;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_49;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_24;
	private JTextField textField_25;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					airline window = new airline();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public airline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1477, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		Loginpage = new JPanel();
		Loginpage.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Loginpage, "name_1087366859023700");
		Loginpage.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel.setBounds(670, 22, 267, 53);
		Loginpage.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_1.setBounds(763, 100, 71, 53);
		Loginpage.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Air India Express Airline");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel_2.setBounds(460, 163, 694, 69);
		Loginpage.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Enter Username :->");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(76, 319, 413, 42);
		Loginpage.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField.setBounds(640, 319, 722, 42);
		Loginpage.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Enter Password :->");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_4.setBounds(76, 448, 413, 42);
		Loginpage.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u = null,p = null;
					String user = textField.getText().toString();
					String pass = passwordField.getText().toString();
					
					//Load and Register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Get Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");
					
					//Create statement
					Statement stmt = con.createStatement();
					
					//Get all Record into
					ResultSet rs = stmt.executeQuery("select * from login");
					while(rs.next())
					{
						u=rs.getString(1);
						p=rs.getString(2);
					} 
					
					if(user.equals(u) && pass.equals(p))
					{
						Loginpage.setVisible(false);
						Homepage.setVisible(true);
					}
					else
					{
						lblNewLabel_5.setText("Invalid user!");
					}
					con.close();
					
				}
				catch(Exception d)
				{
					System.out.println(d);
				}
				
				
				
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setBounds(763, 623, 160, 53);
		Loginpage.add(btnNewButton);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(776, 578, 181, 35);
		Loginpage.add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 31));
		passwordField.setBounds(640, 448, 722, 42);
		Loginpage.add(passwordField);
		
	    Homepage = new JPanel();
	    Homepage.setBackground(new Color(236, 174, 140));
		frame.getContentPane().add(Homepage, "name_1087378162914300");
		Homepage.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(192, 192, 192));
		menuBar.setBounds(10, 10, 1433, 54);
		Homepage.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Customer");
		mnNewMenu.setForeground(new Color(64, 0, 64));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 30));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Customer");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		           Homepage.setVisible(false);
		           Registrationpage.setVisible(true);
				
			}
		});
		mntmNewMenuItem.setForeground(new Color(64, 0, 64));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Search Customer");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage.setVisible(false);
				Searchcustomerpage.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setForeground(new Color(64, 0, 64));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Flight");
		mnNewMenu_1.setForeground(new Color(64, 0, 64));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Add Flight");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage.setVisible(false);
				Add_Flight_Details.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setForeground(new Color(64, 0, 64));
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Search Flight");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage.setVisible(false);
				Search_Flight.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		mntmNewMenuItem_3.setForeground(new Color(0, 0, 0));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Book Flight");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     Homepage.setVisible(false);
			     Book_Flight.setVisible(true);
			     
			}
		});
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_2 = new JMenu("Ticket");
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Get Ticket");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage.setVisible(false);
				Ticket.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Cancel Ticket");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage.setVisible(false);
				Cancel_ticket.setVisible(true);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_4 = new JMenu("Payment");
		mnNewMenu_4.setForeground(new Color(0, 0, 0));
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 30));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Payment reciept");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage.setVisible(false);
				Payment.setVisible(true);
				
			}
		});
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		mnNewMenu_4.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_5 = new JMenu("Others");
		mnNewMenu_5.setForeground(new Color(0, 0, 0));
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 30));
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		mnNewMenu_3.setForeground(Color.BLACK);
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 30));
		menuBar.add(mnNewMenu_3);
		
	    lblNewLabel_96 = new JLabel("");
	    lblNewLabel_96.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    lblNewLabel_96.setIcon(new ImageIcon("C:\\Users\\chaha\\Downloads\\ai-generated-8635794_1280.jpg"));
		
		lblNewLabel_96.setBounds(118, 63, 1280, 669);
		Homepage.add(lblNewLabel_96);
		
	    Registrationpage = new JPanel();
	    Registrationpage.setBackground(SystemColor.control);
		frame.getContentPane().add(Registrationpage, "name_1087385983096299");
		Registrationpage.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Registration details");
		lblNewLabel_6.setBackground(new Color(255, 128, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel_6.setBounds(505, 10, 559, 73);
		Registrationpage.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrationpage.setVisible(false);
				Homepage.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnNewButton_1.setBounds(981, 686, 147, 32);
		Registrationpage.add(btnNewButton_1);
		
	    class generateCId{
		public static String generateCustomerId()
		{
			String newId = "CS0001";
			try
			{
				//Load and register the driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Get the Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select max(id) from registration_details");
				if(rs.next())
				{
					String lastId = rs.getString(1);
					if(lastId!=null)
					{
						int num = Integer.parseInt(lastId.substring(2))+1;
						newId = String.format("CS%04d",num);
					}
				}
				con.close();
			}
			catch(Exception g)
			{
				System.out.println(g);
			}
			return newId;
		}
		}
		JLabel lblNewLabel_13 = new JLabel("Customer Id");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_13.setBounds(42, 99, 266, 32);
		Registrationpage.add(lblNewLabel_13);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setBounds(42, 136, 623, 32);
		Registrationpage.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(generateCId.generateCustomerId());
		
		JLabel lblNewLabel_14 = new JLabel("Customer name ");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_14.setBounds(42, 200, 298, 32);
		Registrationpage.add(lblNewLabel_14);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setBounds(42, 235, 623, 32);
		Registrationpage.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Father's name");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_15.setBounds(42, 321, 282, 32);
		Registrationpage.add(lblNewLabel_15);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setBounds(42, 357, 623, 32);
		Registrationpage.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Address ");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_16.setBounds(42, 439, 298, 32);
		Registrationpage.add(lblNewLabel_16);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setBounds(42, 481, 623, 32);
		Registrationpage.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Contact number ");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_17.setBounds(810, 99, 312, 32);
		Registrationpage.add(lblNewLabel_17);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setBounds(810, 136, 623, 32);
		Registrationpage.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Email Id");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_18.setBounds(810, 321, 312, 32);
		Registrationpage.add(lblNewLabel_18);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_7.setBounds(810, 357, 623, 32);
		Registrationpage.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Aadhar number ");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_19.setBounds(810, 203, 312, 26);
		Registrationpage.add(lblNewLabel_19);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_8.setBounds(810, 235, 623, 32);
		Registrationpage.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Gender");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_20.setBounds(810, 564, 312, 32);
		Registrationpage.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Date of Birth");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_21.setBounds(810, 442, 298, 26);
		Registrationpage.add(lblNewLabel_21);
		
		JButton btnNewButton_8 = new JButton("Submit");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String id = textField_2.getText().toString();
					String name = textField_3.getText().toString();
					String fname = textField_4.getText().toString();
		            String address = textField_5.getText().toString();
		            String prn = textField_9.getText().toString();
					String phone = textField_6.getText().toString();
					String aadhar = textField_8.getText().toString();
					String email = textField_7.getText().toString();
					String dob = textField_10.getText().toString();
					String gender = textField_67.getText().toString();
					
					//Load and register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Get the Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");
					Statement stmt = con.createStatement();
			        String query = "insert into registration_details(id,name,fname,address,phone,email,aadhar,gender,dob,prn)values('"+id+"','"+name+"','"+fname+"','"+address+"','"+phone+"','"+email+"','"+aadhar+"','"+gender+"','"+dob+"','"+prn+"')";
			        
			        long res = stmt.executeUpdate(query);
			        
			        if(res>0)
			        {
			        	JOptionPane.showMessageDialog(null,"Data saved Successfully!");
			        }
			        else
			        {
			        	JOptionPane.showMessageDialog(null,"Some Query Problems!");
			        }
		            con.close();
				}
			catch(Exception ex)
				{
				 System.out.println(ex);
				}
			}
		});
		btnNewButton_8.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton_8.setBounds(243, 688, 142, 33);
		Registrationpage.add(btnNewButton_8);
		
		JLabel lblNewLabel_93 = new JLabel("Passport Number");
		lblNewLabel_93.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_93.setBounds(42, 564, 333, 32);
		Registrationpage.add(lblNewLabel_93);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_9.setBounds(42, 606, 623, 35);
		Registrationpage.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_10.setBounds(810, 481, 623, 32);
		Registrationpage.add(textField_10);
		textField_10.setColumns(10);
		
		textField_67 = new JTextField();
		textField_67.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_67.setBounds(810, 606, 623, 32);
		Registrationpage.add(textField_67);
		textField_67.setColumns(10);
		
	    Searchcustomerpage = new JPanel();
		frame.getContentPane().add(Searchcustomerpage, "name_1087391043782900");
		Searchcustomerpage.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Search Customer details");
		lblNewLabel_7.setBackground(new Color(255, 255, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel_7.setBounds(480, 10, 568, 49);
		Searchcustomerpage.add(lblNewLabel_7);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Searchcustomerpage.setVisible(false);
				Homepage.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_2.setBounds(1257, 106, 145, 33);
		Searchcustomerpage.add(btnNewButton_2);
		
		JLabel lblNewLabel_23 = new JLabel("Enter Customer Id :->\r\n");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_23.setBounds(20, 108, 308, 33);
		Searchcustomerpage.add(lblNewLabel_23);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_11.setBounds(352, 108, 317, 35);
		Searchcustomerpage.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("Search");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					//Load and register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
				
					//Get the Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");	
					
					Statement stmt = con.createStatement();
					
					String  id=textField_11.getText().toString();
					
					//Read whole record from database
					ResultSet rs = stmt.executeQuery("select * from registration_details where id='"+id+"'"); 
		
					String i = "";
					String name="";
					String fname="";
					String address="";
					String phone="";
					String email="";
					String aadhar="";
					String gender="";
					String dob = "";
					String prn = "";
					
					while(rs.next())
					{
						
						i=rs.getString(1);
						name=rs.getString(2);
						fname=rs.getString(3);
						address=rs.getString(4);
						phone=rs.getString(5);
						email=rs.getString(6);
						aadhar=rs.getString(7);
						gender=rs.getString(8);
						dob=rs.getString(9);
						prn=rs.getString(10);
					}
					
					if(id.equals(i))
					{
					textField_12.setText(""+i);
					textField_13.setText(""+name);
					textField_14.setText(""+fname);
					textField_15.setText(""+address);
					textField_16.setText(""+phone);
					textField_17.setText(""+email);
					textField_18.setText(""+aadhar);
					textField_19.setText(""+gender);
					textField_20.setText(""+dob);
					textField_68.setText(""+prn);
					}
					else
					{
						JOptionPane.showMessageDialog(null,textField_11.getText().toString()+" is Invalid Customer Id.");
					}
					
				}
				catch(Exception x)
				{
					System.out.println(x);
				}
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9.setBounds(1011, 107, 128, 35);
		Searchcustomerpage.add(btnNewButton_9);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 0, 255));
		desktopPane.setBounds(10, 172, 1443, 550);
		Searchcustomerpage.add(desktopPane);
		
		JLabel lblNewLabel_25 = new JLabel("Customer Id :->");
		lblNewLabel_25.setForeground(new Color(255, 255, 255));
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_25.setBounds(29, 56, 254, 37);
		desktopPane.add(lblNewLabel_25);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_12.setBounds(336, 56, 423, 34);
		desktopPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Customer name :->");
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_26.setBounds(27, 148, 315, 37);
		desktopPane.add(lblNewLabel_26);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_13.setBounds(336, 153, 423, 31);
		desktopPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Father's name :->");
		lblNewLabel_27.setForeground(new Color(255, 255, 255));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_27.setBounds(30, 249, 296, 37);
		desktopPane.add(lblNewLabel_27);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_14.setBounds(336, 253, 423, 32);
		desktopPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Address :->");
		lblNewLabel_28.setForeground(new Color(255, 255, 255));
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_28.setBounds(27, 351, 296, 27);
		desktopPane.add(lblNewLabel_28);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_15.setBounds(336, 349, 423, 31);
		desktopPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Contact number :->");
		lblNewLabel_29.setForeground(new Color(255, 255, 255));
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_29.setBounds(27, 441, 315, 37);
		desktopPane.add(lblNewLabel_29);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_16.setBounds(336, 441, 423, 34);
		desktopPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("Email_id :->");
		lblNewLabel_30.setForeground(new Color(255, 255, 255));
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_30.setBounds(798, 56, 204, 27);
		desktopPane.add(lblNewLabel_30);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_17.setBounds(1038, 46, 395, 37);
		desktopPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Aadhar No. :->");
		lblNewLabel_31.setForeground(new Color(255, 255, 255));
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_31.setBounds(798, 152, 243, 29);
		desktopPane.add(lblNewLabel_31);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_18.setBounds(1038, 151, 395, 34);
		desktopPane.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("Gender :->");
		lblNewLabel_32.setForeground(new Color(255, 255, 255));
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_32.setBounds(798, 351, 224, 27);
		desktopPane.add(lblNewLabel_32);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_19.setBounds(1038, 349, 390, 31);
		desktopPane.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("DOB :->");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_33.setForeground(new Color(255, 255, 255));
		lblNewLabel_33.setBounds(798, 446, 204, 27);
		desktopPane.add(lblNewLabel_33);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_20.setBounds(1038, 441, 395, 34);
		desktopPane.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_94 = new JLabel("Passport No :->");
		lblNewLabel_94.setForeground(new Color(255, 255, 255));
		lblNewLabel_94.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_94.setBounds(798, 249, 269, 37);
		desktopPane.add(lblNewLabel_94);
		
		textField_68 = new JTextField();
		textField_68.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_68.setBounds(1038, 249, 395, 34);
		desktopPane.add(textField_68);
		textField_68.setColumns(10);
		
	    Add_Flight_Details = new JPanel();
		frame.getContentPane().add(Add_Flight_Details, "name_1087423151522500");
		Add_Flight_Details.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel(" Add Flight Details");
		lblNewLabel_8.setBackground(new Color(0, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_8.setBounds(534, 10, 493, 61);
		Add_Flight_Details.add(lblNewLabel_8);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(0, 0, 255));
		desktopPane_1.setBounds(41, 104, 673, 574);
		Add_Flight_Details.add(desktopPane_1);
		
	    class generateFId{
		public static String generateFlightId()
		{
			String newId = "FL0001";
			try
			{
				//Load and register the driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Get the Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select max(id) from flight_details;");
				if(rs.next())
				{
					String lastId = rs.getString(1);
					if(lastId!=null)
					{
						int num = Integer.parseInt(lastId.substring(2))+1;
						newId = String.format("FL%04d",num);
					}
				}
				con.close();
			}
			catch(Exception g)
			{
				System.out.println(g);
			}
			return newId;
		}
		}
	
		JLabel lblNewLabel_34 = new JLabel("Flight Id :->");
		lblNewLabel_34.setForeground(new Color(255, 255, 255));
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_34.setBounds(29, 60, 186, 37);
		desktopPane_1.add(lblNewLabel_34);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_21.setBounds(293, 60, 350, 37);
		desktopPane_1.add(textField_21);
		textField_21.setColumns(10);
		textField_21.setText(generateFId.generateFlightId());
		
		JLabel lblNewLabel_35 = new JLabel("Flight name :->");
		lblNewLabel_35.setForeground(new Color(255, 255, 255));
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_35.setBounds(29, 160, 244, 37);
		desktopPane_1.add(lblNewLabel_35);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_22.setBounds(293, 160, 350, 37);
		desktopPane_1.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_36 = new JLabel("Seats :->");
		lblNewLabel_36.setForeground(new Color(255, 255, 255));
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_36.setBounds(29, 260, 178, 37);
		desktopPane_1.add(lblNewLabel_36);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_23.setBounds(293, 260, 350, 37);
		desktopPane_1.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("Source :->");
		lblNewLabel_37.setForeground(new Color(255, 255, 255));
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_37.setBounds(31, 360, 212, 31);
		desktopPane_1.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Destination :->");
		lblNewLabel_38.setForeground(new Color(255, 255, 255));
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_38.setBounds(29, 457, 244, 31);
		desktopPane_1.add(lblNewLabel_38);
		
		comboBox_5 = new JComboBox();
		comboBox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
	    		{
	    			if(comboBox.getSelectedItem().toString().equals("Choose source"));
	    			{
						JOptionPane.showMessageDialog(null,comboBox.getSelectedItem().toString()+" is Selected!");
	    			}
	    		}
			}
		});
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Choose source", "Delhi", "Mumbai", "Pune", "Kolkata", "Lucknow", "Kanpur", "Surat", "Srinagar", "Mysore", "Chennai", "Kerala", "Noida", "Indore", "Bhopal"}));
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_5.setBounds(293, 354, 350, 37);
		desktopPane_1.add(comboBox_5);
	
		comboBox_6 = new JComboBox();
		comboBox_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent f)
			{
					if(f.getStateChange()==ItemEvent.SELECTED)
		    		{
		    			if(comboBox.getSelectedItem().toString().equals("Choose destination"));
		    			{
							JOptionPane.showMessageDialog(null,comboBox.getSelectedItem().toString()+" is Selected!");
		    			}
		    		}
		    }
		});
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Choose destination", "Delhi", "Mumbai", "Pune", "Kolkata", "Lucknow", "Kanpur", "Surat", "Srinagar", "Mysore", "Chennai", "Kerala", "Noida", "Indore", "Bhopal"}));
		comboBox_6.setBounds(293, 451, 350, 37);
		desktopPane_1.add(comboBox_6);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(new Color(0, 0, 255));
		desktopPane_2.setForeground(new Color(255, 255, 255));
		desktopPane_2.setBounds(751, 104, 680, 574);
		Add_Flight_Details.add(desktopPane_2);
		
		JLabel lblNewLabel_39 = new JLabel("Arrival :->");
		lblNewLabel_39.setForeground(new Color(255, 255, 255));
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_39.setBounds(29, 66, 198, 30);
		desktopPane_2.add(lblNewLabel_39);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_26.setBounds(297, 66, 358, 30);
		desktopPane_2.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_40 = new JLabel("Departure :->");
		lblNewLabel_40.setForeground(new Color(255, 255, 255));
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_40.setBounds(29, 164, 223, 30);
		desktopPane_2.add(lblNewLabel_40);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_27.setBounds(297, 164, 358, 30);
		desktopPane_2.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("Duration :->");
		lblNewLabel_41.setForeground(new Color(255, 255, 255));
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_41.setBounds(29, 264, 223, 30);
		desktopPane_2.add(lblNewLabel_41);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_28.setBounds(297, 264, 358, 30);
		desktopPane_2.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_42 = new JLabel("Fare :->");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_42.setForeground(new Color(255, 255, 255));
		lblNewLabel_42.setBounds(29, 367, 223, 30);
		desktopPane_2.add(lblNewLabel_42);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_29.setBounds(297, 367, 358, 30);
		desktopPane_2.add(textField_29);
		textField_29.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Cancel");
		btnNewButton_3.setBounds(499, 531, 137, 33);
		desktopPane_2.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Flight_Details.setVisible(false);
				Homepage.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton btnNewButton_10 = new JButton("Add");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String id = textField_21.getText().toString();
					String name = textField_22.getText().toString();
					String seat = textField_23.getText().toString();
					String source = comboBox_5.getSelectedItem().toString();
					String destination = comboBox_6.getSelectedItem().toString();
					String arrival = textField_26.getText().toString();
					String departure = textField_27.getText().toString();
					String duration = textField_28.getText().toString();
					String fare = textField_29.getText().toString();
					String dof = textField_30.getText().toString();
					
					//Load and register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Get the Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");
					Statement stmt = con.createStatement();
					
					String query = "insert into Flight_details(id,name,seat,source,destination,arrival,departure,duration,fare,dof)values('"+id+"','"+name+"','"+seat+"','"+source+"','"+destination+"','"+arrival+"','"+departure+"','"+duration+"','"+fare+"','"+dof+"')";
				    long res = stmt.executeUpdate(query);
				    if(res>0)
			        {
			        	JOptionPane.showMessageDialog(null,"Data Saved Successfully");
			        }
			        else
			        {
			        	JOptionPane.showMessageDialog(null,"Some Query Problem");
			        }
		            con.close();			
      			}
				catch(Exception x)
				{
					System.out.println(x);
				}
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_10.setBounds(39, 531, 129, 33);
		desktopPane_2.add(btnNewButton_10);
		
		JLabel lblNewLabel_43 = new JLabel("Date of Flight:->");
		lblNewLabel_43.setForeground(new Color(255, 255, 255));
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_43.setBounds(29, 453, 261, 33);
		desktopPane_2.add(lblNewLabel_43);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_30.setBounds(297, 453, 358, 33);
		desktopPane_2.add(textField_30);
		textField_30.setColumns(10);
		
		lblNewLabel_56 = new JLabel("");
		lblNewLabel_56.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_56.setBounds(614, 688, 221, 34);
		Add_Flight_Details.add(lblNewLabel_56);
		
	    Search_Flight = new JPanel();
		frame.getContentPane().add(Search_Flight, "name_1087458068882800");
		Search_Flight.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Search Flights");
		lblNewLabel_9.setBackground(new Color(255, 128, 0));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblNewLabel_9.setBounds(584, 10, 322, 54);
		Search_Flight.add(lblNewLabel_9);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(new Color(255, 0, 128));
		desktopPane_3.setBounds(10, 74, 1443, 130);
		Search_Flight.add(desktopPane_3);
		
		JLabel lblNewLabel_44 = new JLabel("Enter Source:->");
		lblNewLabel_44.setBounds(10, 10, 251, 35);
		desktopPane_3.add(lblNewLabel_44);
		lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_45 = new JLabel("Enter Destination :->");
		lblNewLabel_45.setBounds(10, 73, 341, 35);
		desktopPane_3.add(lblNewLabel_45);
		lblNewLabel_45.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setBackground(new Color(255, 0, 0));
		btnNewButton_4.setBounds(1230, 45, 137, 35);
		desktopPane_3.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Search_Flight.setVisible(false);
				Homepage.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton btnNewButton_11 = new JButton("Search");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					//Load and register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
				
					//Get the Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");	
					
					Statement stmt = con.createStatement();
					
					String a = comboBox_3.getSelectedItem().toString();
					String b = comboBox_4.getSelectedItem().toString();
					
					ResultSet rs = stmt.executeQuery("select * from flight_details where source='" + a + "'AND destination='"+ b +"'"); 
					
					String id = "";
					String name = "";
					String seat = "";
					String src = "";
					String des= "";
					String arr = "";
					String dpt = "";
					String dur = "";
					String fare = "";
					String dof = "";
					
					while(rs.next())
					{
						id = rs.getString(1);
						name = rs.getString(2);
						seat = rs.getString(3);
						src = rs.getString(4);
						des = rs.getString(5);
						arr = rs.getString(6);
						dpt = rs.getString(7);
						dur = rs.getString(8);
						fare = rs.getString(9);
						dof = rs.getString(10);
						
					}
					if(a.equals(src) && b.equals(des))
					{
					textField_33.setText(""+id);
					textField_34.setText(""+name);
					textField_35.setText(""+seat);
					textField_36.setText(""+src);
					textField_37.setText(""+des);
					textField_38.setText(""+arr);
					textField_39.setText(""+dpt);
					textField_40.setText(""+dur);
					textField_41.setText(""+fare);
					textField_42.setText(""+dof);
       				}
					else
					{
				       JOptionPane.showMessageDialog(null,"Flight not available for this route!");
					}
     			}
				catch(Exception x)
				{
					System.out.println(x);
				}
			}
		});
		btnNewButton_11.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_11.setBounds(988, 46, 146, 33);
		desktopPane_3.add(btnNewButton_11);
		
	    comboBox_3 = new JComboBox();
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
	    		{
	    			if(comboBox_3.getSelectedItem().toString().equals("Choose source"));
	    			{
						JOptionPane.showMessageDialog(null,comboBox_3.getSelectedItem().toString()+" is Selected!");
	    			}
	    		}
				
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Choose source", "Delhi", "Mumbai", "Pune", "Kolkata", "Lucknow", "Kanpur", "Surat", "Srinagar", "Mysore", "Chennai", "Kerala", "Noida", "Indore", "Bhopal"}));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_3.setBounds(362, 10, 413, 35);
		desktopPane_3.add(comboBox_3);
		
	    comboBox_4 = new JComboBox();
	    comboBox_4.addItemListener(new ItemListener() {
	    	public void itemStateChanged(ItemEvent e) {
	    		if(e.getStateChange()==ItemEvent.SELECTED)
	    		{
	    			if(comboBox_4.getSelectedItem().toString().equals("Choose destination"));
	    			{
						JOptionPane.showMessageDialog(null,comboBox_4.getSelectedItem().toString()+" is Selected!");
	    			}
	    		}
	    	}
	    });
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Choose destination", "Delhi", "Mumbai", "Pune", "Kolkata", "Lucknow", "Kanpur", "Surat", "Srinagar", "Mysore", "Chennai", "Kerala", "Noida", "Indore", "Bhopal"}));
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_4.setBounds(361, 73, 414, 35);
		desktopPane_3.add(comboBox_4);
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(new Color(128, 255, 255));
		desktopPane_4.setBounds(10, 214, 1443, 508);
		Search_Flight.add(desktopPane_4);
		
		JLabel lblNewLabel_46 = new JLabel("Flight Id :->");
		lblNewLabel_46.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_46.setBounds(20, 41, 200, 35);
		desktopPane_4.add(lblNewLabel_46);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_33.setBounds(274, 43, 381, 35);
		desktopPane_4.add(textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_47 = new JLabel("Flight name :->");
		lblNewLabel_47.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_47.setBounds(20, 131, 238, 37);
		desktopPane_4.add(lblNewLabel_47);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_34.setBounds(274, 133, 381, 37);
		desktopPane_4.add(textField_34);
		textField_34.setColumns(10);
		
		JLabel lblNewLabel_48 = new JLabel("No. of seats :->");
		lblNewLabel_48.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_48.setBounds(20, 227, 238, 37);
		desktopPane_4.add(lblNewLabel_48);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_35.setBounds(274, 225, 381, 40);
		desktopPane_4.add(textField_35);
		textField_35.setColumns(10);
		
		JLabel lblNewLabel_49 = new JLabel("Source :->");
		lblNewLabel_49.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_49.setBounds(20, 323, 238, 35);
		desktopPane_4.add(lblNewLabel_49);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_36.setBounds(274, 322, 381, 36);
		desktopPane_4.add(textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_50 = new JLabel("Destination :->");
		lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_50.setBounds(20, 408, 238, 35);
		desktopPane_4.add(lblNewLabel_50);
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_37.setBounds(274, 408, 381, 35);
		desktopPane_4.add(textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_51 = new JLabel("Arrival :->");
		lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_51.setBounds(747, 41, 208, 35);
		desktopPane_4.add(lblNewLabel_51);
		
		textField_38 = new JTextField();
		textField_38.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_38.setBounds(1015, 41, 404, 35);
		desktopPane_4.add(textField_38);
		textField_38.setColumns(10);
		
		JLabel lblNewLabel_52 = new JLabel("Departure :->");
		lblNewLabel_52.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_52.setBounds(747, 132, 226, 34);
		desktopPane_4.add(lblNewLabel_52);
		
		textField_39 = new JTextField();
		textField_39.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_39.setBounds(1015, 131, 404, 34);
		desktopPane_4.add(textField_39);
		textField_39.setColumns(10);
		
		JLabel lblNewLabel_53 = new JLabel("Duration :->");
		lblNewLabel_53.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_53.setBounds(747, 227, 208, 37);
		desktopPane_4.add(lblNewLabel_53);
		
		textField_40 = new JTextField();
		textField_40.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_40.setBounds(1015, 227, 404, 37);
		desktopPane_4.add(textField_40);
		textField_40.setColumns(10);
		
		JLabel lblNewLabel_54 = new JLabel("Fare :->");
		lblNewLabel_54.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_54.setBounds(747, 323, 208, 35);
		desktopPane_4.add(lblNewLabel_54);
		
		textField_41 = new JTextField();
		textField_41.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_41.setBounds(1015, 323, 404, 35);
		desktopPane_4.add(textField_41);
		textField_41.setColumns(10);
		
		JLabel lblNewLabel_55 = new JLabel("Date of Flight :->");
		lblNewLabel_55.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_55.setBounds(747, 408, 265, 35);
		desktopPane_4.add(lblNewLabel_55);
		
		textField_42 = new JTextField();
		textField_42.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_42.setBounds(1021, 408, 398, 35);
		desktopPane_4.add(textField_42);
		textField_42.setColumns(10);
		
	    Ticket = new JPanel();
		frame.getContentPane().add(Ticket, "name_1087462970310899");
		Ticket.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Generate Tickets");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_10.setBounds(567, 26, 439, 54);
		Ticket.add(lblNewLabel_10);
		
		JButton btnNewButton_5 = new JButton("Cancel");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ticket.setVisible(false);
				Homepage.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_5.setBounds(1268, 668, 132, 38);
		Ticket.add(btnNewButton_5);
		
		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(new Color(249, 225, 183));
		desktopPane_7.setBounds(26, 101, 752, 605);
		Ticket.add(desktopPane_7);
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.CYAN);
		desktopPane_9.setBounds(0, 0, 752, 69);
		desktopPane_7.add(desktopPane_9);
		
		JLabel lblNewLabel_24 = new JLabel("Air India Express");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_24.setBounds(30, 23, 245, 24);
		desktopPane_9.add(lblNewLabel_24);
		
		JLabel lblNewLabel_75 = new JLabel("Boarding ");
		lblNewLabel_75.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_75.setBounds(568, 0, 184, 37);
		desktopPane_9.add(lblNewLabel_75);
		
		JLabel lblNewLabel_76 = new JLabel("Pass");
		lblNewLabel_76.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_76.setBounds(661, 39, 81, 30);
		desktopPane_9.add(lblNewLabel_76);
		
		JDesktopPane desktopPane_10 = new JDesktopPane();
		desktopPane_10.setBackground(Color.CYAN);
		desktopPane_10.setBounds(0, 585, 752, 20);
		desktopPane_7.add(desktopPane_10);
		
		JLabel lblNewLabel_77 = new JLabel("Happy Journey");
		lblNewLabel_77.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_77.setBounds(310, 0, 150, 20);
		desktopPane_10.add(lblNewLabel_77);
		
		JLabel lblNewLabel_78 = new JLabel("Passenger name");
		lblNewLabel_78.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_78.setBounds(24, 205, 193, 30);
		desktopPane_7.add(lblNewLabel_78);
		
		textField_54 = new JTextField();
		textField_54.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_54.setBounds(23, 245, 292, 32);
		desktopPane_7.add(textField_54);
		textField_54.setColumns(10);
		
		JLabel lblNewLabel_79 = new JLabel("From");
		lblNewLabel_79.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_79.setBounds(23, 304, 82, 30);
		desktopPane_7.add(lblNewLabel_79);
		
		textField_55 = new JTextField();
		textField_55.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_55.setBounds(23, 344, 292, 32);
		desktopPane_7.add(textField_55);
		textField_55.setColumns(10);
		
		JLabel lblNewLabel_80 = new JLabel("To");
		lblNewLabel_80.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_80.setBounds(24, 403, 59, 30);
		desktopPane_7.add(lblNewLabel_80);
		
		textField_56 = new JTextField();
		textField_56.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_56.setBounds(23, 443, 292, 32);
		desktopPane_7.add(textField_56);
		textField_56.setColumns(10);
		
		JLabel lblNewLabel_81 = new JLabel("Flight Id");
		lblNewLabel_81.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_81.setBounds(27, 495, 134, 30);
		desktopPane_7.add(lblNewLabel_81);
		
		textField_57 = new JTextField();
		textField_57.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_57.setBounds(23, 535, 292, 30);
		desktopPane_7.add(textField_57);
		textField_57.setColumns(10);
		
		JLabel lblNewLabel_82 = new JLabel("Date");
		lblNewLabel_82.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_82.setBounds(442, 205, 168, 30);
		desktopPane_7.add(lblNewLabel_82);
		
		textField_58 = new JTextField();
		textField_58.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_58.setBounds(442, 245, 277, 32);
		desktopPane_7.add(textField_58);
		textField_58.setColumns(10);
		
		JLabel lblNewLabel_83 = new JLabel("Boarding time");
		lblNewLabel_83.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_83.setBounds(442, 304, 168, 30);
		desktopPane_7.add(lblNewLabel_83);
		
		textField_59 = new JTextField();
		textField_59.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_59.setBounds(442, 344, 277, 32);
		desktopPane_7.add(textField_59);
		textField_59.setColumns(10);
		
		JLabel lblNewLabel_84 = new JLabel("Departure time");
		lblNewLabel_84.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_84.setBounds(442, 403, 200, 30);
		desktopPane_7.add(lblNewLabel_84);
		
		textField_60 = new JTextField();
		textField_60.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_60.setBounds(442, 443, 277, 32);
		desktopPane_7.add(textField_60);
		textField_60.setColumns(10);
		
		JLabel lblNewLabel_85 = new JLabel("Seat no.");
		lblNewLabel_85.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_85.setBounds(447, 495, 107, 30);
		desktopPane_7.add(lblNewLabel_85);
		
		textField_61 = new JTextField();
		textField_61.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_61.setBounds(442, 535, 277, 30);
		desktopPane_7.add(textField_61);
		textField_61.setColumns(10);
		
		JLabel lblNewLabel_87 = new JLabel("Passport No.");
		lblNewLabel_87.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_87.setBounds(23, 101, 205, 30);
		desktopPane_7.add(lblNewLabel_87);
		
		textField_49 = new JTextField();
		textField_49.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_49.setBounds(24, 141, 292, 32);
		desktopPane_7.add(textField_49);
		textField_49.setColumns(10);
		
		JLabel lblNewLabel_88 = new JLabel("Class");
		lblNewLabel_88.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_88.setBounds(442, 101, 168, 30);
		desktopPane_7.add(lblNewLabel_88);
		
		textField_62 = new JTextField();
		textField_62.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_62.setBounds(442, 140, 277, 33);
		desktopPane_7.add(textField_62);
		textField_62.setColumns(10);
		
		JDesktopPane desktopPane_8 = new JDesktopPane();
		desktopPane_8.setBackground(new Color(164, 139, 228));
		desktopPane_8.setBounds(874, 230, 526, 273);
		Ticket.add(desktopPane_8);
		
		JLabel lblNewLabel_22 = new JLabel("Enter Ticket Id");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_22.setBounds(133, 29, 275, 41);
		desktopPane_8.add(lblNewLabel_22);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_1.setBounds(148, 110, 237, 41);
		desktopPane_8.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_17 = new JButton("Get Ticket");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					//Load and register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
				
					//Get the Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");	
					
					Statement stmt = con.createStatement();
					
					String a = textField_1.getText().toString();
					
					ResultSet rs = stmt.executeQuery("select * from Tickets where Tid = '"+a+"'");
					
					String tid = "";
					String name = "";
					String from = "";
					String to = "";
					String fid ="";
					String cl = "";
					String date = "";
					String bt = "";
					String dt = "";
					String seat = "";
					String prn = "";
					
					while(rs.next())
					{
						tid = rs.getString(1);
						name = rs.getString(2);
						from = rs.getString(3);
						to = rs.getString(4);
						fid = rs.getString(5);
						cl = rs.getString(6);
						date = rs.getString(7);
						bt = rs.getString(8);
						dt = rs.getString(9);
						seat = rs.getString(10);
						prn = rs.getString(11);
					}
					if(a.equals(tid))
					{
						textField_49.setText(""+prn);
						textField_54.setText(""+name);
						textField_55.setText(""+from);
						textField_56.setText(""+to);
						textField_57.setText(""+fid);
						textField_62.setText(""+cl);
						textField_58.setText(""+date);
						textField_59.setText(""+bt);
						textField_60.setText(""+dt);
						textField_61.setText(""+seat);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid Ticket Id");
					}
					
				}
				catch(Exception y)
				{
					System.out.println(y);
				}
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_17.setBounds(193, 197, 160, 35);
		desktopPane_8.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Print");
		btnNewButton_18.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_18.setBounds(874, 666, 132, 38);
		Ticket.add(btnNewButton_18);
		
	    Payment = new JPanel();
		frame.getContentPane().add(Payment, "name_1087468320751100");
		Payment.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel(" Payment");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_11.setBounds(661, 10, 256, 76);
		Payment.add(lblNewLabel_11);
		
		JButton btnNewButton_6 = new JButton("Cancel");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment.setVisible(false);
				Homepage.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_6.setBounds(1332, 682, 121, 40);
		Payment.add(btnNewButton_6);
		
		JDesktopPane desktopPane_12 = new JDesktopPane();
		desktopPane_12.setBackground(Color.PINK);
		desktopPane_12.setBounds(552, 156, 508, 383);
		Payment.add(desktopPane_12);
		
		JLabel lblNewLabel_57 = new JLabel("Enter UPI id");
		lblNewLabel_57.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_57.setBounds(36, 21, 263, 37);
		desktopPane_12.add(lblNewLabel_57);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_24.setBounds(36, 68, 408, 37);
		desktopPane_12.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_95 = new JLabel("Total Amount");
		lblNewLabel_95.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_95.setBounds(40, 150, 220, 37);
		desktopPane_12.add(lblNewLabel_95);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_25.setBounds(36, 197, 408, 37);
		desktopPane_12.add(textField_25);
		textField_25.setColumns(10);
		
		JButton btnNewButton_21 = new JButton("Pay Now");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Your Payment was successful!");
			}
		});
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_21.setBounds(197, 286, 153, 37);
		desktopPane_12.add(btnNewButton_21);
		
	    Cancel_ticket = new JPanel();
		frame.getContentPane().add(Cancel_ticket, "name_1087477459678200");
		Cancel_ticket.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("Flight Cancellation");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_12.setBounds(572, 10, 481, 73);
		Cancel_ticket.add(lblNewLabel_12);
		
		JButton btnNewButton_7 = new JButton("Cancel");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Cancel_ticket.setVisible(false);
				Homepage.setVisible(true);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_7.setBounds(1223, 682, 125, 39);
		Cancel_ticket.add(btnNewButton_7);
		
		JDesktopPane desktopPane_11 = new JDesktopPane();
		desktopPane_11.setBackground(Color.PINK);
		desktopPane_11.setBounds(255, 199, 987, 332);
		Cancel_ticket.add(desktopPane_11);
		
		JLabel lblNewLabel_90 = new JLabel("Enter Ticket Id");
		lblNewLabel_90.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_90.setBounds(44, 57, 303, 39);
		desktopPane_11.add(lblNewLabel_90);
		
		textField_64 = new JTextField();
		textField_64.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_64.setBounds(506, 57, 415, 39);
		desktopPane_11.add(textField_64);
		textField_64.setColumns(10);
		
		JLabel lblNewLabel_91 = new JLabel("Enter Passport Number");
		lblNewLabel_91.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_91.setBounds(44, 179, 433, 39);
		desktopPane_11.add(lblNewLabel_91);
		
		textField_65 = new JTextField();
		textField_65.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_65.setBounds(506, 179, 415, 39);
		desktopPane_11.add(textField_65);
		textField_65.setColumns(10);
		
		JButton btnNewButton_20 = new JButton("Cancel Ticket");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					//Load and register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
				
					//Get the Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");	
					
					Statement stmt = con.createStatement();
				
					String a = textField_64.getText().toString();
					String b = textField_65.getText().toString();
					String c = "";
					String d = "";
					
					ResultSet rs = stmt.executeQuery("select * from Tickets");
					while(rs.next())
					{
						c = rs.getString(1);
						d = rs.getString(11);
					}
					
					if(a.equals(c)&&b.equals(d))
					{	
					String query = "delete from Tickets where Tid = '"+a+"' And prn = '"+b+"'";
					
					PreparedStatement p = con.prepareStatement(query);
					p.execute();
					
					JOptionPane.showMessageDialog(null,"Flight Cancellation is Successful! ");
					}
					else
					{
					JOptionPane.showMessageDialog(null,"Ticket Credentials are Wrong! ");
					}
				}
		        catch(Exception r)	
				{
		        	System.out.println(r);
				}
			}
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_20.setBounds(396, 280, 227, 42);
		desktopPane_11.add(btnNewButton_20);
		
	    Book_Flight = new JPanel();
	    Book_Flight.setBackground(new Color(128, 128, 255));
		frame.getContentPane().add(Book_Flight, "name_1087484180665900");
		Book_Flight.setLayout(null);
		
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(new Color(128, 255, 255));
		desktopPane_5.setBackground(new Color(128, 255, 255));
		desktopPane_5.setBounds(10, 59, 614, 160);
		Book_Flight.add(desktopPane_5);
		
		JLabel lblNewLabel_58 = new JLabel("Search Flight");
		lblNewLabel_58.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_58.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_58.setBounds(224, 10, 190, 31);
		desktopPane_5.add(lblNewLabel_58);
		
		JLabel lblNewLabel_59 = new JLabel("Source");
		lblNewLabel_59.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_59.setBounds(64, 52, 98, 24);
		desktopPane_5.add(lblNewLabel_59);
		

	    comboBox = new JComboBox();
	    comboBox.addItemListener(new ItemListener() {
	    	public void itemStateChanged(ItemEvent e) {
	    	
		
				if(e.getStateChange()==ItemEvent.SELECTED)
	    		{
	    			if(comboBox.getSelectedItem().toString().equals("Choose"));
	    			{
						JOptionPane.showMessageDialog(null,comboBox.getSelectedItem().toString()+" is Selected!");
	    			}
	    		}
	    	}
	    });
	    comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Delhi", "Mumbai", "Pune", "Kolkata", "Lucknow", "Kanpur", "Surat", "Srinagar", "Mysore", "Chennai", "Kerala", "Noida", "Indore", "Bhopal"}));
		comboBox.setToolTipText("");
		desktopPane_5.setLayer(comboBox, 0);
		comboBox.setBounds(43, 79, 119, 29);
		
		desktopPane_5.add(comboBox);
		
		JLabel lblNewLabel_60 = new JLabel("Destination");
		lblNewLabel_60.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_60.setBounds(420, 52, 155, 24);
		desktopPane_5.add(lblNewLabel_60);
		
	    comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent d) {

				if(d.getStateChange()==ItemEvent.SELECTED)
	    		{
	    			if(comboBox_1.getSelectedItem().toString().equals("Choose"));
	    			{
						JOptionPane.showMessageDialog(null,comboBox_1.getSelectedItem().toString()+" is Selected!");
	    			}
	    		}
			}
		});
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Delhi", "Mumbai", "Pune", "Kolkata", "Lucknow", "Kanpur", "Surat", "Srinagar", "Mysore", "Chennai", "Kerala", "Noida", "Indore", "Bhopal"}));
		comboBox_1.setBounds(406, 79, 169, 29);
		desktopPane_5.add(comboBox_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(634, 59, 804, 160);
		Book_Flight.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
     	table.setModel(new DefaultTableModel(
     		new Object[][] {
     		},
     		new String[] {
     			"Name", "Arrival", "Departure", "Seat", "Date", "Duration"
     		}
     	));
		
		JButton btnNewButton_12 = new JButton("Search");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				//Load and register the driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				//Get the Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");	
				
				Statement stmt = con.createStatement();
				
				String s = comboBox.getSelectedItem().toString();
				String d = comboBox_1.getSelectedItem().toString();
				ResultSet res = stmt.executeQuery("select * from Flight_details where source='" + s + "'AND destination='"+ d +"'"); 
				
				String f_id= "";
				String f_name = "";
				String seat = "";
				String arr = "";
				String dpt = "";
				String dur = "";
				String fare = "";
				String dof = "";
				String src = "";
				String dst = "";
				
				while(res.next())
				{
					f_id = res.getString(1);
					f_name = res.getString(2);
					seat = res.getString(3);
					arr = res.getString(6);
					dpt = res.getString(7);
					dur = res.getString(8);
					fare = res.getString(9);
					dof = res .getString(10);
					src = res.getString(4);
					dst = res.getString(5);
				}
				if(s.equals(src) && d.equals(dst))
				{
				textField_52.setText(""+f_id);
				textField_53.setText(""+f_name);
				textField_48.setText(""+fare);
			  
			    table.setModel(new javax.swing.table.DefaultTableModel(
			    	new Object[][] {
			    		{f_name,arr,dpt,seat,dof,dur}
			    	},
			    	new String[] {
									"Name", "Arrival", "Departure", "Seat", "Date", "Duration"
						}	
			    ));
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"NO Flight for this route");
				}
				}
				catch(Exception y)
				{
					System.out.println(y);
				}
				
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12.setBounds(244, 116, 98, 31);
		desktopPane_5.add(btnNewButton_12);
		
		JLabel lblNewLabel_61 = new JLabel("Book Your Dream Flight");
		lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_61.setForeground(new Color(255, 0, 0));
		lblNewLabel_61.setBounds(532, 10, 426, 48);
		Book_Flight.add(lblNewLabel_61);
		
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(new Color(255, 255, 128));
		desktopPane_6.setBounds(26, 240, 1412, 470);
		Book_Flight.add(desktopPane_6);
		
	    class generateTId{
		public static String generateTicketId()
		{
			String newId = "TKT00001";
			try
			{
				//Load and register the driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Get the Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select max(cast(substring(Tid,4) as unsigned)) from Tickets");
				if(rs.next())
				{
					String lastId = rs.getString(1);
					if(lastId!=null)
					{
						int num = rs.getInt(1) +1;
						newId = String.format("TKT%05d",num);
					}
				}
				con.close();
			}
			catch(Exception g)
			{
				System.out.println(g);
			}
			return newId;
		}
		}
		
		JLabel lblNewLabel_62 = new JLabel("Ticket Id :->");
		lblNewLabel_62.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_62.setBounds(10, 10, 154, 29);
		desktopPane_6.add(lblNewLabel_62);
		
		textField_43 = new JTextField();
		textField_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_43.setBounds(240, 12, 248, 29);
		desktopPane_6.add(textField_43);
		textField_43.setColumns(10);
		textField_43.setText(generateTId.generateTicketId());
		
		JLabel lblNewLabel_63 = new JLabel("Customer Id :->");
		lblNewLabel_63.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_63.setBounds(10, 71, 179, 29);
		desktopPane_6.add(lblNewLabel_63);
		
		JLabel lblNewLabel_65 = new JLabel("Customer name:->");
		lblNewLabel_65.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_65.setBounds(10, 131, 208, 29);
		desktopPane_6.add(lblNewLabel_65);
		
		textField_44 = new JTextField();
		textField_44.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_44.setBounds(242, 71, 246, 30);
		desktopPane_6.add(textField_44);
		textField_44.setColumns(10);
		
		textField_45 = new JTextField();
		textField_45.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_45.setBounds(242, 131, 246, 30);
		desktopPane_6.add(textField_45);
		textField_45.setColumns(10);
		
		JLabel lblNewLabel_64 = new JLabel("Contact :->");
		lblNewLabel_64.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_64.setBounds(10, 252, 208, 29);
		desktopPane_6.add(lblNewLabel_64);
		
		textField_46 = new JTextField();
		textField_46.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_46.setBounds(242, 253, 246, 29);
		desktopPane_6.add(textField_46);
		textField_46.setColumns(10);
		
		JLabel lblNewLabel_66 = new JLabel("Gender :->");
		lblNewLabel_66.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_66.setBounds(10, 306, 154, 29);
		desktopPane_6.add(lblNewLabel_66);
		
		textField_47 = new JTextField();
		textField_47.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_47.setBounds(242, 307, 246, 29);
		desktopPane_6.add(textField_47);
		textField_47.setColumns(10);
		
		JLabel lblNewLabel_67 = new JLabel("Fare :->");
		lblNewLabel_67.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_67.setBounds(807, 131, 167, 29);
		desktopPane_6.add(lblNewLabel_67);
		
		textField_48 = new JTextField();
		textField_48.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_48.setBounds(1075, 132, 172, 29);
		desktopPane_6.add(textField_48);
		textField_48.setColumns(10);
		
		JLabel lblNewLabel_68 = new JLabel("Total Tickets :->");
		lblNewLabel_68.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_68.setBounds(807, 194, 189, 30);
		desktopPane_6.add(lblNewLabel_68);
		
		JLabel lblNewLabel_69 = new JLabel("Discount(%) :->");
		lblNewLabel_69.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_69.setBounds(807, 263, 189, 29);
		desktopPane_6.add(lblNewLabel_69);
		
		textField_50 = new JTextField();
		textField_50.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_50.setBounds(1075, 264, 172, 29);
		desktopPane_6.add(textField_50);
		textField_50.setColumns(10);
		
		JLabel lblNewLabel_70 = new JLabel("Total Amount :->");
		lblNewLabel_70.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_70.setBounds(807, 328, 211, 29);
		desktopPane_6.add(lblNewLabel_70);
		
		textField_51 = new JTextField();
		textField_51.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_51.setBounds(1075, 328, 172, 29);
		desktopPane_6.add(textField_51);
		textField_51.setColumns(10);
		
		JButton btnNewButton_13 = new JButton("Search");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				//Load and register the driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				//Get the Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");	
				
				Statement stmt = con.createStatement();
	
                String id = textField_44.getText().toString();
				
				ResultSet rs = stmt.executeQuery("select * from registration_details where id = '"+id+"'");
			
			    String i = "";
			    String name = "";
			    String phone = "";
			    String gender = "";
			    String prn = "";
			     
			    while(rs.next())
			    {
			    	i = rs.getString(1);
			    	name  = rs.getString(2);
			    	phone = rs.getString(5);
			    	gender = rs.getString(8);
			    	prn = rs.getString(10);
			    }
			    if(id.equals(i))
			    {
			    textField_45.setText(""+name);
			    textField_46.setText(""+phone);
			    textField_47.setText(""+gender);
			    textField_66.setText(""+prn);
			    }
			    else
			    {
				    JOptionPane.showMessageDialog(null,textField_44.getText().toString()+" is invalid Id");
			    }
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton_13.setBounds(527, 71, 118, 29);
		desktopPane_6.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Calculate");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			    int fare = Integer.parseInt(textField_48.getText().toString());
				int No_of_Tickets = Integer.parseInt(spinner.getValue().toString());
				int dis = Integer.parseInt(textField_50.getText().toString());
				float total=0,a,b;
				
				a = fare*No_of_Tickets;
				b = (dis*a)/100;
				total = (a-b);
				
				textField_51.setText(""+total);
				textField_25.setText(""+total);
				}
				catch(Exception u)
				{
					System.out.println(u);
				}
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_14.setForeground(new Color(0, 0, 0));
		btnNewButton_14.setBounds(1257, 329, 145, 29);
		desktopPane_6.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Book");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					//Load and register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
				
					//Get the Connection
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Root");	
					
					Statement stmt = con.createStatement();
					
					String s = comboBox.getSelectedItem().toString();
					String d = comboBox_1.getSelectedItem().toString();
					ResultSet res = stmt.executeQuery("select * from Flight_details where source='" + s + "'AND destination='"+ d +"'"); 
					String arrival = "";
					String dptr = "";
					String date = "";
					while(res.next())
					{
						arrival = res.getString(6);
						dptr = res.getString(7);
						date = res.getString(10);	
					}
					
					String Tid = textField_43.getText().toString();
					String name = textField_45.getText().toString();
					String src = comboBox.getSelectedItem().toString();
					String dst = comboBox_1.getSelectedItem().toString();
					String fid = textField_52.getText().toString();
					String clas = comboBox_2.getSelectedItem().toString();
					String dof = date;
					String arr = arrival;
					String dpt = dptr;
					String seat = textField_63.getText().toString();
				    String prn =  textField_66.getText().toString();
				    String amount = textField_51.getText().toString();
					String query = "insert into Tickets(Tid,name,src,dst,fid,clas,dof,arr,dpt,seat,prn,amount)values('"+Tid+"','"+name+"','"+ src+"','"+dst +"','"+fid+"','"+clas+"','"+ dof+"','"+arr+"','"+dpt+"','"+seat+"','"+prn+"','"+amount+"')";
					
					long rs = stmt.executeUpdate(query);
					
					if(rs>0)
					{
						JOptionPane.showMessageDialog(null,"Booking Successful!");	
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Some Error");	
					}
					con.close();
				}
				catch(Exception s)
				{
					System.out.println(s);
				}
			}
		});
		btnNewButton_15.setBackground(UIManager.getColor("Button.light"));
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnNewButton_15.setBounds(810, 415, 118, 33);
		desktopPane_6.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Cancel");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book_Flight.setVisible(false);	
				Homepage.setVisible(true);
			}
		});
		btnNewButton_16.setBackground(new Color(255, 128, 128));
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnNewButton_16.setBounds(1104, 416, 145, 30);
		desktopPane_6.add(btnNewButton_16);
		
		JLabel lblNewLabel_71 = new JLabel("Rs.");
		lblNewLabel_71.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_71.setBounds(1031, 131, 45, 29);
		desktopPane_6.add(lblNewLabel_71);
		
		JLabel lblNewLabel_72 = new JLabel("Rs.");
		lblNewLabel_72.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_72.setBounds(1028, 328, 45, 29);
		desktopPane_6.add(lblNewLabel_72);
		
		JLabel lblNewLabel_73 = new JLabel("Flight Id :->");
		lblNewLabel_73.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_73.setBounds(10, 361, 179, 33);
		desktopPane_6.add(lblNewLabel_73);
		
		textField_52 = new JTextField();
		textField_52.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_52.setBounds(242, 364, 246, 28);
		desktopPane_6.add(textField_52);
		textField_52.setColumns(10);
		
		JLabel lblNewLabel_74 = new JLabel("Flight name :->");
		lblNewLabel_74.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_74.setBounds(10, 418, 183, 29);
		desktopPane_6.add(lblNewLabel_74);
		
		textField_53 = new JTextField();
		textField_53.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_53.setBounds(242, 419, 246, 29);
		desktopPane_6.add(textField_53);
		textField_53.setColumns(10);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 22));
		spinner.setBounds(1075, 195, 98, 30);
		desktopPane_6.add(spinner);
		
		JLabel lblNewLabel_86 = new JLabel("Class :->");
		lblNewLabel_86.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_86.setBounds(807, 10, 154, 29);
		desktopPane_6.add(lblNewLabel_86);
		
	    comboBox_2 = new JComboBox();
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent c) {
				if(c.getStateChange()==ItemEvent.SELECTED)
				{
					if(comboBox_2.getSelectedItem().toString().equals("Select"));
					{
						JOptionPane.showMessageDialog(null, comboBox_2.getSelectedItem().toString()+" is Selected!");
					}
				}
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "First Class", "Economy Class", "Business Class", "Premium Class"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_2.setBounds(1031, 10, 216, 30);
		desktopPane_6.add(comboBox_2);
		
		JLabel lblNewLabel_89 = new JLabel("Seat no. :->");
		lblNewLabel_89.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_89.setBounds(807, 71, 155, 29);
		desktopPane_6.add(lblNewLabel_89);
		
		textField_63 = new JTextField();
		textField_63.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_63.setBounds(1031, 72, 216, 29);
		desktopPane_6.add(textField_63);
		textField_63.setColumns(10);
		
		JLabel lblNewLabel_92 = new JLabel("Passport no. :->");
		lblNewLabel_92.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_92.setBounds(10, 195, 208, 29);
		desktopPane_6.add(lblNewLabel_92);
		
		textField_66 = new JTextField();
		textField_66.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_66.setBounds(244, 195, 244, 30);
		desktopPane_6.add(textField_66);
		textField_66.setColumns(10);
	}
}
