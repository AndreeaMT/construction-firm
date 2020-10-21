import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Help extends JFrame {

	private JPanel contentPane;
	private String s;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 894, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseSendYour = new JLabel("Please send your request writing it in the box below:");
		lblPleaseSendYour.setForeground(Color.WHITE);
		lblPleaseSendYour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseSendYour.setBounds(38, 73, 397, 14);
		contentPane.add(lblPleaseSendYour);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setForeground(Color.WHITE);
		lblHelp.setFont(new Font("Arial", Font.BOLD, 20));
		lblHelp.setBounds(38, 35, 83, 35);
		contentPane.add(lblHelp);
		
		JTextArea txtrM = new JTextArea();
		txtrM.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrM.setLineWrap(true);
		txtrM.setBounds(38, 108, 805, 225);
		contentPane.add(txtrM);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = txtrM.getText();
				JOptionPane.showMessageDialog(null, "Thank you! Your request will be processed as soon as possible.");
				txtrM.setText("");
			}
		});
		btnSend.setBounds(447, 390, 109, 35);
		contentPane.add(btnSend);
		
		JButton btnRetry = new JButton("Retry");
		btnRetry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrM.setText("");
			}
		});
		btnRetry.setBounds(567, 390, 115, 35);
		contentPane.add(btnRetry);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 860, 379);
		contentPane.add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("c16.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
	}

}
