package romblon;

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


public class dagubdubFalls extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/dagubdub falls1.jpg")).getImage().getScaledInstance(925,196, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/dagubdub falls2.jpg")).getImage().getScaledInstance(427, 279, Image.SCALE_SMOOTH);
	 
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public dagubdubFalls() {
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
		
		JLabel titleDagubdub = new JLabel("DAGUBDUB FALLS");
		titleDagubdub.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleDagubdub.setHorizontalAlignment(SwingConstants.CENTER);
		titleDagubdub.setForeground(Color.WHITE);
		titleDagubdub.setBounds(254, 117, 355, 55);
		add(titleDagubdub);
		
		JLabel dagubdubBanner = new JLabel("");
		dagubdubBanner.setIcon(new ImageIcon(banner));
		dagubdubBanner.setBounds(0, 0, 925, 187);
		add(dagubdubBanner);
		
		JTextPane txtDagudub = new JTextPane();
		txtDagudub.setBackground(new Color(205, 133, 63));
		txtDagudub.setForeground(new Color(255, 255, 255));
		txtDagudub.setEditable(false);
		txtDagudub.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		txtDagudub.setText("Dagubdub Falls is a popular Romblon tourist attraction that features four waterfalls on various heights, as well as a crystal clear freshwater plunge pool that is ideal for swimming and cliff diving. The falls are only a few steps apart and are worth exploring due to their proximity to or between massive boulders. Although the majority of people prefer swimming at the third level and cliff jumping in the second and fourth levels. The hike to the falls is a significant adventure that includes going over simple terrain, a little clear river, and a bridge while enjoying a stunning view of Mount Guiting-Guiting. It's best to hire a local guide.");
		txtDagudub.setBounds(63, 198, 379, 279);
		add(txtDagudub);
		
		JLabel dagubdubImageContent = new JLabel("");
		dagubdubImageContent.setIcon(new ImageIcon(contentImage1));
		dagubdubImageContent.setBounds(452, 198, 427, 279);
		add(dagubdubImageContent);
		
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
		
		JTextPane txtpnDagubdubFallsIs = new JTextPane();
		txtpnDagubdubFallsIs.setBackground(new Color(205, 133, 63));
		txtpnDagubdubFallsIs.setForeground(Color.WHITE);
		txtpnDagubdubFallsIs.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		txtpnDagubdubFallsIs.setText("Dagubdub Falls is an interesting destination in Romblon composed of 4 waterfalls on different levels with crystal clear freshwater plunge pool alluring for swimming and cliff diving. The falls are just few steps away from the other worth exploring being surrounded by or in between huge boulders. Though most people like swimming in 3rd level and cliff jumping on 2nd and 4th level. Going to the falls is a considerable adventure following a trail leading to the falls with a beautiful view of Mount Guiting-Guiting passing through an easy terrain, a small clear river and a bridge. A local guide is recommended. This is a great place to bring a packed lunch, hang out on the rocks in the sun and chill out for half a day");
		txtpnDagubdubFallsIs.setBounds(63, 488, 818, 159);
		add(txtpnDagubdubFallsIs);
		

	}
}

