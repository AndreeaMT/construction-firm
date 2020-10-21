import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Team extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Team frame = new Team();
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
	public Team() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 894, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTeam = new JTextArea();
		txtrTeam.setEditable(false);
		txtrTeam.setFont(new Font("Arial", Font.BOLD, 20));
		txtrTeam.setText("   Team");
		txtrTeam.setBounds(168, 66, 95, 24);
		contentPane.add(txtrTeam);
		
		JTextArea txtrTeamEngineersEugen = new JTextArea();
		txtrTeamEngineersEugen.setForeground(new Color(152, 251, 152));
		txtrTeamEngineersEugen.setBackground(new Color(72, 61, 139));
		txtrTeamEngineersEugen.setFont(new Font("Arial", Font.PLAIN, 16));
		txtrTeamEngineersEugen.setText(" \r\n\r\n  Engineers: \r\n  Eugen Platon - internal verification\r\n  Bogdan Vasile - technical expert\r\n  Ion Mojoiu\r\n  Marius Nedelcu\r\n  Ionel Purice\r\n  Florin Ungureanu\r\n  Claudia Iorgoiu\r\n  Mihaela Dima\r\n  Stere Caracoti\r\n\r\n  Technicians:\r\n  Luminita Pentoiu\r\n  Dragos Dumitru\r\n\r\n  Economist:\r\n  Cornelia Zaharia");
		txtrTeamEngineersEugen.setEditable(false);
		txtrTeamEngineersEugen.setBounds(37, 56, 359, 374);
		contentPane.add(txtrTeamEngineersEugen);
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(0, 0, 946, 503);
		contentPane.add(l1);
		Image img = new ImageIcon(this.getClass().getResource("c2v2.jpg")).getImage();
		l1.setIcon(new ImageIcon(img));
	}

}
