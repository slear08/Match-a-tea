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

import palawan.Tubbataha;
import palawan.barracudaLake;
import palawan.palawanMain;
import palawan.underGroundRiver;

public class dinagatIslandMain extends JPanel {

	private Image logo = new ImageIcon(dinagatIslandMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(dinagatIslandMain.class.getResource("/destinationResDinagat/Dinagat Island 1.jpg")).getImage().getScaledInstance(925,206, Image.SCALE_SMOOTH);

	private Image pic1 = new ImageIcon(dinagatIslandMain.class.getResource("/destinationResDinagat/Bitaog Beach 1.jpg")).getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
	private Image pic2 = new ImageIcon(dinagatIslandMain.class.getResource("/destinationResDinagat/Lake bababu 1.jpg")).getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
	private Image pic3 = new ImageIcon(dinagatIslandMain.class.getResource("/destinationResDinagat/PBMA Shrine 1.jpg")).getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);

	private JTextField textField;
	/**
	 * Create the panel.
	 */
	private bitaogBeach bitaogBeach  = new bitaogBeach();
	private lakeBababu lakeBababu = new lakeBababu();
	private PBMAShrine PBMAShrine = new PBMAShrine();

	
	
	public dinagatIslandMain() {
		setVisible(false);
		setBounds(0, 76, 925, 809);
		setBackground(new Color(205, 133, 63));
		setLayout(null);
		add(bitaogBeach);
		add(lakeBababu);
		add(PBMAShrine);
		
		
		JLabel destinationlabel1 = new JLabel("Bitaog Beach");
		destinationlabel1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel1.setForeground(Color.WHITE);
		destinationlabel1.setBounds(246, 639, 120, 14);
		add(destinationlabel1);
		
		JLabel destinationlabel2 = new JLabel("Lake Bababu");
		destinationlabel2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel2.setForeground(Color.WHITE);
		destinationlabel2.setBounds(401, 639, 120, 14);
		add(destinationlabel2);
		
		JLabel destinationlabel3 = new JLabel("PBMA Shrine");
		destinationlabel3.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel3.setForeground(Color.WHITE);
		destinationlabel3.setBounds(561, 639, 119, 14);
		add(destinationlabel3);
		
		JLabel mapImage = new JLabel("");
		mapImage.setBounds(608, 215, 252, 251);
		add(mapImage);
		
		JLabel bannerImageContainer = new JLabel("");
		bannerImageContainer.setIcon(new ImageIcon(banner));
		bannerImageContainer.setBounds(0, 0, 925, 206);
		add(bannerImageContainer);
		
		JTextPane txtpnBluewaterSwayingPalm = new JTextPane();
		txtpnBluewaterSwayingPalm.setEditable(false);
		txtpnBluewaterSwayingPalm.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnBluewaterSwayingPalm.setBackground(new Color(205, 133, 63));
		txtpnBluewaterSwayingPalm.setForeground(Color.WHITE);
		txtpnBluewaterSwayingPalm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		txtpnBluewaterSwayingPalm.setText("Bluewater, swaying palm trees and white beaches. In the morning you take a boat trip along a lagoon where you swim with turtles and kayak above the coral, in the afternoon fresh fish is served on a desert island and in the evening you take a massage on the beach. Life is not that bad! That\u2019s how an average day looked like when we travelled for two weeks through Palawan, a beautiful Filipino island! In this blog, you will find eight reasons why you should ab-so-lutely go to Palawan.\r\n\nPalawan is arguably one of the top tourist destinations in the tropical paradise of the Philippines. Read on and discover the stunning sights that are responsible for making this island-province so breathtakingly irresistible to globetrotters.\n");
		txtpnBluewaterSwayingPalm.setBounds(60, 291, 620, 174);
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
				destinationClicked(bitaogBeach);
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
				destinationClicked(lakeBababu);
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
				destinationClicked(PBMAShrine);
			}
		});
		destination3.setIcon(new ImageIcon(pic3));
		destination3.setBounds(561, 520, 120, 120);
		add(destination3);
		
		JLabel contentTitle = new JLabel("EVERYTHING YOU NEED TO KNOW ABOUT DINAGAT ISLAND");
		contentTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		contentTitle.setForeground(Color.WHITE);
		contentTitle.setBounds(60, 217, 703, 68);
		add(contentTitle);
		
	}
	public void destinationClicked(JPanel panel) {
		bitaogBeach.setVisible(false);
		lakeBababu.setVisible(false);
		PBMAShrine.setVisible(false);
		panel.setVisible(true);
		
	}
	public void closeTab() {
		bitaogBeach.setVisible(false);
		lakeBababu.setVisible(false);
		PBMAShrine.setVisible(false);
	}
}

