package dinagatIsland;

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

public class lakeBababu extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(dinagatIslandMain.class.getResource("/destinationResDinagat/Lake bababu 1.jpg")).getImage().getScaledInstance(925,284, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(dinagatIslandMain.class.getResource("/destinationResDinagat/Lake bababu 2.jpg")).getImage().getScaledInstance(409, 270, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	private JLabel contentBanner;
	/**
	 * Create the panel.
	 */
	public lakeBababu() {
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
		
		JLabel titleBanner = new JLabel("Lake Bababu");
		titleBanner.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBanner.setHorizontalAlignment(SwingConstants.CENTER);
		titleBanner.setForeground(Color.WHITE);
		titleBanner.setBounds(307, 206, 355, 55);
		add(titleBanner);
		
		contentBanner = new JLabel("");
		contentBanner.setIcon(new ImageIcon(banner));
		contentBanner.setBounds(0, 0, 925, 284);
		add(contentBanner);
		
		JTextPane txtContent = new JTextPane();
		txtContent.setForeground(new Color(255, 255, 255));
		txtContent.setBackground(new Color(205, 133, 63));
		txtContent.setEditable(false);
		txtContent.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		txtContent.setText("We hiked to Bababu Lake on Bababu Island, Dinagat, which was an amazing experience. The lake was discovered by Peter Langit right after World War II. Peter passed away in 1995. His tomb is at the start of the trek to the lake on a small secluded beach. His family continues to watch over the lake and its surroundings. Peter\u2019s son lives with his mother on that small beach and guided us to the lake. Isn\u2019t that amazing? It took us a bit more than half an hour to get to the lake and it certainly was not a walk in the park. We had to trek up and down on a steep, very uneven, rocky jungle trail, sometimes having to use ropes. It was very beautiful though and the reward was a refreshing swim in the pristine lake.\r\nThe Bababu lake is \u2018meromictic\u2019 which means that it has both freshwater, down to 20 feet, and salt water, below 20 feet. The fresh and salt water don\u2019t mix because there is no wind at the Bababu Lake. There are only 10 meromictic lakes in the Philippines. Most lakes are holomictic which means that at least once a year there is a physical mixing of the surface and the deep waters. This mixing can be driven by wind, which creates waves and turbulence at the lake\u2019s surface. There are about a thousand times more holomictic than meromictic lakes in the world (thanks to Wikipedia!). You learn every day!\r\nThere is also an underwater cave of about 650 metres, the longest in the Philippines, that takes your from the lake to the sea. It takes an hour for a cave diver to cross the underwater cave from one entrance to the other. For those who love a workout this lake is a great destination. Some people might find the trail too difficult though. Wear shoes!\r\nGo island hopping with us at Dinagat and visit Lake Bababu!\r\n");
		txtContent.setBounds(24, 296, 421, 352);
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
		ImageContent.setBounds(455, 332, 409, 270);
		add(ImageContent);

	}
}
