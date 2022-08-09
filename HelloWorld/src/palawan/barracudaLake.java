package palawan;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import agusan.agusanMain;

public class barracudaLake extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Baraccuda Lake.jpg")).getImage().getScaledInstance(925,196, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Barracuda-Lake.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage2 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/barracuda-lake (1).jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage3 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/freediving-in-barracuda.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public barracudaLake() {
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
		
		JLabel titleBarracuda = new JLabel("BARRACUDA LAKE");
		titleBarracuda.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titleBarracuda.setHorizontalAlignment(SwingConstants.CENTER);
		titleBarracuda.setForeground(Color.WHITE);
		titleBarracuda.setBounds(273, 53, 355, 55);
		add(titleBarracuda);
		
		JLabel barracudaBanner = new JLabel("");
		barracudaBanner.setIcon(new ImageIcon(banner));
		barracudaBanner.setBounds(0, 0, 925, 187);
		add(barracudaBanner);
		
		JTextPane txtpnBarracudaLakeIs = new JTextPane();
		txtpnBarracudaLakeIs.setBackground(new Color(205, 133, 63));
		txtpnBarracudaLakeIs.setForeground(new Color(255, 255, 255));
		txtpnBarracudaLakeIs.setEditable(false);
		txtpnBarracudaLakeIs.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		txtpnBarracudaLakeIs.setText("Barracuda Lake is a particularly unusual diving experience, named after a gigantic barracuda fish skeleton discovered there. As if the lake's stunning blue water and dark limestone cliffs weren't enough, it also hides a mystery beneath the surface. Barracuda Lake diving mixes an outstanding diving experience in tropical Coron with the sensation of walking on the moon \u2014 the strange sensation of being trapped between two worlds over and over again. There's the weightlessness of floating and playing in a space where gravity appears to have lost its effect on you and everything around you; then there's the moment when your body travels between two layers of water that are 10 degrees Celsius apart in temperature.");
		txtpnBarracudaLakeIs.setBounds(10, 198, 905, 126);
		add(txtpnBarracudaLakeIs);
		
		JTextPane txtpnBarracudaLakeSituated = new JTextPane();
		txtpnBarracudaLakeSituated.setBackground(new Color(205, 133, 63));
		txtpnBarracudaLakeSituated.setForeground(new Color(255, 255, 255));
		txtpnBarracudaLakeSituated.setText("Starting out on the surface of the lake, divers, swimmers, and scuba enthusiasts can expect temperatures around 82 degrees Fahrenheit. But as you descend into the depths of the lake, around 45 to 50 feet down, the temperature drastically changes to just over 100 degrees Fahrenheit (to put that in perspective, most people keep their hot tubs at 104 degrees, so it\u2019s best to forego a wetsuit here). \r\n\tThis strange increase in temperature is due to the fact that the lake contains both salt and freshwater. Divers can even see the thin, distinct boundary that separates the two bodies of water. The lake is also characterized by an impressive display of limestone formations that rise up on all sides and extend beneath the surface. Divers have described a sense of \u201Cweightlessness\u201D while exploring the hot/cool depths, and the sensorial experience (which is largely devoid of flora and fauna) has also been likened to what it must feel like to walk on the moon. But the lake holds yet another surprise: just when the salt watery heat becomes a tad unbearable, the temperature changes back to cool again near the bottom. Another unique feature of the lake is the sand at the very bottom, which has been described as \u201Cjelly-like,\u201D \u201Csilky,\u201D \u201Cairy,\u201D and \u201Csilty.\u201D It\u2019s apparently good for play, too. And although the barracudas aren\u2019t really around anymore, if you\u2019re lucky, you may still catch a glimpse of one.");
		txtpnBarracudaLakeSituated.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtpnBarracudaLakeSituated.setEditable(false);
		txtpnBarracudaLakeSituated.setBounds(20, 478, 905, 166);
		add(txtpnBarracudaLakeSituated);
		
		JLabel barracudaImageContent1 = new JLabel("");
		barracudaImageContent1.setIcon(new ImageIcon(contentImage1));
		barracudaImageContent1.setBounds(44, 326, 217, 144);
		add(barracudaImageContent1);
		
		JLabel barracudaImageContent2 = new JLabel("");
		barracudaImageContent2.setIcon(new ImageIcon(contentImage2));
		barracudaImageContent2.setBounds(347, 326, 217, 144);
		add(barracudaImageContent2);
		
		JLabel barracudaImageContent3 = new JLabel("");
		barracudaImageContent3.setIcon(new ImageIcon(contentImage3));
		barracudaImageContent3.setBounds(658, 326, 217, 144);
		add(barracudaImageContent3);
		
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

	}
}
