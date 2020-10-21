import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtJanuary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(34, 11, 261, 144);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(305, 11, 280, 144);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(595, 11, 256, 144);
		contentPane.add(l3);
		
		Image img1 = new ImageIcon(this.getClass().getResource("c10v2.jpg")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("c7v3.jpg")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("c3v3.jpg")).getImage();
		
		l1.setIcon(new ImageIcon(img1));
		l2.setIcon(new ImageIcon(img2));
		l3.setIcon(new ImageIcon(img3));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 166, 822, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(34, 276, 551, 2);
		contentPane.add(separator_1);
		
		JTextArea txtrScConstructiiSrl = new JTextArea();
		txtrScConstructiiSrl.setBounds(34, 179, 551, 99);
		txtrScConstructiiSrl.setBackground(UIManager.getColor("Button.background"));
		txtrScConstructiiSrl.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrScConstructiiSrl.setText("S.C. Constructii S.R.L. is one of the most important companies on the Romanian\r\nmarket. With over 120 employees, the company is known for its competence, efficacy\r\nand dedication. Some of the main projects in which our company was involved include \r\n\"Nadia Comaneci\" Stadium from Boldur, Faget City Hall, Zizin Danube Bridge and the \r\nBucharest-Pitesti Motorway Section.");
		txtrScConstructiiSrl.setEditable(false);
		contentPane.add(txtrScConstructiiSrl);
		
		JTextArea txtrScConstructiiSrl_1 = new JTextArea();
		txtrScConstructiiSrl_1.setBounds(605, 179, 246, 261);
		txtrScConstructiiSrl_1.setBackground(UIManager.getColor("Button.background"));
		txtrScConstructiiSrl_1.setText("S.C. Constructii S.R.L.\r\n\r\nNr. ord. Reg. Com.: J40/2553/2004\r\nA.F./C.U.I.: RO 16159232 \r\nSediu social: Str. Tepes Voda nr. 52,\r\nSector 2, Bucuresti\r\nCod IBAN:\r\nRO20 BTRL 0410 1202 8017 36XX\r\n\r\nTel/Fax: 021 - 311.61.96\r\nMobil: 0723.464.241\r\nE-mail: contructii@constructii.ro");
		txtrScConstructiiSrl_1.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(txtrScConstructiiSrl_1);
		
		JButton btnNewButton = new JButton("Projects");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Projects p = new Projects();
				p.setVisible(true);
			}
		});
		btnNewButton.setBounds(34, 302, 142, 49);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Team");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Team t = new Team();
				t.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(224, 302, 136, 49);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Help");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help h = new Help();
				h.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(409, 302, 136, 49);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(btnNewButton_2);
		
		txtJanuary = new JTextField();
		txtJanuary.setBounds(305, 420, 280, 20);
		txtJanuary.setBorder(null);
		txtJanuary.setCaretColor(UIManager.getColor("Button.background"));
		txtJanuary.setBackground(new Color(240, 240, 240));
		txtJanuary.setForeground(UIManager.getColor("Button.darkShadow"));
		txtJanuary.setHorizontalAlignment(SwingConstants.CENTER);
		txtJanuary.setFont(new Font("Arial", Font.PLAIN, 14));
		txtJanuary.setText("7 January 2019 - SC Constructii SRL");
		txtJanuary.setEditable(false);
		contentPane.add(txtJanuary);
		txtJanuary.setColumns(10);
	}

}
