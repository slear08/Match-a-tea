package agusan;

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


public class begaFalls extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(agusanMain.class.getResource("/destinationResAgusan/Bega-Falls1.jpg")).getImage().getScaledInstance(925,284, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(agusanMain.class.getResource("/destinationResAgusan/Bega-Falls2.jpg")).getImage().getScaledInstance(409, 270, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	private JLabel contentBanner;
	/**
	 * Create the panel.
	 */
	public begaFalls() {
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
		
		JLabel titleBanner = new JLabel("Bega Falls");
		titleBanner.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBanner.setHorizontalAlignment(SwingConstants.CENTER);
		titleBanner.setForeground(Color.WHITE);
		titleBanner.setBounds(310, 229, 355, 55);
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
		txtContent.setText("Bega Falls is considered as one of the most amazing waterfalls in the entire province of Agusan del Sur. It is a 4-tier falls of refreshing and cold waters hidden in the jungles of the province. Each falls has its own catch basin good for swimming. However, the first tier or the topmost waterfall is the most impressive of them all. The water cascades on the gigantic limestone boulder down the wide basin below. Picnicking, swimming and cliff-jumping are the best things to do here.\r\n\r\nTo reach the waterfalls, you must register first at the Barangay Hall. Then a 30 to 45 minutes descent hike following an established trail leading to the falls. Make sure to wear hiking shoes.\n\n Bega Falls is located in Barangay Mabuhay, Prosperidad, Agusan del Sur.\n");
		txtContent.setBounds(38, 331, 437, 311);
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
		ImageContent.setBounds(485, 344, 409, 270);
		add(ImageContent);

	}
}

