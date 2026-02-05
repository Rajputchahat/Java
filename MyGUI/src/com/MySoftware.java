package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MySoftware extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
    JPanel login,home,first_page;
    private JLabel lblNewLabel_3;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySoftware frame = new MySoftware();
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
	public MySoftware() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 767);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
	    login = new JPanel();
	    login.setForeground(new Color(0, 0, 0));
		contentPane.add(login, "name_3886635343456100");
		login.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Username :-");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(41, 135, 263, 42);
		login.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Password :-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(41, 245, 247, 31);
		login.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(314, 143, 530, 31);
		login.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(314, 245, 530, 33);
		login.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name = textField.getText().toString();
				String pass = passwordField.getText().toString();
				if(name.equals("Pass")&&pass.equals("12345"))
				{
					login.setVisible(false);
					home.setVisible(true);
				}
				else
				{
					lblNewLabel_3.setText("Invalid Username and Password");
				}
			}
		});
		btnNewButton.setBounds(349, 444, 183, 42);
		login.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(261, 386, 408, 31);
		login.add(lblNewLabel_3);
		
	    home = new JPanel();
		contentPane.add(home, "name_3886650434498100");
		home.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to Your Account");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_2.setBounds(266, 40, 421, 49);
		home.add(lblNewLabel_2);
		
		JLabel lblMrChahatLodhi = new JLabel("Mr.  XYZ");
		lblMrChahatLodhi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblMrChahatLodhi.setBounds(389, 124, 140, 40);
		home.add(lblMrChahatLodhi);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_page.setVisible(true);
				home.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(353, 379, 167, 49);
		home.add(btnNewButton_1);
		
		first_page = new JPanel();
		contentPane.add(first_page, "name_4009094730443100");
		first_page.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("State Bank of India Bulandshahr UP");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_4.setBounds(217, 67, 492, 38);
		first_page.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Account holder :-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(75, 175, 210, 33);
		first_page.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mobile number :-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(75, 354, 210, 33);
		first_page.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Account Type :-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(75, 239, 210, 26);
		first_page.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(329, 175, 499, 33);
		first_page.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(329, 239, 499, 29);
		first_page.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Account Number :-");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(75, 301, 210, 26);
		first_page.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(329, 301, 499, 29);
		first_page.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Log out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.setVisible(true);
				first_page.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_2.setBounds(355, 621, 229, 38);
		first_page.add(btnNewButton_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(329, 360, 499, 26);
		first_page.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("IFSC code :-");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(75, 424, 210, 26);
		first_page.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(329, 424, 499, 29);
		first_page.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Nominee :-");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(75, 479, 210, 26);
		first_page.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(329, 479, 499, 26);
		first_page.add(textField_6);
		textField_6.setColumns(10);
	}
}
