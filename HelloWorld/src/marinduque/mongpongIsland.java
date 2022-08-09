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

public class mongpongIsland extends JPanel {


	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/Mongpong Island.jpg")).getImage().getScaledInstance(925,284, Image.SCALE_SMOOTH);
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public mongpongIsland() {
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
		
		JLabel titleMongpong = new JLabel("Mongpong Island");
		titleMongpong.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleMongpong.setHorizontalAlignment(SwingConstants.CENTER);
		titleMongpong.setForeground(Color.WHITE);
		titleMongpong.setBounds(299, 41, 355, 55);
		add(titleMongpong);
		
		JLabel mongpongBanner = new JLabel("");
		mongpongBanner.setIcon(new ImageIcon(banner));
		mongpongBanner.setBounds(0, 0, 925, 284);
		add(mongpongBanner);
		
		JTextPane txtpnBarracudaLakeIs = new JTextPane();
		txtpnBarracudaLakeIs.setForeground(new Color(255, 255, 255));
		txtpnBarracudaLakeIs.setBackground(new Color(205, 133, 63));
		txtpnBarracudaLakeIs.setEditable(false);
		txtpnBarracudaLakeIs.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtpnBarracudaLakeIs.setText("\tAmong the islands surrounding Marinduque, Mongpong Island is the farthest but one of the most visited islands. Ungab Rock is a beautiful arch bridge rock formation towering about 100 feet above the alluring crystal clear waters. The island's eastern section has a kilometer-long strip of white sand beach with crushed corals, while the northern part is one of the province's greatest dive locations. It is a populated island where the nice and humble inhabitants rely on farming and fishing for their livelihood.\r\n\r\n\tMongpong Island has a vast stretch of white beach facing southwest and northwest. The sand is a mixture of fine to coarse. I won\u2019t lie and tell people that the beach is creamy white sand tapos pagdating nila hindi naman, hindi naman ako nambubudol. But what I really like about Mongpong is its clean coastal area, few to no people swimming around (which you could actually own the entire beach), and the turquoise crystal clear waters surrounding the island");
		txtpnBarracudaLakeIs.setBounds(51, 310, 831, 258);
		add(txtpnBarracudaLakeIs);
		
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
