package marinduque;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import agusan.agusanMain;
import marinduque.marinduqueMain;

public class bathalaCave extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/bathala cave1.jpg")).getImage().getScaledInstance(925,196, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/bathala cave2.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage2 = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/bathala cave3.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public bathalaCave() {
		setVisible(false);
		setBounds(0, 0, 925, 809);
		setBackground(new Color(205, 133, 63));
		setLayout(null);
		
		JLabel backBtn = new JLabel("BACK <<");
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				backBtn.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backBtn.setForeground(Color.WHITE);
			}
		});
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JLabel titleBathalaCave = new JLabel("BATHALA CAVE");
		titleBathalaCave.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBathalaCave.setHorizontalAlignment(SwingConstants.CENTER);
		titleBathalaCave.setForeground(Color.WHITE);
		titleBathalaCave.setBounds(273, 53, 355, 55);
		add(titleBathalaCave);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(banner));
		lblNewLabel.setBounds(0, 0, 925, 187);
		add(lblNewLabel);
		
		JTextPane txtBathalaCave = new JTextPane();
		txtBathalaCave.setBackground(new Color(205, 133, 63));
		txtBathalaCave.setForeground(new Color(255, 255, 255));
		txtBathalaCave.setEditable(false);
		txtBathalaCave.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		txtBathalaCave.setText("\tBathala Cave is a cave system on Marinduque's jungle-clad mountainside that consists of seven caves, but only four are open to the general public: Church, Secret, Python, and Cemetery Caves. Church Cave is the largest cave in the area, with stalactites and stalagmites that mimic the interior of a church. Python Cave is known for the pythons resting on the walls and hundreds of big bats at the ceilings. Human bones have been discovered in Cemetery Cave, which are thought to be the remains of battle warriors. While Secret Cave is named after its numerous rock formations and hidden escape hole.");
		txtBathalaCave.setBounds(10, 198, 905, 126);
		add(txtBathalaCave);
		
		JTextPane txtBathalaCave1 = new JTextPane();
		txtBathalaCave1.setBackground(new Color(205, 133, 63));
		txtBathalaCave1.setForeground(new Color(255, 255, 255));
		txtBathalaCave1.setText(" \tThe biggest cave is called Kuweba ng Simbahan (Cave of the Church), as it was used for worship. It was believed to be the home of Amang Bathala, the Supreme God of the Tagalogs, the indegneous inhabitants of the Philippines. The cave is big enough for 100 people. It seems the cave has always attracted extremists, terrorists and religious sects. The Pulajan Movement worshipped their Supreme God here to regain the potency of their amulets. They believed that their amulets could protect them from the bullets of the American colonizers and their Filipinos allies. The fanatical group was founded by Faustino Ablen, an illiterate peasant. He teclared himself Pope. The next were the Samahang Tatlong Persona Solo Dios, who stayed at the cave for a long time during the early 1900s. This sect was formed in Mount Banahaw in Quezon by Agapito Illustrisimo. The beleive that Banahaw and Bathala Cave are spiritually connected. They still have a center at the cave. The next cave is 100 m away and called Cemetrey Cave, as it was used as a burial site. Excavations revealed earthen jars, china jars, coffin fragments and human relics, including 13 skulls. The excavation was carried out by the French archaeologist Alfred Marche.\r\n \tThe Python Cave is guarded by numerous living pythons. The strange thing is, that the snakes are normally dangerous and aggressive, but here at the cave they are not harmful. They are said to have never harmed visitors. Visitors even take pictures as close as 35 cm. The locals explain this with the fact that the snakes are the pets of Bathala.\r\n");
		txtBathalaCave1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtBathalaCave1.setEditable(false);
		txtBathalaCave1.setBounds(20, 461, 905, 187);
		add(txtBathalaCave1);
		
		JLabel bathalaImageContainer1 = new JLabel("");
		bathalaImageContainer1.setIcon(new ImageIcon(contentImage1));
		bathalaImageContainer1.setBounds(174, 323, 217, 144);
		add(bathalaImageContainer1);
		
		JLabel bathalaImageContainer2 = new JLabel("");
		bathalaImageContainer2.setIcon(new ImageIcon(contentImage2));
		bathalaImageContainer2.setBounds(543, 326, 217, 144);
		add(bathalaImageContainer2);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(Color.DARK_GRAY);
		footer.setBounds(0, 655, 925, 94);
		add(footer);
		
		JLabel footerTitle2 = new JLabel("Travel Vlog");
		footerTitle2.setForeground(Color.WHITE);
		footerTitle2.setFont(new Font("Verdana", Font.BOLD, 15));
		footerTitle2.setBounds(138, 38, 101, 45);
		footer.add(footerTitle2);
		
		JLabel footerTitle1 = new JLabel("Travel List Journey");
		footerTitle1.setForeground(Color.WHITE);
		footerTitle1.setFont(new Font("Verdana", Font.BOLD, 17));
		footerTitle1.setBounds(111, 20, 191, 37);
		footer.add(footerTitle1);
		
		JLabel footerLogo = new JLabel("");
		footerLogo.setIcon(new ImageIcon(logo));
		footerLogo.setHorizontalAlignment(SwingConstants.CENTER);
		footerLogo.setBounds(35, 11, 84, 75);
		footer.add(footerLogo);
		
		textField = new JTextField();
		textField.setText("ENTER YOUR EMAIL");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(455, 46, 288, 35);
		footer.add(textField);
		
		JButton btnSubscribe = new JButton("SUBSCRIBE");
		btnSubscribe.setForeground(Color.BLACK);
		btnSubscribe.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		btnSubscribe.setFocusPainted(false);
		btnSubscribe.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		btnSubscribe.setBackground(Color.GRAY);
		btnSubscribe.setBounds(753, 46, 138, 37);
		footer.add(btnSubscribe);
		
		JLabel footerParag = new JLabel("Subscribe here and get the latest travel tips.");
		footerParag.setForeground(Color.WHITE);
		footerParag.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		footerParag.setBounds(432, 20, 430, 27);
		footer.add(footerParag);
		
		JLabel copyRight = new JLabel("\u00A9COPYRIGHT 2022");
		copyRight.setForeground(Color.WHITE);
		copyRight.setFont(new Font("Segoe UI Semibold", Font.BOLD, 10));
		copyRight.setBounds(138, 55, 101, 45);
		footer.add(copyRight);

	}
}

