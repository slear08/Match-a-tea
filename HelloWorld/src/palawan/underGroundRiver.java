package palawan;

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

public class underGroundRiver extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Puerto Princesa Subteranean river.jpg")).getImage().getScaledInstance(925,242, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Barracuda-Lake.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage2 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/barracuda-lake (1).jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage3 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/freediving-in-barracuda.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public underGroundRiver() {
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
		
		JLabel titlePuerto = new JLabel("Puerto Princesa Subteranean River");
		titlePuerto.setFont(new Font("Segoe UI Semibold", Font.BOLD, 35));
		titlePuerto.setHorizontalAlignment(SwingConstants.CENTER);
		titlePuerto.setForeground(Color.WHITE);
		titlePuerto.setBounds(145, 187, 650, 55);
		add(titlePuerto);
		
		JLabel puertoBanner = new JLabel("");
		puertoBanner.setIcon(new ImageIcon(banner));
		puertoBanner.setBounds(0, 0, 925, 242);
		add(puertoBanner);
		
		JTextPane txtPuerto1 = new JTextPane();
		txtPuerto1.setForeground(new Color(255, 255, 255));
		txtPuerto1.setBackground(new Color(205, 133, 63));
		txtPuerto1.setEditable(false);
		txtPuerto1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		txtPuerto1.setText("\tThe Puerto-Princesa Subterranean River National Park is home to one of the world's most remarkable cave systems, with spectacular limestone karst landscapes, pure natural beauty, preserved old-growth forests, and unique animals. It is situated on the midwestern coast of Palawan, roughly 76 kilometers northwest of Puerto Princesa and 360 kilometers southwest of Manila, in the south-western region of the Philippine Archipelago.\n\nAn 8.2km underground river runs through the property, which covers an area of approximately 22,202 acres. The fact that it runs directly into the sea, with its brackish bottom half vulnerable to tidal action, distinguishes this subterranean river system as a significant natural global occurrence. The cavern of the river has some amazing, eye-catching rock structures. The site is home to a complete mountain-to-sea ecosystem that provides a diverse range of services.");
		txtPuerto1.setBounds(29, 253, 864, 187);
		add(txtPuerto1);
		
		JTextPane txtPuerto2 = new JTextPane();
		txtPuerto2.setBackground(new Color(205, 133, 63));
		txtPuerto2.setForeground(new Color(255, 255, 255));
		txtPuerto2.setText("A trip to the subterranean river national park is absolutely worth the effort if you're visiting Palawan. It's an otherworldly experience as you paddle through the dark. The clicking of bats and the echoing drips of water are the only sounds you hear. You'll glide through cavernous rock cathedrals and past stalactites into the centre of the earth. Most tours will take you 4 km (2.5 miles) along the river. Some tours with special permits organised in advance can explore all 8.2 kilometres (5 miles). That far into the cave, boats can no longer pass and visitors have to swim between the rock walls. Conquer your fears of small, dark spaces however, and you\u2019ll be treated to the rare sights of waterfalls gushing through the cave walls, a unique 20 million-year-old fossil of a sirenia or manatee, and a tiny rock passage that leads into a vast room, carpeted from floor to ceiling in glimmering crystals. Even the journey to the cave itself is worth it: you\u2019ll enjoy a scenic 20-minute boat ride across the sea, past towering limestone karsts and walk through the national park, home to monkeys swinging through the tree canopies and giant monitor lizards slinking their way through the undergrowth.");
		txtPuerto2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtPuerto2.setEditable(false);
		txtPuerto2.setBounds(29, 474, 859, 149);
		add(txtPuerto2);
		
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
