package interest;

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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class diveMain extends JPanel {

	private Image logo = new ImageIcon(intrestMainPanel.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(intrestMainPanel.class.getResource("/dive/mantigue.jpg")).getImage().getScaledInstance(925,236, Image.SCALE_SMOOTH);
	private Image adv1 = new ImageIcon(intrestMainPanel.class.getResource("/dive/Apo-Reef-17-1024x768.jpg")).getImage().getScaledInstance(211,284, Image.SCALE_SMOOTH);
	private Image adv2  = new ImageIcon(intrestMainPanel.class.getResource("/dive/samal island.jpg")).getImage().getScaledInstance(211,284, Image.SCALE_SMOOTH);
	private Image adv3  = new ImageIcon(intrestMainPanel.class.getResource("/dive/Oslob-swmming-with-whaleshark.jpg")).getImage().getScaledInstance(211,284, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	
	
//	
//	private begaFalls begaFalls = new begaFalls();
//	private putingBuhanginCave putingBuhanginCave = new putingBuhanginCave();
//	private tugononFalls tugononFalls = new tugononFalls(); 
	/**
	 * Create the panel.
	 */
	public diveMain() {
		setVisible(false);
		setBounds(0, 0, 925, 756);
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
				backBtn.setForeground(Color.BLACK);
			}
		});
		
		JLabel parag2 = new JLabel("unusual wreck dives, rainbow-colored reefs, and a large variety of marine life.");
		parag2.setHorizontalAlignment(SwingConstants.CENTER);
		parag2.setForeground(Color.WHITE);
		parag2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		parag2.setBounds(127, 109, 643, 24);
		add(parag2);
		
		JLabel parag1 = new JLabel("Whether on land or in the water, satisfy your need for");
		parag1.setHorizontalAlignment(SwingConstants.CENTER);
		parag1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		parag1.setForeground(Color.WHITE);
		parag1.setBounds(218, 89, 459, 24);
		add(parag1);
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setForeground(Color.BLACK);
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JLabel titleBarracuda = new JLabel("DIVE");
		titleBarracuda.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBarracuda.setHorizontalAlignment(SwingConstants.CENTER);
		titleBarracuda.setForeground(Color.WHITE);
		titleBarracuda.setBounds(281, 43, 355, 55);
		add(titleBarracuda);
		
		JLabel barracudaBanner = new JLabel("");
		barracudaBanner.setIcon(new ImageIcon(banner));
		barracudaBanner.setBounds(0, 0, 925, 187);
		add(barracudaBanner);
		
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
		
		JPanel panelContainer = new JPanel();
		panelContainer.setBackground(Color.DARK_GRAY);
		panelContainer.setBounds(66, 220, 793, 424);
		add(panelContainer);
		panelContainer.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_1.setBackground(new Color(205, 133, 63));
		panel_1.setBounds(10, 57, 773, 356);
		panelContainer.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel titleContent1 = new JLabel("APO REEF");
		titleContent1.setHorizontalAlignment(SwingConstants.CENTER);
		titleContent1.setForeground(Color.WHITE);
		titleContent1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		titleContent1.setBounds(62, 7, 176, 22);
		panel_1.add(titleContent1);
		
		JLabel titleContent2 = new JLabel("SAMAL ISLAND");
		titleContent2.setHorizontalAlignment(SwingConstants.CENTER);
		titleContent2.setForeground(Color.WHITE);
		titleContent2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		titleContent2.setBounds(308, 7, 176, 22);
		panel_1.add(titleContent2);
		
		JLabel titleContent3 = new JLabel("SHARK WHALE POINT");
		titleContent3.setHorizontalAlignment(SwingConstants.CENTER);
		titleContent3.setForeground(Color.WHITE);
		titleContent3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		titleContent3.setBounds(532, 7, 241, 22);
		panel_1.add(titleContent3);
		
		JLabel contentImage1 = new JLabel("");
		contentImage1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				titleContent1.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				titleContent1.setForeground(Color.WHITE);
			}
		});
		contentImage1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentImage1.setIcon(new ImageIcon(adv1));
		contentImage1.setBounds(42, 40, 211, 284);
		panel_1.add(contentImage1);
		
		JLabel contentImage2 = new JLabel("");
		contentImage2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				titleContent2.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				titleContent2.setForeground(Color.WHITE);
			}
		});
		contentImage2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentImage2.setIcon(new ImageIcon(adv2));
		contentImage2.setBounds(287, 40, 211, 284);
		panel_1.add(contentImage2);
		
		JLabel contentImage3 = new JLabel("");
		contentImage3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				titleContent3.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				titleContent3.setForeground(Color.WHITE);
			}
		});
		contentImage3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentImage3.setIcon(new ImageIcon(adv3));
		contentImage3.setBounds(532, 40, 211, 284);
		panel_1.add(contentImage3);
		
	
		
		JLabel lblNewLabel = new JLabel("UNFORGETTABLE TRAVEL EXPERIENCES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		lblNewLabel.setBounds(102, 11, 610, 37);
		panelContainer.add(lblNewLabel);

	}
	
	public void destinationClicked(JPanel panel) {
//		.setVisible(false);
//		.setVisible(false);
//		.setVisible(false);
		panel.setVisible(true);
		
	}
	public void closeTab() {
//		.setVisible(false);
//		.setVisible(false);
//		.setVisible(false);
	}
}

