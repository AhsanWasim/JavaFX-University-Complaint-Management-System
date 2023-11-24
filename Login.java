import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {

	Login()
	{
		setLayout(null);
		setTitle("Complaint Management System");
		
		ImageIcon IC1= new ImageIcon(ClassLoader.getSystemResource("icons/ii.jpeg"));
		Image I2=IC1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon re= new ImageIcon(I2);
		JLabel labl1= new JLabel(re);
		labl1.setBounds(50,40,200,200);
		add(labl1);
		
		JLabel show= new JLabel("Welcome to Login Page");
		show.setFont(new Font("Osward",Font.BOLD,25));
		show.setBounds(250,100,400,100);
		add(show);
		//labl1.setVisible(true);
		getContentPane().setBackground(Color.GRAY);
		
		setSize(800,480);
		setVisible(true);
		setLocation(350,150);
	}
	
	
}
