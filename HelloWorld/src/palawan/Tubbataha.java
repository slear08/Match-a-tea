package palawan;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Tubbataha extends JPanel {
	private JTextField textField;
	
	private Image logo = new ImageIcon(palawanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/WEBSITE.jpg")).getImage().getScaledInstance(925,300, Image.SCALE_SMOOTH);
	private Image banner1 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Tubbataha Reefs.jpg")).getImage().getScaledInstance(333,164, Image.SCALE_SMOOTH);

	/**
	 * Create the panel.
	 */
	
	public Tubbataha() {
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
		
		
		JLabel titleTubbataha = new JLabel("TUBBATAHA REEFS");
		titleTubbataha.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		titleTubbataha.setForeground(Color.WHITE);
		titleTubbataha.setHorizontalAlignment(SwingConstants.CENTER);
		titleTubbataha.setBounds(309, 121, 305, 56);
		add(titleTubbataha);
		
		JLabel tubbatahaBanner = new JLabel("");
		tubbatahaBanner.setIcon(new ImageIcon(banner));
		tubbatahaBanner.setBounds(0, 0, 925, 189);
		add(tubbatahaBanner);
		
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
		
		JTextPane txtTubbaha = new JTextPane();
		txtTubbaha.setForeground(new Color(255, 255, 255));
		txtTubbaha.setBackground(new Color(205, 133, 63));
		txtTubbaha.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtTubbaha.setEditable(false);
		txtTubbaha.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtTubbaha.setText("Tubbataha Reefs Natural Park lies in a unique position in the centre of the Sulu Sea, and includes the Tubbataha and Jessie Beazley Reefs. It protects an area of almost 100,000 hectares of high quality marine habitats containing three atolls and a large area of deep sea. The property is home to a great diversity of marine life. Whales, dolphins, sharks, turtles and Napoleon wrasse are amongst the key species found here. The reef ecosystems support over 360 species of coral and almost 700 species of fish. The reserve also protects one of the few remaining colonies of breeding seabirds in the region. Tubbataha Reefs Natural Park contains excellent examples of pristine reefs with a high diversity of marine life. The property includes extensive reef flats and perpendicular walls reaching over 100m depth, as well as large areas of deep sea. The remote and undisturbed character of the property and the continued presence of large marine fauna such as tiger sharks, cetaceans and turtles, and big schools of pelagic fishes such as barracuda and trevallies add to the aesthetic qualities of the property. Tubbataha Reefs Natural Park lies in a unique position in the middle of the Sulu Sea and is one of the Philippines\u2019 oldest ecosystems. It plays a key role in the process of reproduction, dispersal and colonization by marine organisms in the whole Sulu Sea system, and helps support fisheries outside its boundaries. The property is a natural laboratory for the study of ecological and biological processes, displaying the ongoing process of coral reef formation, and supporting a large number of marine species dependant on reef ecosystems. The presence of top predator species, such as tiger and hammerhead sharks, are indicators of the ecological balance of the property. The property also offers a demonstration site to study the responses of a natural reef system in relation to the impacts of climate change.");
		txtTubbaha.setBounds(37, 421, 830, 233);
		add(txtTubbaha);
		
		JLabel tubbatahaImageContent = new JLabel("");
		tubbatahaImageContent.setIcon(new ImageIcon(banner1));
		tubbatahaImageContent.setBounds(295, 200, 333, 164);
		add(tubbatahaImageContent);
		
		JLabel contentTitle = new JLabel("Tubbataha Reefs Universal Value ");
		contentTitle.setForeground(new Color(255, 255, 255));
		contentTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 23));
		contentTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentTitle.setBounds(267, 375, 383, 33);
		add(contentTitle);
		
		
	}
}
