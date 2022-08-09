package marinduque;

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

public class paadjaoFalls extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/Paadjao Falls.jpg")).getImage().getScaledInstance(925,196, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/paadjao falls1.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage2 = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/paadjao falls2.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	private Image contentImage3 = new ImageIcon(marinduqueMain.class.getResource("/destinationResMarinduque/paadjao falls3.jpg")).getImage().getScaledInstance(217, 144, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public paadjaoFalls() {
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
		
		JLabel titlePaadjaoFalls = new JLabel("PAADJAO FALLS");
		titlePaadjaoFalls.setFont(new Font("Segoe UI Semibold", Font.BOLD, 33));
		titlePaadjaoFalls.setHorizontalAlignment(SwingConstants.CENTER);
		titlePaadjaoFalls.setForeground(Color.WHITE);
		titlePaadjaoFalls.setBounds(273, 46, 355, 55);
		add(titlePaadjaoFalls);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(banner));
		lblNewLabel.setBounds(0, 0, 925, 187);
		add(lblNewLabel);
		
		JTextPane txtpnBarracudaLakeIs = new JTextPane();
		txtpnBarracudaLakeIs.setBackground(new Color(205, 133, 63));
		txtpnBarracudaLakeIs.setForeground(new Color(255, 255, 255));
		txtpnBarracudaLakeIs.setEditable(false);
		txtpnBarracudaLakeIs.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		txtpnBarracudaLakeIs.setText("\tBarangay Bocboc is home to Paadjao Falls. This 100-foot-long waterfall drops into a 6-foot-deep basin encircled by thick trees. Its water is chilly all year, and it feeds the Mogpog River. It's a thirty-minute climb from Barangay Bocboc to get there. It is the province's most accessible waterfall, and residents can easily provide directions when needed. If you're unsure about hiking without a guide, hire one.This waterfall is an undervalued tourist attraction in Mogpog, Marinduque, yet it is a favorite picnic and nature escape area for local families and parties.");
		txtpnBarracudaLakeIs.setBounds(71, 222, 801, 126);
		add(txtpnBarracudaLakeIs);
		
		JTextPane txtpnBarracudaLakeSituated = new JTextPane();
		txtpnBarracudaLakeSituated.setBackground(new Color(205, 133, 63));
		txtpnBarracudaLakeSituated.setForeground(new Color(255, 255, 255));
		txtpnBarracudaLakeSituated.setText("The series of gently cascading falls that settles into a 15-foot fall. Hunt for nature- formed bathtubs downstream and enjoy Jacuzzi-like effect. It is an ideal place for picnicking or camping.");
		txtpnBarracudaLakeSituated.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		txtpnBarracudaLakeSituated.setEditable(false);
		txtpnBarracudaLakeSituated.setBounds(76, 376, 767, 55);
		add(txtpnBarracudaLakeSituated);
		
		JLabel paadjaoImageContent1 = new JLabel("");
		paadjaoImageContent1.setIcon(new ImageIcon(contentImage1));
		paadjaoImageContent1.setBounds(83, 457, 217, 144);
		add(paadjaoImageContent1);
		
		JLabel paadjaoImageContent2 = new JLabel("");
		paadjaoImageContent2.setIcon(new ImageIcon(contentImage2));
		paadjaoImageContent2.setBounds(353, 457, 217, 144);
		add(paadjaoImageContent2);
		
		JLabel paadjaoImageContent3 = new JLabel("");
		paadjaoImageContent3.setIcon(new ImageIcon(contentImage3));
		paadjaoImageContent3.setBounds(626, 457, 217, 144);
		add(paadjaoImageContent3);
		
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

