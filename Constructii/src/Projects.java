import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Projects extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtBraila;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtTimisoara;
	private JTextField textField_8;
	private JTextField txtFaget;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txtArad;
	private JTextField textField_16;
	private JTextField txtCaransebes;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextArea textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projects frame = new Projects();
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
	public Projects() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 894, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProjects = new JLabel("Projects");
		lblProjects.setFont(new Font("Arial", Font.BOLD, 20));
		lblProjects.setBounds(32, 22, 135, 35);
		contentPane.add(lblProjects);
		
		JLabel lblBelowYouCan = new JLabel("Below you can see the ongoing projects of our company.");
		lblBelowYouCan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBelowYouCan.setBounds(32, 58, 394, 43);
		contentPane.add(lblBelowYouCan);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(427, 227, 135, 92);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(32, 227, 135, 92);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(427, 124, 135, 92);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(32, 124, 135, 92);
		contentPane.add(l4);
		
		Image img1 = new ImageIcon(this.getClass().getResource("l1img.jpg")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("l2img.jpg")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("l3img.jpg")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("l4img.jpg")).getImage();
		Image img5 = new ImageIcon(this.getClass().getResource("l5img.jpg")).getImage();
		
		l1.setIcon(new ImageIcon(img1));
		l2.setIcon(new ImageIcon(img2));
		l3.setIcon(new ImageIcon(img3));
		l4.setIcon(new ImageIcon(img4));
		
		JLabel l5 = new JLabel("");
		l5.setBounds(32, 330, 135, 92);
		contentPane.add(l5);
		l5.setIcon(new ImageIcon(img5));
		
		JLabel l11 = new JLabel("Budget");
		l11.setBounds(177, 124, 48, 14);
		contentPane.add(l11);
		
		JLabel l12 = new JLabel("Location");
		l12.setBounds(177, 149, 84, 14);
		contentPane.add(l12);
		
		JLabel l13 = new JLabel("No of workers");
		l13.setBounds(177, 174, 101, 14);
		contentPane.add(l13);
		
		JLabel l14 = new JLabel("Completion date");
		l14.setBounds(177, 199, 118, 14);
		contentPane.add(l14);
		
		JLabel l21 = new JLabel("Budget");
		l21.setBounds(177, 227, 48, 14);
		contentPane.add(l21);
		
		JLabel l22 = new JLabel("Location");
		l22.setBounds(177, 252, 101, 14);
		contentPane.add(l22);
		
		JLabel l23 = new JLabel("No of workers");
		l23.setBounds(177, 275, 101, 14);
		contentPane.add(l23);
		
		JLabel l24 = new JLabel("Completion date");
		l24.setBounds(177, 300, 101, 14);
		contentPane.add(l24);
		
		JLabel l31 = new JLabel("Budget");
		l31.setBounds(177, 330, 48, 14);
		contentPane.add(l31);
		
		JLabel l32 = new JLabel("Location");
		l32.setBounds(177, 355, 101, 14);
		contentPane.add(l32);
		
		JLabel l33 = new JLabel("No of workers");
		l33.setBounds(177, 376, 101, 14);
		contentPane.add(l33);
		
		JLabel l34 = new JLabel("Completion date");
		l34.setBounds(177, 401, 118, 14);
		contentPane.add(l34);
		
		JLabel l41 = new JLabel("Budget");
		l41.setBounds(572, 124, 48, 14);
		contentPane.add(l41);
		
		JLabel l42 = new JLabel("Location");
		l42.setBounds(572, 149, 76, 14);
		contentPane.add(l42);
		
		JLabel l43 = new JLabel("No of workers");
		l43.setBounds(572, 174, 95, 14);
		contentPane.add(l43);
		
		JLabel l44 = new JLabel("Completion date");
		l44.setBounds(572, 202, 95, 14);
		contentPane.add(l44);
		
		JLabel l51 = new JLabel("Budget");
		l51.setBounds(572, 227, 48, 14);
		contentPane.add(l51);
		
		JLabel l52 = new JLabel("Location");
		l52.setBounds(572, 252, 95, 14);
		contentPane.add(l52);
		
		JLabel l53 = new JLabel("No of workers");
		l53.setBounds(572, 275, 95, 14);
		contentPane.add(l53);
		
		JLabel l54 = new JLabel("Completion date");
		l54.setBounds(572, 300, 108, 14);
		contentPane.add(l54);
		
		textField = new JTextField();
		textField.setText("200 000");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(269, 121, 148, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtBraila = new JTextField();
		txtBraila.setEditable(false);
		txtBraila.setText("Braila");
		txtBraila.setHorizontalAlignment(SwingConstants.CENTER);
		txtBraila.setBounds(269, 146, 148, 20);
		contentPane.add(txtBraila);
		txtBraila.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("21");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(269, 171, 148, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("2021");
		textField_3.setBounds(269, 196, 148, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("1 200 000");
		textField_4.setBounds(269, 227, 148, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("60");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(269, 272, 148, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("2022");
		textField_6.setBounds(269, 297, 148, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		txtTimisoara = new JTextField();
		txtTimisoara.setText("Timisoara");
		txtTimisoara.setEditable(false);
		txtTimisoara.setHorizontalAlignment(SwingConstants.CENTER);
		txtTimisoara.setBounds(269, 249, 148, 20);
		contentPane.add(txtTimisoara);
		txtTimisoara.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("500 000");
		textField_8.setBounds(269, 330, 148, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		txtFaget = new JTextField();
		txtFaget.setText("Faget");
		txtFaget.setHorizontalAlignment(SwingConstants.CENTER);
		txtFaget.setEditable(false);
		txtFaget.setBounds(269, 352, 148, 20);
		contentPane.add(txtFaget);
		txtFaget.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("34");
		textField_10.setBounds(269, 376, 148, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setText("2023");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setBounds(269, 402, 148, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("2020");
		textField_12.setBounds(664, 196, 148, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("45");
		textField_13.setBounds(664, 171, 148, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText("3 000 000");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setBounds(664, 121, 148, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		txtArad = new JTextField();
		txtArad.setEditable(false);
		txtArad.setText("Arad");
		txtArad.setHorizontalAlignment(SwingConstants.CENTER);
		txtArad.setBounds(664, 146, 148, 20);
		contentPane.add(txtArad);
		txtArad.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setText("1 750 000");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setBounds(664, 224, 148, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		txtCaransebes = new JTextField();
		txtCaransebes.setText("Caransebes");
		txtCaransebes.setHorizontalAlignment(SwingConstants.CENTER);
		txtCaransebes.setEditable(false);
		txtCaransebes.setBounds(664, 249, 148, 20);
		contentPane.add(txtCaransebes);
		txtCaransebes.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setText("2019");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setBounds(664, 297, 148, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setText("16");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setBounds(664, 272, 148, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblToViewAny = new JLabel("To view any technical project please use the link below:");
		lblToViewAny.setBounds(427, 355, 310, 14);
		contentPane.add(lblToViewAny);
		
		textField_20 = new JTextArea();
		textField_20.setBackground(UIManager.getColor("Button.background"));
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_20.setEditable(false);
		textField_20.setText("https://drive.google.com/open?id=1eY7wIMRg6eJLCTTMJP3UHc1JUjqGwPtF");
		textField_20.setColumns(10);
		textField_20.setBounds(427, 374, 391, 20);
		contentPane.add(textField_20);
	}

}
