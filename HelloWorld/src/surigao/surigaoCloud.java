package surigao;

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

public class surigaoCloud extends JPanel {
	private Image logo = new ImageIcon(surigaoMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(surigaoMain.class.getResource("/destinationResSurigao/Surigao Cloud 1.jpg")).getImage().getScaledInstance(925,284, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(surigaoMain.class.getResource("/destinationResSurigao/Surigao Cloud 2.jpg")).getImage().getScaledInstance(409, 270, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	private JLabel contentBanner;
	/**
	 * Create the panel.
	 */
	public surigaoCloud() {
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
		backBtn.setForeground(new Color(255, 255, 255));
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JLabel titleBanner = new JLabel("Surigao Cloud");
		titleBanner.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBanner.setHorizontalAlignment(SwingConstants.CENTER);
		titleBanner.setForeground(Color.BLACK);
		titleBanner.setBounds(290, 229, 355, 55);
		add(titleBanner);
		
		contentBanner = new JLabel("");
		contentBanner.setIcon(new ImageIcon(banner));
		contentBanner.setBounds(0, 0, 925, 284);
		add(contentBanner);
		
		JTextPane txtContent = new JTextPane();
		txtContent.setForeground(new Color(255, 255, 255));
		txtContent.setBackground(new Color(205, 133, 63));
		txtContent.setEditable(false);
		txtContent.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtContent.setText("Cloud 9 is one of the most visited tourist spots in Surigao del Norte. Did you know that Siargao Island, especially in the municipality of General Luna, is famous as the \u201CSurfing Capital in the Philippines?.\u201D It gained its reputation from these huge waves called \u201CCloud 9\u201C. Eventually, the locals called this surfing site in Siargao as Cloud 9. Every year, there is a domestic and international surfing competition in Siargao sponsored by the local government.\r\n\r\nCloud 9 is located Siargao Island particularly in Barangay Catangnan, General Luna, Surigao del Norte. Recommended accommodation in Cloud 9: Ocean 101 Cloud 9 Beach Resort");
		txtContent.setBounds(38, 326, 437, 301);
		add(txtContent);
		
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
		
		JLabel ImageContent = new JLabel("");
		ImageContent .setIcon(new ImageIcon(contentImage1));
		ImageContent.setBounds(485, 326, 409, 270);
		add(ImageContent);

	}
}

