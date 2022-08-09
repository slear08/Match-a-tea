package backup;


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


public class interestTemplate extends JPanel {

//	private Image logo = new ImageIcon(intrestMainPanel.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
//	private Image banner = new ImageIcon(intrestMainPanel.class.getResource("/res/travel-world 2.jpg")).getImage().getScaledInstance(925,236, Image.SCALE_SMOOTH);
//	private Image adv = new ImageIcon(intrestMainPanel.class.getResource("/adventure/aircarft 2.PNG")).getImage().getScaledInstance(163,126, Image.SCALE_SMOOTH);
//	
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public interestTemplate() {
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
				backBtn.setForeground(Color.WHITE);
			}
		});
		
		JLabel parag2 = new JLabel("adventure. In the Philippines, you'll find plenty of adventurous activities!");
		parag2.setHorizontalAlignment(SwingConstants.CENTER);
		parag2.setForeground(Color.BLACK);
		parag2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		parag2.setBounds(149, 103, 555, 24);
		add(parag2);
		
		JLabel parag1 = new JLabel("Whether on land or in the water, satisfy your need for");
		parag1.setHorizontalAlignment(SwingConstants.CENTER);
		parag1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		parag1.setForeground(new Color(0, 0, 0));
		parag1.setBounds(218, 89, 459, 14);
		add(parag1);
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JLabel titleBarracuda = new JLabel("ADVENTURES");
		titleBarracuda.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBarracuda.setHorizontalAlignment(SwingConstants.CENTER);
		titleBarracuda.setForeground(Color.WHITE);
		titleBarracuda.setBounds(269, 30, 355, 55);
		add(titleBarracuda);
		
		JLabel barracudaBanner = new JLabel("");
//		barracudaBanner.setIcon(new ImageIcon(banner));
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
//		footerLogo.setIcon(new ImageIcon(logo));
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
		
		JLabel contentImage1 = new JLabel("New label");
		contentImage1.setBounds(10, 21, 211, 284);
		panel_1.add(contentImage1);
		
		JLabel contentImage2 = new JLabel("New label");
		contentImage2.setBounds(287, 21, 211, 284);
		panel_1.add(contentImage2);
		
		JLabel contentImage3 = new JLabel("New label");
		contentImage3.setBounds(552, 21, 211, 284);
		panel_1.add(contentImage3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 303, 176, 22);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(231, 303, 176, 22);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setBounds(530, 303, 176, 22);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel = new JLabel("UNFORGETTABLE TRAVEL EXPERIENCES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		lblNewLabel.setBounds(102, 11, 610, 37);
		panelContainer.add(lblNewLabel);

	}
}

