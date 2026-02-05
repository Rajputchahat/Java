package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MySoftware2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	double first;
	double second;
	double result;
	String  operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySoftware2 frame = new MySoftware2();
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
	public MySoftware2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_46734027441100");
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("\r\n\r\n");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(63, 60, 464, 155);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Arithmetic Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(160, 10, 276, 25);
		panel.add(lblNewLabel);
		
		JButton btn10 = new JButton("B");
		btn10.setForeground(new Color(255, 0, 0));
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String backspace = null;
			if(textField.getText().length()>0)
			{
			  StringBuilder	str = new StringBuilder(textField.getText());
			  str.deleteCharAt(textField.getText().length()-1);
			  backspace = str.toString();
			  textField.setText(backspace);
			}
			}
		});
		btn10.setBounds(63, 246, 85, 42);
		panel.add(btn10);
		
		JButton btn11 = new JButton("( )");
		btn11.setForeground(new Color(255, 0, 0));
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn11.setBackground(new Color(255, 255, 255));
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn11.setBounds(179, 246, 85, 42);
		panel.add(btn11);
		
		JButton btn12 = new JButton("%");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn12.setForeground(new Color(255, 0, 0));
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn12.setBackground(new Color(255, 255, 255));
		btn12.setBounds(300, 246, 85, 42);
		panel.add(btn12);
		
		JButton btn13 = new JButton("/");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn13.setForeground(new Color(255, 0, 0));
		btn13.setBounds(442, 246, 85, 42);
		panel.add(btn13);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(63, 396, 85, 42);
		panel.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn7.setBounds(63, 322, 85, 42);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn8.setBounds(179, 322, 85, 42);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn9.setBounds(300, 322, 85, 42);
		panel.add(btn9);
		
		JButton btn14 = new JButton("X");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn14.setForeground(new Color(255, 0, 0));
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn14.setBounds(442, 322, 85, 42);
		panel.add(btn14);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(179, 396, 85, 42);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(300, 396, 85, 42);
		panel.add(btn6);
		
		JButton btn15 = new JButton("-");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 67));
		btn15.setForeground(new Color(255, 0, 0));
		btn15.setBounds(442, 396, 85, 42);
		panel.add(btn15);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn1.setBounds(63, 476, 85, 42);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(179, 476, 85, 42);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn3.setBounds(300, 476, 85, 42);
		panel.add(btn3);
		
		JButton btn16 = new JButton("+");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn16.setForeground(new Color(255, 0, 0));
		btn16.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn16.setBounds(442, 476, 85, 42);
		panel.add(btn16);
		
		JButton btn20 = new JButton("C");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  textField.setText(null);
			}
		});
		btn20.setForeground(new Color(255, 0, 0));
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn20.setBounds(63, 552, 85, 42);
		panel.add(btn20);
		
		JButton btn19 = new JButton("0");
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn19.getText();
				textField.setText(number);
			}
		});
		btn19.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn19.setForeground(new Color(64, 0, 0));
		btn19.setBounds(179, 552, 85, 42);
		panel.add(btn19);
		
		JButton btn18 = new JButton(".");
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textField.getText()+btn18.getText();
				textField.setText(number);
			}
		});
		btn18.setForeground(new Color(255, 0, 0));
		btn18.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btn18.setBounds(300, 552, 85, 42);
		panel.add(btn18);
		
		JButton btn17 = new JButton("=");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first + second;
					answer = String .format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first - second;
					answer = String .format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first * second;
					answer = String .format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first / second;
					answer = String .format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result = first % second;
					answer = String .format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btn17.setForeground(new Color(255, 0, 0));
		btn17.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btn17.setBounds(442, 552, 85, 42);
		panel.add(btn17);
	}
}
