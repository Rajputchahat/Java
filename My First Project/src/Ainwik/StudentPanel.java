package Ainwik;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class StudentPanel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	JPanel dashbord,registration,payfees,findstudent;
	JLabel error_var,lblNewLabel_21;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPanel window = new StudentPanel();
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
	public StudentPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 967, 659);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel loginpage = new JPanel();
		frame.getContentPane().add(loginpage, "name_9212085969300");
		loginpage.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(383, 224, 176, 94);
		loginpage.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter UserName:- ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setBounds(113, 349, 250, 28);
		loginpage.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Password:-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setBounds(113, 439, 290, 28);
		loginpage.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(429, 349, 284, 28);
		loginpage.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(429, 439, 284, 28);
		loginpage.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
			    try
				{
			    	
			    String u=null,p=null;	
								
			    String user=textField.getText().toString();
			    String pass=textField_1.getText().toString();
			
			 
					//Load and Register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Get connection  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ainwik_students","root","admin");  
					
					
					//Create Statements..
					Statement stmt=con.createStatement();  

					//Get All Record into 
					ResultSet rs=stmt.executeQuery("select * from login");  
					
				
					while(rs.next())  
					{
					    u= rs.getString(1);
					    p= rs.getString(2);
					  
					}
					
					  
				    if(user.equals(u) && pass.equals(p))
				    {
				    	loginpage.setVisible(false);
				    	dashbord.setVisible(true);
				    }
				    else
				    {
				    	error_var.setText("Invalid User");
				    }
					
					
					
					con.close();
					
					
				}
				catch(Exception ex)
				{}
			  
			    
			  
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_1.setBounds(429, 517, 144, 37);
		loginpage.add(btnNewButton_1);
		
		 error_var= new JLabel("");
		error_var.setForeground(Color.RED);
		error_var.setFont(new Font("Tahoma", Font.PLAIN, 15));
		error_var.setBounds(309, 313, 376, 14);
		loginpage.add(error_var);
		
		dashbord= new JPanel();
		frame.getContentPane().add(dashbord, "name_9219749048500");
		dashbord.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("DashBord");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_3.setBounds(300, 0, 430, 152);
		dashbord.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Student Registration");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
			    dashbord.setVisible(false);
			    registration.setVisible(true);
			
			
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_2.setBounds(39, 221, 382, 119);
		dashbord.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Find Student");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_3.setBounds(519, 221, 291, 119);
		dashbord.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Pay Fees");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_4.setBounds(275, 410, 382, 109);
		dashbord.add(btnNewButton_4);
		
		registration = new JPanel();
		frame.getContentPane().add(registration, "name_9223060808400");
		registration.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Student Registration");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(390, 11, 246, 25);
		registration.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter Id:-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(37, 78, 104, 25);
		registration.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Name:-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(34, 125, 107, 30);
		registration.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DOB:-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(37, 178, 104, 25);
		registration.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Email:- ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(37, 227, 104, 25);
		registration.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("College:-");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(34, 277, 107, 25);
		registration.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Mobile:-");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(37, 334, 104, 19);
		registration.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Father's Name:- ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(34, 378, 159, 25);
		registration.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Mobile:- ");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.setBounds(34, 437, 132, 25);
		registration.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Address:- ");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_13.setBounds(37, 490, 129, 25);
		registration.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Adhar NO:-");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_14.setBounds(459, 85, 132, 25);
		registration.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Course Name:- ");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_15.setBounds(459, 141, 132, 14);
		registration.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Total Fees:-");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_16.setBounds(459, 200, 116, 19);
		registration.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Amount Paid:-");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_17.setBounds(459, 255, 116, 25);
		registration.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Amount Dues:-");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_18.setBounds(459, 310, 165, 25);
		registration.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Dues Date:-");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_19.setBounds(459, 361, 132, 25);
		registration.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Description:-");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_20.setBounds(459, 407, 147, 25);
		registration.add(lblNewLabel_20);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 82, 159, 20);
		registration.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(179, 132, 159, 20);
		registration.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(178, 182, 160, 20);
		registration.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(179, 231, 159, 20);
		registration.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(176, 281, 162, 20);
		registration.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(179, 335, 159, 20);
		registration.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(173, 382, 165, 20);
		registration.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(173, 441, 165, 20);
		registration.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(165, 494, 190, 52);
		registration.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(617, 82, 190, 20);
		registration.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(617, 132, 190, 20);
		registration.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(617, 201, 190, 20);
		registration.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(619, 259, 188, 20);
		registration.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(617, 314, 190, 20);
		registration.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(617, 365, 190, 20);
		registration.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(614, 411, 258, 76);
		registration.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				   try
					{
						
			   String id=textField_2.getText().toString();
			   String name=textField_3.getText().toString();
			   String dob=textField_4.getText().toString();
			   String email=textField_5.getText().toString();
			   String college=textField_6.getText().toString();
			   String smobile=textField_7.getText().toString();
			   String fname=textField_8.getText().toString();
			   String fmobile=textField_9.getText().toString();
			   String address=textField_10.getText().toString();
			   String adhar=textField_11.getText().toString();
			   String course=textField_12.getText().toString();
			   String fees=textField_13.getText().toString();
			   String amount_paid=textField_14.getText().toString();
			   String amount_dues=textField_15.getText().toString();
			   String dues_date=textField_16.getText().toString();
			   String description=textField_17.getText().toString();
			   
			   
			
					//Load and Register the driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Get connection  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ainwik_students","root","admin");  
					
					
					Scanner sc=new Scanner(System.in);
					
					
				    Statement stmt=con.createStatement();
		  
					
				    String query="insert into std_register(id,name,dob,email,college,smobile,father,fmobile,address,adhar,course,totalfees,amountpaid,amountdues,duesdate,description) values ('"+id+"','"+name+"','"+dob+"','"+email+"','"+college+"','"+smobile+"','"+fname+"','"+fmobile+"','"+address+"','"+adhar+"','"+course+"','"+fees+"','"+amount_paid+"','"+amount_dues+"','"+dues_date+"','"+description+"')";

				     int result=stmt.executeUpdate(query);

		             		    
				    
		            if(result>0)
		            {
		            	lblNewLabel_21.setText("Data Saved");
		            }
		            else
		            {
		            	lblNewLabel_21.setText("Query Prblm");
		            	
		            }	
		            sc.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			   
			   
			   
			   
			   
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(429, 525, 165, 30);
		registration.add(btnNewButton);
		
		lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setForeground(Color.RED);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_21.setBounds(443, 579, 139, 32);
		registration.add(lblNewLabel_21);
		
		payfees = new JPanel();
		frame.getContentPane().add(payfees, "name_9226969132000");
		
		findstudent = new JPanel();
		frame.getContentPane().add(findstudent, "name_9229891821000");
	}
}
