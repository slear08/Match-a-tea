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

public class advSeaOfClouds extends JPanel {

	private Image logo = new ImageIcon(adventureMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(adventureMain.class.getResource("/adventure/sea of lcouds.png")).getImage().getScaledInstance(925,196, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(adventureMain.class.getResource("/adventure/sea of clouds.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage2 = new ImageIcon(adventureMain.class.getResource("/adventure/sea of clouds.png")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage3 = new ImageIcon(adventureMain.class.getResource("/adventure/sea of clouds.png")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public advSeaOfClouds() {
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
		
		JLabel titleBanner = new JLabel("TANAY SEA OF CLOUDS");
		titleBanner.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBanner.setHorizontalAlignment(SwingConstants.CENTER);
		titleBanner.setForeground(Color.WHITE);
		titleBanner.setBounds(255, 47, 456, 55);
		add(titleBanner);
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JTextPane txtContent1 = new JTextPane();
		txtContent1.setBackground(new Color(205, 133, 63));
		txtContent1.setForeground(new Color(255, 255, 255));
		txtContent1.setEditable(false);
		txtContent1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		txtContent1.setText("There\u2019s a curious cat in all of us that wants to feel something out of the ordinary. It\u2019s the \u201CWe always want what we don\u2019t have\u201D syndrome that\u2019s got us hooked in the reel of tourist attractions offering rare and unusual experiences, like freediving, riding a hot air balloon, skydiving, and even ghost hunting. But, for the lesser adventurous kind (that\u2019s me), watching a sea of clouds linger over mountains and valleys is more than enough to take my breath away. So if you\u2019re looking for a sea of clouds in the Philippines, this one\u2019s for you!");
		txtContent1.setBounds(19, 263, 614, 126);
		add(txtContent1);
		
		JTextPane textContent3 = new JTextPane();
		textContent3.setBackground(new Color(205, 133, 63));
		textContent3.setForeground(new Color(255, 255, 255));
		textContent3.setText("If you want to live on the edge, are daring, and looking for an adrenaline-pumping weekend (or any given day) experience, head to Mati at Mindanao Saga Flying Club for an unforgettable and unique excursion flying high above the city \u2013 and seeing the land, the mountains, islands, and beautiful beaches while wearing only a helmet! Though riding an ultralight with an open cockpit generates noise, motion sickness is uncommon. ");
		textContent3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		textContent3.setEditable(false);
		textContent3.setBounds(20, 468, 613, 112);
		add(textContent3);
		
		JLabel imageContent1 = new JLabel("");
		imageContent1.setIcon(new ImageIcon(contentImage1));
		imageContent1.setBounds(643, 246, 217, 144);
		add(imageContent1);
		
		JLabel imageContent2 = new JLabel("");
		imageContent2.setIcon(new ImageIcon(contentImage2));
		imageContent2.setBounds(643, 422, 217, 144);
		add(imageContent2);
		
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
		
		JLabel titleContent1 = new JLabel("SEA OF CLOUDS");
		titleContent1.setForeground(Color.WHITE);
		titleContent1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		titleContent1.setBounds(19, 198, 237, 55);
		add(titleContent1);
		
		JTextPane textContent2 = new JTextPane();
		textContent2.setText("A place where the clouds feel like a few metres apart from you.You might think that catching the sea of clouds on a lovely morning cannot possibly be taken on another level.");
		textContent2.setForeground(Color.WHITE);
		textContent2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		textContent2.setEditable(false);
		textContent2.setBackground(new Color(205, 133, 63));
		textContent2.setBounds(20, 401, 603, 46);
		add(textContent2);

	}
}


