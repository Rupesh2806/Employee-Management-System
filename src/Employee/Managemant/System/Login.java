package Employee.Managemant.System;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	public Login() {
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel lblusernameJLabel = new JLabel("UserName");
		lblusernameJLabel.setBounds(40,20,100,30);
		add(lblusernameJLabel);
		
		JTextField tfusernaField = new JTextField();
		tfusernaField.setBounds(150,20,150,30);
		add(tfusernaField);
		
		JLabel lblpasswordJLabel = new JLabel("Password");
		lblpasswordJLabel.setBounds(40,70,100,30);
		add(lblpasswordJLabel);
		
		JTextField tfpasswordField = new JTextField();
		tfpasswordField.setBounds(150,70,150,30);
		add(tfpasswordField);
		
		JButton login = new JButton("Login");
		login.setBounds(150,140,150,30);
		login.setBackground(Color.blue);
		login.setForeground(Color.white);
		add(login);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));		
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image  = new JLabel(i3);
		image.setBounds(350, 20, 250, 200);
		add(image);
		
		
		
		setSize(600, 300);
		setLocation(450,200);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		new Login();
	}

}
