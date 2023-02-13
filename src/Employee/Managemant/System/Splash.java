package Employee.Managemant.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Splash extends JFrame implements ActionListener {
	
	public Splash() {
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(80, 30,1200, 60);
		heading.setFont(new Font("serif",Font.PLAIN, 60));
		heading.setForeground(Color.BLACK);
		add(heading); 
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));		
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image  = new JLabel(i3);
		image.setBounds(50, 100, 1050, 500);
		add(image);
		
		JButton clickhere = new JButton("CLICK TO CONTINUE");
		clickhere.setBounds(400,400,300,70);
		clickhere.setBackground(Color.RED);
		clickhere.setForeground(Color.white);
		clickhere.addActionListener(this);
		clickhere.setSize(200, 50);
		image.add(clickhere);
		
		
		//Edit Frame Size
		setSize(1170, 650);
		setLocation(200, 50);
		setVisible(true);
		while(true) {
			heading.setVisible(false);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
			heading.setVisible(true);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
	
	public static void main(String args[]) {
		new Splash();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Login();
		
	}

}
