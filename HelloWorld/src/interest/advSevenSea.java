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
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class advSevenSea extends JPanel {


	private Image logo = new ImageIcon(adventureMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(adventureMain.class.getResource("/adventure/Seven Sea.PNG")).getImage().getScaledInstance(925,196, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(adventureMain.class.getResource("/adventure/Seven Sea 1.PNG")).getImage().getScaledInstance(217, 237, Image.SCALE_SMOOTH);
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public advSevenSea() {
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
		
		JLabel titleBanner = new JLabel("SEVEN SEA");
		titleBanner.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBanner.setHorizontalAlignment(SwingConstants.CENTER);
		titleBanner.setForeground(Color.WHITE);
		titleBanner.setBounds(322, 80, 355, 55);
		add(titleBanner);
		
		JLabel titleBanner2 = new JLabel("WATER PARK");
		titleBanner2.setHorizontalAlignment(SwingConstants.CENTER);
		titleBanner2.setForeground(Color.WHITE);
		titleBanner2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBanner2.setBounds(322, 132, 355, 55);
		add(titleBanner2);
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JTextPane txtContent1 = new JTextPane();
		txtContent1.setBackground(new Color(205, 133, 63));
		txtContent1.setForeground(new Color(255, 255, 255));
		txtContent1.setEditable(false);
		txtContent1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		txtContent1.setText("Seven Seas Waterpark is the Philippines' first world-class pirate-themed waterpark. The waterpark, which opened in 2017, features over 12 thrilling slides, a 5,000-square-meter twin wave pool, a 400-meter-long lazy river, and a variety of other family-friendly attractions and services.\n\nIt's in the town of Opol, just minutes from Cagayan de Oro's bustling city. Seven Seas Waterpark was already recognized as the best waterpark in Mindanao in its early years. This Pirate-themed attraction is a thrill-paradise, seeker's ready to provide you with a fun-filled, action-packed day!");
		txtContent1.setBounds(30, 302, 595, 337);
		add(txtContent1);
		
		JLabel imageContent1 = new JLabel("");
		imageContent1.setIcon(new ImageIcon(contentImage1));
		imageContent1.setBounds(635, 346, 217, 237);
		add(imageContent1);
		
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
		
		JLabel barracudaBanner = new JLabel("");
		barracudaBanner.setIcon(new ImageIcon(banner));
		barracudaBanner.setBounds(0, 0, 925, 187);
		add(barracudaBanner);
		
		JLabel titleContent1 = new JLabel("Seven Seas Waterpark");
		titleContent1.setHorizontalAlignment(SwingConstants.CENTER);
		titleContent1.setForeground(Color.WHITE);
		titleContent1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		titleContent1.setBounds(187, 195, 538, 55);
		add(titleContent1);
		
		JLabel lblAWorldOf = new JLabel("A world of fun and adventure awaits you at the largest, pirate-themed waterpark in the Philippines!\n");
		lblAWorldOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblAWorldOf.setForeground(Color.WHITE);
		lblAWorldOf.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		lblAWorldOf.setBounds(20, 236, 871, 55);
		add(lblAWorldOf);

	}
}

