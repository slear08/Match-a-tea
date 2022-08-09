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

import marinduque.bathalaCave;
import marinduque.marinduqueMain;
import marinduque.mongpongIsland;
import marinduque.paadjaoFalls;

public class romblonMain extends JPanel {

	private Image logo = new ImageIcon(romblonMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/ROMBLON-COVER.jpg")).getImage().getScaledInstance(925,206, Image.SCALE_SMOOTH);
	private Image pic1 = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/mt-guiting1.jpg")).getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
	private Image pic2 = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/dagubdub falls1.jpg")).getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
	private Image pic3 = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/Saint Joseph Cathedral1.jpg")).getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);

	private JTextField textField;
	/**
	 * Create the panel.
	 */
	private mountGuiting  mountGuiting = new mountGuiting ();
	private dagubdubFalls dagubdubFalls = new dagubdubFalls();
	private  stJosephCathedral stJosephCathedral = new stJosephCathedral();
	
	
	public romblonMain() {
		setVisible(false);
		setBounds(0, 76, 925, 809);
		setBackground(new Color(205, 133, 63));
		setLayout(null);
		add(mountGuiting);
		add(dagubdubFalls);
		add(stJosephCathedral);
	
		
		JLabel destinationlabel1 = new JLabel("Mount Guiting");
		destinationlabel1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel1.setForeground(Color.WHITE);
		destinationlabel1.setBounds(246, 639, 120, 14);
		add(destinationlabel1);
		
		JLabel destinationlabel2 = new JLabel("Dagubdub Falls");
		destinationlabel2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel2.setForeground(Color.WHITE);
		destinationlabel2.setBounds(401, 639, 120, 14);
		add(destinationlabel2);
		
		JLabel destinationlabel3 = new JLabel("Saint Joseph Cathedral");
		destinationlabel3.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel3.setForeground(Color.WHITE);
		destinationlabel3.setBounds(561, 639, 119, 14);
		add(destinationlabel3);
		
		JLabel bannerImageContainer = new JLabel("");
		bannerImageContainer.setIcon(new ImageIcon(banner));
		bannerImageContainer.setBounds(0, 0, 925, 206);
		add(bannerImageContainer);
		
		JTextPane txtpnBluewaterSwayingPalm = new JTextPane();
		txtpnBluewaterSwayingPalm.setEditable(false);
		txtpnBluewaterSwayingPalm.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnBluewaterSwayingPalm.setBackground(new Color(205, 133, 63));
		txtpnBluewaterSwayingPalm.setForeground(Color.WHITE);
		txtpnBluewaterSwayingPalm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		txtpnBluewaterSwayingPalm.setText("Romblon Island is the hub of the Romblon Province and home to the famous Bonbon Beach. However, there is a slew of other attractions just waiting to be discovered. Romblon had arguably the best beaches of all the islands in the Romblon Province, which made it a much more relaxing island. However, it also had its fair share of waterfalls, island hopping, and epic viewpoints. I put together this list of the highlights from our stay on Romblon Island.");
		txtpnBluewaterSwayingPalm.setBounds(170, 288, 620, 174);
		add(txtpnBluewaterSwayingPalm);
		
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
		footerLogo.setHorizontalAlignment(SwingConstants.CENTER);
		footerLogo.setBounds(35, 11, 84, 75);
		footerLogo.setIcon(new ImageIcon(logo));
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 476, 925, 33);
		add(panel);
		
		JLabel lblDestinations = new JLabel("DESTINATIONS");
		lblDestinations.setForeground(Color.WHITE);
		lblDestinations.setFont(new Font("Verdana", Font.BOLD, 17));
		panel.add(lblDestinations);
		
		JLabel destination1 = new JLabel("");
		destination1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		destination1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(mountGuiting );
			}
		});
		destination1.setIcon(new ImageIcon(pic1));
		destination1.setBounds(246, 520, 120, 120);
		add(destination1);
		
		JLabel destination2 = new JLabel("");
		destination2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		destination2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(dagubdubFalls );
			}
		});
		destination2.setIcon(new ImageIcon(pic2));
		destination2.setBounds(401, 520, 120, 120);
		add(destination2);
		
		JLabel destination3 = new JLabel("");
		destination3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		destination3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(stJosephCathedral);
			}
		});
		destination3.setIcon(new ImageIcon(pic3));
		destination3.setBounds(561, 520, 120, 120);
		add(destination3);
		
		JLabel contentTitle = new JLabel("EVERYTHING YOU NEED TO KNOW ABOUT ROMBLON");
		contentTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 26));
		contentTitle.setForeground(Color.WHITE);
		contentTitle.setBounds(121, 228, 701, 68);
		add(contentTitle);
		
	}
	public void destinationClicked(JPanel panel) {
		mountGuiting.setVisible(false);
		dagubdubFalls.setVisible(false);
		stJosephCathedral.setVisible(false);
		panel.setVisible(true);
		
	}
	public void closeTab() {
		mountGuiting.setVisible(false);
		dagubdubFalls.setVisible(false);
		stJosephCathedral.setVisible(false);

	}
}