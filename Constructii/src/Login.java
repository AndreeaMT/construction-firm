import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(40,40,200,40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(40,100,100,20);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(40,120,200,30);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(40,170,100,20);
		frame.getContentPane().add(lblPassword);
		
		p1 = new JPasswordField();
		p1.setBackground(new Color(255, 255, 255));
		p1.setBounds(40,190,200,30);
		frame.getContentPane().add(p1);
		
		JButton b1 = new JButton("Login");
		b1.setBounds(140,240,100,30);
		frame.getContentPane().add(b1);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
						if(t1.getText().contentEquals("Andreea") && String.copyValueOf(p1.getPassword()).contentEquals("1234")) {
							JOptionPane.showMessageDialog(null, "Welcome!");
							frame.setVisible(false);
							Home h = new Home();
							h.setVisible(true);
						}
						else JOptionPane.showMessageDialog(null, "Invalid username and password!");
				}catch(Exception e) {System.out.println(e);}
			}
		});
	}

}
