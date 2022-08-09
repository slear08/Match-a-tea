import java.awt.Color;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;



public class Contact extends JPanel {
	private JTextField textField;
	private Image logo = new ImageIcon(Home.class.getResource("res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image liveChat = new ImageIcon(Home.class.getResource("res/live-chat.png")).getImage().getScaledInstance(176,181, Image.SCALE_SMOOTH);
	private Image email = new ImageIcon(Home.class.getResource("res/email.png")).getImage().getScaledInstance(176,181, Image.SCALE_SMOOTH);
	private Image text = new ImageIcon(Home.class.getResource("res/text-message.png")).getImage().getScaledInstance(176,181, Image.SCALE_SMOOTH);
	private Image socialMedia = new ImageIcon(Home.class.getResource("res/social-media.png")).getImage().getScaledInstance(176,181, Image.SCALE_SMOOTH);
	/**
	 * Create the panel.
	 */
	public Contact() {
		setBounds(0, 76, 925, 739);
		setBackground(new Color(205, 133, 63));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Contact.class.getResource("/res/img3.png")));
		lblNewLabel.setBounds(0, 0, 925, 195);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONTACT US");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(319, 206, 259, 41);
		add(lblNewLabel_1);
		
		JTextPane txtpnWeAppreciateReading = new JTextPane();
		txtpnWeAppreciateReading.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnWeAppreciateReading.setForeground(Color.WHITE);
		txtpnWeAppreciateReading.setBackground(new Color(205, 133, 63));
		txtpnWeAppreciateReading.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		txtpnWeAppreciateReading.setText("We appreciate hearing from readers, so get in touch if you have any valuable feedback, need guidance on trip planniing, have concerns about your first trip, or simply have a\r\n                                                       question for us.");
		txtpnWeAppreciateReading.setBounds(103, 244, 734, 81);
		add(txtpnWeAppreciateReading);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(Color.DARK_GRAY);
		footer.setBounds(0, 633, 925, 106);
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
		footerLogo.setBounds(33, 20, 84, 75);
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
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(liveChat));
		lblNewLabel_2.setBounds(52, 336, 176, 181);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(email));
		lblNewLabel_2_1.setBounds(262, 336, 176, 181);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(text));
		lblNewLabel_2_2.setBounds(458, 344, 176, 173);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(socialMedia));
		lblNewLabel_2_3.setBounds(671, 317, 176, 181);
		add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("Live Chat");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(62, 509, 135, 27);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Available 24/7");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(68, 535, 125, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Replies within 3 business days");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(227, 535, 236, 14);
		add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(284, 509, 135, 27);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Response within an hour");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_4_2.setBounds(473, 535, 176, 14);
		add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Text");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(487, 509, 135, 27);
		add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Response time less");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_4_3.setBounds(691, 516, 154, 14);
		add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Social Media");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_3_3.setBounds(681, 490, 176, 27);
		add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("than 24 hours");
		lblNewLabel_4_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3_1.setForeground(Color.WHITE);
		lblNewLabel_4_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_4_3_1.setBounds(692, 531, 154, 14);
		add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_5 = new JLabel("Let's Chat \u2192");
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_5.setBounds(72, 547, 147, 41);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Drop Us A Line \u2192");
		lblNewLabel_5_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_5_1.setBounds(247, 547, 206, 41);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Text Us \u2192");
		lblNewLabel_5_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_5_2.setBounds(509, 547, 125, 41);
		add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Find Us \u2192");
		lblNewLabel_5_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_5_3.setBounds(712, 547, 125, 41);
		add(lblNewLabel_5_3);
	
	}
}
