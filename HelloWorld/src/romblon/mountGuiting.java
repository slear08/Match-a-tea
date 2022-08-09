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
import marinduque.marinduqueMain;

public class mountGuiting extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(marinduqueMain.class.getResource("/destinationResRomblon/mt-guiting1.jpg")).getImage().getScaledInstance(925,284, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(marinduqueMain.class.getResource("/destinationResRomblon/mt-guiting2.jpg")).getImage().getScaledInstance(409, 270, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	private JLabel mtGuitingBanner;
	/**
	 * Create the panel.
	 */
	public mountGuiting() {
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
				backBtn.setForeground(Color.BLACK);
			}
		});
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setForeground(Color.BLACK);
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JLabel titleMtGuiting = new JLabel("MT. Guiting");
		titleMtGuiting.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleMtGuiting.setHorizontalAlignment(SwingConstants.CENTER);
		titleMtGuiting.setForeground(Color.WHITE);
		titleMtGuiting.setBounds(299, 112, 355, 55);
		add(titleMtGuiting);
		
		mtGuitingBanner = new JLabel("");
		mtGuitingBanner.setIcon(new ImageIcon(banner));
		mtGuitingBanner.setBounds(0, 0, 925, 284);
		add(mtGuitingBanner);
		
		JTextPane txtMtGuiting = new JTextPane();
		txtMtGuiting.setForeground(new Color(255, 255, 255));
		txtMtGuiting.setBackground(new Color(205, 133, 63));
		txtMtGuiting.setEditable(false);
		txtMtGuiting.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtMtGuiting.setText("Mount Guiting-Guiting, which rises 2,058 meters above sea level in the centre of Sibuyan Island, is one of Romblon's most famous tourist destinations. The mountain is covered in dense woods and home to a diverse range of indigenous flora and fauna. Among several other Philippine mountains, it is one of the most difficult and challenging to climb for mountaineers. The ascent follows a rocky path that passes over steep and jagged ridges known as Knife Ridge, Kiss the Wall, and Peak of Deception, which are reputed to be impassable when wet. It is recommended that you hire a guide and follow a three-day itinerary.");
		txtMtGuiting.setBounds(38, 344, 437, 270);
		add(txtMtGuiting);
		
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
		
		JLabel guitingImageContent = new JLabel("");
		guitingImageContent .setIcon(new ImageIcon(contentImage1));
		guitingImageContent.setBounds(485, 344, 409, 270);
		add(guitingImageContent);

	}
}
