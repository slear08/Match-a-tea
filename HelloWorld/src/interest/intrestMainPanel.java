package interest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


import javax.swing.JTextPane;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class intrestMainPanel extends JPanel {
	
	private Image logo = new ImageIcon(intrestMainPanel.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(intrestMainPanel.class.getResource("/res/travel-world.jpg")).getImage().getScaledInstance(925,236, Image.SCALE_SMOOTH);
	private Image adv = new ImageIcon(intrestMainPanel.class.getResource("/adventure/aircarft 2.PNG")).getImage().getScaledInstance(163,126, Image.SCALE_SMOOTH);
	private Image div = new ImageIcon(intrestMainPanel.class.getResource("/adventure/aircraft.PNG")).getImage().getScaledInstance(163,126, Image.SCALE_SMOOTH);
	private Image nat = new ImageIcon(intrestMainPanel.class.getResource("/adventure/aircraft.PNG")).getImage().getScaledInstance(163,126, Image.SCALE_SMOOTH);
	private Image sAB = new ImageIcon(intrestMainPanel.class.getResource("/adventure/aircraft.PNG")).getImage().getScaledInstance(163,126, Image.SCALE_SMOOTH);
	
	/**
	 * Create the panel.
	 */
	private adventureMain adventureMain = new adventureMain();
	private diveMain diveMain = new diveMain();
	private natureMain natureMain = new natureMain();
	private sunAndBeachMain sunAndBeachMain = new sunAndBeachMain();
	
	public intrestMainPanel() {
		setVisible(false);
		setBounds(0, 76, 925, 809);
		setBackground(new Color(205, 133, 63));
		setLayout(null);
		add(adventureMain);
		add(diveMain);
		add(natureMain);
		add(sunAndBeachMain);
		
		JLabel titleBanner = new JLabel("TRAVEL INSPIRATION");
		titleBanner.setFont(new Font("Segoe UI Semibold", Font.BOLD, 36));
		titleBanner.setHorizontalAlignment(SwingConstants.CENTER);
		titleBanner.setBounds(246, 21, 407, 64);
		add(titleBanner);
		
		JLabel ImageBanner = new JLabel("");
		ImageBanner.setBounds(0, 0, 925, 236);
		ImageBanner.setIcon(new ImageIcon(banner));
		add(ImageBanner);
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 655, 925, 94);
		footer.setLayout(null);
		footer.setBackground(Color.DARK_GRAY);
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
		
		JTextField textField = new JTextField();
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
		
		JPanel dive = new JPanel();
		dive.setBounds(246, 247, 183, 385);
		dive.setBackground(Color.DARK_GRAY);
		add(dive);
		dive.setLayout(null);
		
		JLabel diveImg = new JLabel("");
		diveImg.setIcon(new ImageIcon(div));
		diveImg.setBounds(10, 11, 163, 126);
		dive.add(diveImg);
		
		JTextPane txtpnDiveInAnd = new JTextPane();
		txtpnDiveInAnd.setText("Dive in and explore stunning biodiversity, where you'll find unusual wreck dives, rainbow-colored reefs, and a large variety of marine life.");
		txtpnDiveInAnd.setBackground(Color.DARK_GRAY);
		txtpnDiveInAnd.setForeground(Color.WHITE);
		txtpnDiveInAnd.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		txtpnDiveInAnd.setEditable(false);
		txtpnDiveInAnd.setBounds(10, 180, 162, 158);
		dive.add(txtpnDiveInAnd);
		
		JLabel lblDive = new JLabel("DIVE");
		lblDive.setForeground(Color.WHITE);
		lblDive.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblDive.setHorizontalAlignment(SwingConstants.CENTER);
		lblDive.setBounds(10, 144, 163, 25);
		dive.add(lblDive);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel_1.setBackground(new Color(205, 133, 63));
		panel_1.setBounds(20, 349, 132, 25);
		dive.add(panel_1);
		
		JLabel diveBtn = new JLabel("GET INSPIRED");
		diveBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(diveMain);
			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				diveBtn.setForeground(Color.RED);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				diveBtn.setForeground(Color.WHITE);
//			}
		});
		diveBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		diveBtn.setHorizontalAlignment(SwingConstants.CENTER);
		diveBtn.setForeground(Color.WHITE);
		diveBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		diveBtn.setBounds(0, 0, 132, 25);
		panel_1.add(diveBtn);
		
		JPanel nature = new JPanel();
		nature.setBounds(477, 247, 183, 385);
		nature.setBackground(Color.DARK_GRAY);
		add(nature);
		nature.setLayout(null);
		
		JLabel natureImg = new JLabel("");
		natureImg.setIcon(new ImageIcon(nat));
		natureImg.setBounds(10, 11, 163, 126);
		nature.add(natureImg);
		
		JLabel lblNature = new JLabel("NATURE");
		lblNature.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNature.setForeground(Color.WHITE);
		lblNature.setHorizontalAlignment(SwingConstants.CENTER);
		lblNature.setBounds(10, 140, 163, 25);
		nature.add(lblNature);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setText("Go beyond the Philippines' beaches and into the outdoors, where you'll be surrounded by breathtaking scenery. Explore rice terraces, come face to face with native wildlife, and chase waterfalls.");
		textPane_1_1.setForeground(Color.WHITE);
		textPane_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		textPane_1_1.setEditable(false);
		textPane_1_1.setBackground(Color.DARK_GRAY);
		textPane_1_1.setBounds(10, 164, 162, 186);
		nature.add(textPane_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel_2.setBackground(new Color(205, 133, 63));
		panel_2.setBounds(20, 349, 132, 25);
		nature.add(panel_2);
		
		JLabel natureBtn = new JLabel("GET INSPIRED");
		natureBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		natureBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(natureMain);
			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				natureBtn.setForeground(Color.RED);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				natureBtn.setForeground(Color.WHITE);
//			}
		});
		natureBtn.setHorizontalAlignment(SwingConstants.CENTER);
		natureBtn.setForeground(Color.WHITE);
		natureBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		natureBtn.setBounds(0, 0, 132, 25);
		panel_2.add(natureBtn);
		
		JPanel sunAndBeach = new JPanel();
		sunAndBeach.setBounds(708, 247, 183, 385);
		sunAndBeach.setBackground(Color.DARK_GRAY);
		add(sunAndBeach);
		sunAndBeach.setLayout(null);
		
		JLabel sunAndBeachImg = new JLabel("");
		sunAndBeachImg.setIcon(new ImageIcon(sAB));
		sunAndBeachImg.setBounds(10, 11, 163, 126);
		sunAndBeach.add(sunAndBeachImg);
		
		JLabel lblSunAndBeach = new JLabel("SUN AND BEACH");
		lblSunAndBeach.setForeground(Color.WHITE);
		lblSunAndBeach.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblSunAndBeach.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunAndBeach.setBounds(10, 138, 163, 25);
		sunAndBeach.add(lblSunAndBeach);
		
		JTextPane txtpnThePhilippinesWith = new JTextPane();
		txtpnThePhilippinesWith.setText("The Philippines, with its 7,641 islands, is one of the most biodiverse areas on the earth. If you're looking for the most beautiful beaches and beautiful views, the Philippines has enough to offer!");
		txtpnThePhilippinesWith.setForeground(Color.WHITE);
		txtpnThePhilippinesWith.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		txtpnThePhilippinesWith.setEditable(false);
		txtpnThePhilippinesWith.setBackground(Color.DARK_GRAY);
		txtpnThePhilippinesWith.setBounds(10, 174, 162, 168);
		sunAndBeach.add(txtpnThePhilippinesWith);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel_3.setBackground(new Color(205, 133, 63));
		panel_3.setBounds(20, 353, 132, 25);
		sunAndBeach.add(panel_3);
		
		JLabel sunAndBeachBtn = new JLabel("GET INSPIRED");
		sunAndBeachBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sunAndBeachBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(sunAndBeachMain);
			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				sunAndBeachBtn.setForeground(Color.RED);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				sunAndBeachBtn.setForeground(Color.WHITE);
//			}
		});
		sunAndBeachBtn.setHorizontalAlignment(SwingConstants.CENTER);
		sunAndBeachBtn.setForeground(Color.WHITE);
		sunAndBeachBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		sunAndBeachBtn.setBounds(0, 0, 132, 25);
		panel_3.add(sunAndBeachBtn);
		
		JPanel adventure = new JPanel();
		adventure.setBounds(29, 247, 182, 385);
		adventure.setBackground(Color.DARK_GRAY);
		add(adventure);
		adventure.setLayout(null);
		
		JLabel adventureImg = new JLabel("");
		adventureImg.setIcon(new ImageIcon(adv));
		adventureImg.setBounds(10, 11, 163, 126);
		adventure.add(adventureImg);
		
		JTextPane txtpnWhetherOnLand = new JTextPane();
		txtpnWhetherOnLand.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		txtpnWhetherOnLand.setForeground(Color.WHITE);
		txtpnWhetherOnLand.setBackground(Color.DARK_GRAY);
		txtpnWhetherOnLand.setText("Whether on land or in the water, satisfy your need for adventure. In the Philippines, you'll find plenty of adventurous activities!");
		txtpnWhetherOnLand.setEditable(false);
		txtpnWhetherOnLand.setBounds(10, 180, 162, 158);
		adventure.add(txtpnWhetherOnLand);
		
		JLabel title = new JLabel("ADVENTURES");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(10, 144, 163, 25);
		adventure.add(title);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel.setBackground(new Color(205, 133, 63));
		panel.setBounds(21, 349, 132, 25);
		adventure.add(panel);
		panel.setLayout(null);
		
		JLabel advBtn = new JLabel("GET INSPIRED");
		advBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(adventureMain);
				
			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				advBtn.setForeground(Color.RED);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				advBtn.setForeground(Color.WHITE);
//			}
		});
		advBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		advBtn.setBounds(0, 0, 132, 25);
		panel.add(advBtn);
		advBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		advBtn.setForeground(Color.WHITE);
		advBtn.setHorizontalAlignment(SwingConstants.CENTER);
//		
//		if(adventureMain.isVisible() || diveMain.isVisible()|| natureMain.isVisible()||sunAndBeachMain.isVisible()) {
//			advBtn.setVisible(false);
//			diveBtn.setVisible(false);
//			natureBtn.setVisible(false);
//			sunAndBeachBtn.setVisible(false);
//		}
//		
		
		
	}
	
	
	public void destinationClicked(JPanel panel) {
		adventureMain.setVisible(false);
		diveMain.setVisible(false);
		natureMain.setVisible(false);
		sunAndBeachMain.setVisible(false);
		panel.setVisible(true);
		
	}
	public void closeTab() {
		adventureMain.setVisible(false);
		diveMain.setVisible(false);
		natureMain.setVisible(false);
		sunAndBeachMain.setVisible(false);
	}
}
