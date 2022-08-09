import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;


import AppPackage.AnimationClass;

import palawan.*;
import romblon.*;
import marinduque.*;

import dinagatIsland.*;
import interest.intrestMainPanel;
import surigao.*;
import agusan.*;

import java.awt.Color;

import javax.naming.LimitExceededException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.border.MatteBorder;

import java.awt.Cursor;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class Home extends JFrame {
	
	private Image logo = new ImageIcon(Home.class.getResource("res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image hero = new ImageIcon(Home.class.getResource("res/hero.png")).getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH);
	private Image slear = new ImageIcon(Home.class.getResource("res/slear.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image kayla = new ImageIcon(Home.class.getResource("res/kayla.png")).getImage().getScaledInstance(155,155, Image.SCALE_SMOOTH);
	private Image eljay = new ImageIcon(Home.class.getResource("res/eljay.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image cherry = new ImageIcon(Home.class.getResource("res/cherry.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image nat = new ImageIcon(Home.class.getResource("res/nat.png")).getImage().getScaledInstance(155,190, Image.SCALE_SMOOTH);
	private Image kyle = new ImageIcon(Home.class.getResource("res/kyle.png")).getImage().getScaledInstance(165,200, Image.SCALE_SMOOTH);
	private Image facebook = new ImageIcon(Home.class.getResource("res/facebook.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	private Contact contactPanel = new Contact();
	private  intrestMainPanel intrestMainPanel = new intrestMainPanel(); 
	
	//	First Region
	private palawanMain palawanMainPanel= new palawanMain();
	private marinduqueMain marinduqueMain = new marinduqueMain();
	private romblonMain romblonMain = new romblonMain();
	
	//	Second Region
	private dinagatIslandMain dinagatIslandMain = new dinagatIslandMain();
	private agusanMain agusanMain = new agusanMain();
	private surigaoMain surigaoMain = new surigaoMain();
	
	AnimationClass aClass = new AnimationClass();
	private JTextField txtName;
	private JTextField txtEnterYourEmail;
	private JTextField emailSubs;
	
	
	public Home() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 1991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 102, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel navBar =  new JPanel();
		navBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		navBar.setVerifyInputWhenFocusTarget(false);
		navBar.setBackground(Color.DARK_GRAY);
		navBar.setBounds(0, 0, 925, 77);
		contentPane.add(navBar);
		navBar.setLayout(null);
		
		JButton destination = new JButton("DESTINATION");
		destination.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		destination.setBounds(490, 0, 136, 77);
		destination.setFocusPainted(false);
		destination.setDoubleBuffered(true);
		destination.setBorder(null);
		destination.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		destination.setForeground(Color.WHITE);
		destination.setBackground(Color.DARK_GRAY);
		navBar.add(destination);
		
		JButton interest = new JButton("INTEREST");
		interest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		interest.setBounds(629, 0, 101, 77);
		interest.setForeground(Color.WHITE);
		interest.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		interest.setFocusPainted(false);
		interest.setDoubleBuffered(true);
		interest.setBorder(null);
		interest.setBackground(Color.DARK_GRAY);
		navBar.add(interest);
		
		JButton contactUs = new JButton("CONTACT US");
		contactUs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contactUs.setBounds(740, 0, 129, 77);
		contactUs.setForeground(Color.WHITE);
		contactUs.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		contactUs.setFocusPainted(false);
		contactUs.setDoubleBuffered(true);
		contactUs.setBorder(null);
		contactUs.setBackground(Color.DARK_GRAY);
		navBar.add(contactUs);
		
		JButton exitButton = new JButton("X");
		exitButton.setBounds(893, 0, 32, 29);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					Home.this.dispose();
				}
			}
		});
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Verdana", Font.BOLD, 15));
		exitButton.setFocusPainted(false);
		exitButton.setDoubleBuffered(true);
		exitButton.setBorder(null);
		exitButton.setBackground(Color.DARK_GRAY);
		navBar.add(exitButton);
		
		JLabel navLogo = new JLabel("");
		navLogo.setBounds(0, 2, 84, 75);
		navLogo.setIcon(new ImageIcon(logo));
		navLogo.setHorizontalAlignment(SwingConstants.CENTER);
		navBar.add(navLogo);
		
		JLabel navTitle1 = new JLabel("Travel List Journey");
		navTitle1.setBounds(79, 11, 191, 37);
		navTitle1.setForeground(Color.WHITE);
		navTitle1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		navBar.add(navTitle1);
		
		JLabel navTitle2 = new JLabel("Travel Vlog");
		navTitle2.setBounds(109, 32, 101, 45);
		navTitle2.setForeground(Color.WHITE);
		navTitle2.setFont(new Font("Verdana", Font.BOLD, 15));
		
		navBar.add(navTitle2);
		
		JPanel disabler = new JPanel();
		disabler.setBackground(Color.DARK_GRAY);
		disabler.setBounds(402, 0, 91, 77);
		navBar.add(disabler);
		
		JButton backFromContact = new JButton("Back to HOME");
		backFromContact.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backFromContact.setVisible(false);
		backFromContact.setForeground(Color.WHITE);
		backFromContact.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		backFromContact.setFocusPainted(false);
		backFromContact.setDoubleBuffered(true);
		backFromContact.setBorder(null);
		backFromContact.setBackground(Color.DARK_GRAY);
		backFromContact.setBounds(740, 0, 129, 77);
		navBar.add(backFromContact);
		
		JButton backFromDestination = new JButton("HOME");
		backFromDestination.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backFromDestination.setVisible(false);
		backFromDestination.setForeground(Color.WHITE);
		backFromDestination.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		backFromDestination.setFocusPainted(false);
		backFromDestination.setDoubleBuffered(true);
		backFromDestination.setBorder(null);
		backFromDestination.setBackground(Color.DARK_GRAY);
		backFromDestination.setBounds(492, 0, 134, 77);
		navBar.add(backFromDestination);
		
		JPanel destinationItem = new JPanel();
		destinationItem.setBounds(502, 76, 139, 126);
		contentPane.add(destinationItem);
		destinationItem.setVisible(false);
		destinationItem.setBackground(Color.GRAY);
		
		JLabel firstRegion = new JLabel("MIMAROPA");
		firstRegion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		firstRegion.setBounds(0, 0, 139, 61);
		destinationItem.setLayout(null);
		firstRegion.setBorder(new MatteBorder(3, 0, 3, 0, (Color) new Color(255, 255, 255)));
		firstRegion.setForeground(new Color(255, 255, 255));
		firstRegion.setFont(new Font("Verdana", Font.BOLD, 15));
		firstRegion.setHorizontalAlignment(SwingConstants.CENTER);
		destinationItem.add(firstRegion);
		
		JLabel secondRegion = new JLabel("CARAGA");
		secondRegion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		secondRegion.setBounds(0, 58, 140, 67);
		secondRegion.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		secondRegion.setHorizontalAlignment(SwingConstants.CENTER);
		secondRegion.setForeground(Color.WHITE);
		secondRegion.setFont(new Font("Verdana", Font.BOLD, 15));
		destinationItem.add(secondRegion);
		
		JPanel touristSpot1 = new JPanel();
		touristSpot1.setVisible(false);
		touristSpot1.setBounds(641, 100, 138, 183);
		contentPane.add(touristSpot1);
		touristSpot1.setBorder(new MatteBorder(0, 3, 0, 0, (Color) Color.WHITE));
		touristSpot1.setBackground(Color.GRAY);
		touristSpot1.setLayout(null);
		
		JLabel firstRegionSpot1 = new JLabel("PALAWAN");
		firstRegionSpot1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		firstRegionSpot1.setBounds(0, 0, 133, 61);
		firstRegionSpot1.setHorizontalAlignment(SwingConstants.CENTER);
		firstRegionSpot1.setForeground(Color.WHITE);
		firstRegionSpot1.setFont(new Font("Verdana", Font.BOLD, 15));
		firstRegionSpot1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		touristSpot1.add(firstRegionSpot1);
		
		JLabel firstRegionSpot2 = new JLabel("MARINDUQUE");
		firstRegionSpot2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		firstRegionSpot2.setBounds(0, 63, 133, 61);
		firstRegionSpot2.setHorizontalAlignment(SwingConstants.CENTER);
		firstRegionSpot2.setForeground(Color.WHITE);
		firstRegionSpot2.setFont(new Font("Verdana", Font.BOLD, 15));
		firstRegionSpot2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		touristSpot1.add(firstRegionSpot2);
		
		JLabel firstRegionSpot3 = new JLabel("ROMBLON");
		firstRegionSpot3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		firstRegionSpot3.setBounds(3, 122, 133, 61);
		firstRegionSpot3.setHorizontalAlignment(SwingConstants.CENTER);
		firstRegionSpot3.setForeground(Color.WHITE);
		firstRegionSpot3.setFont(new Font("Verdana", Font.BOLD, 15));
		firstRegionSpot3.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		touristSpot1.add(firstRegionSpot3);
		
		JPanel touristSpot2 = new JPanel();
		touristSpot2.setVisible(false);
		touristSpot2.setBorder(new MatteBorder(0, 3, 0, 0, (Color) new Color(255, 255, 255)));
		touristSpot2.setBounds(641, 160, 138, 183);
		contentPane.add(touristSpot2);
		touristSpot2.setBackground(Color.GRAY);
		touristSpot2.setLayout(null);
		
		JLabel secondRegionSpot1 = new JLabel("DINAGAT ISLAND");
		secondRegionSpot1.setHorizontalAlignment(SwingConstants.CENTER);
		secondRegionSpot1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		secondRegionSpot1.setBounds(0, 0, 138, 61);
		secondRegionSpot1.setForeground(Color.WHITE);
		secondRegionSpot1.setFont(new Font("Verdana", Font.BOLD, 12));
		secondRegionSpot1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		touristSpot2.add(secondRegionSpot1);
		
		JLabel secondRegionSpot2 = new JLabel("AGUSAN");
		secondRegionSpot2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		secondRegionSpot2.setBounds(0, 59, 138, 61);
		secondRegionSpot2.setHorizontalAlignment(SwingConstants.CENTER);
		secondRegionSpot2.setForeground(Color.WHITE);
		secondRegionSpot2.setFont(new Font("Verdana", Font.BOLD, 15));
		secondRegionSpot2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		touristSpot2.add(secondRegionSpot2);
		
		JLabel secondRegionSpot3 = new JLabel("SURIGAO");
		secondRegionSpot3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		secondRegionSpot3.setBounds(0, 122, 138, 61);
		secondRegionSpot3.setHorizontalAlignment(SwingConstants.CENTER);
		secondRegionSpot3.setForeground(Color.WHITE);
		secondRegionSpot3.setFont(new Font("Verdana", Font.BOLD, 15));
		secondRegionSpot3.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		touristSpot2.add(secondRegionSpot3);
		
		JPanel mainSection = new JPanel();
		mainSection.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		mainSection.setBackground(new Color(205, 133, 63));
		contentPane.add(mainSection);
		mainSection.setBounds(0, 76, 925, 1915);
		mainSection.setLayout(null);
		mainSection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		mainSection.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
//				int h = mainSection.getHeight();
				int a = e.getWheelRotation();
				int x = mainSection.getX();
				int y = mainSection.getY();
				int b = 0;
				
				if(a>0) {
					if(y==y-mainSection.getHeight()) {
						a=0;
					}
				}else {
					b+=50;
					if(x==0&&y==76) {
						mainSection.setLocation(x,y);
					}else {
						mainSection.setLocation(x,y+b);
						b=0;
					}
					
				}
				
				if(a<0) {
					if(y==0) {
						a=0;
					}
				}else {
					b+=50;
					if(x==0&&y<=-1125) {
						mainSection.setLocation(x,y);
					}else {
						mainSection.setLocation(x,y-b);
						b=0;
					}
					
				}
				
			}
		});
		
		
		
		JLabel image1 = new JLabel("");
		image1.setHorizontalAlignment(SwingConstants.CENTER);
		image1.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)));
		image1.setIcon(new ImageIcon(Home.class.getResource("/res/image1.png")));
		image1.setBounds(0, 0, 925, 389);
		mainSection.add(image1);
		
		JLabel image2 = new JLabel("");
		image2.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)));
		image2.setIcon(new ImageIcon(Home.class.getResource("/res/img2.png")));
		image2.setBounds(900, 0, 925, 389);
		mainSection.add(image2);
		
		JLabel image3 = new JLabel("");
		image3.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)));
		image3.setIcon(new ImageIcon(Home.class.getResource("/res/img3.png")));
		image3.setBounds(1800, 0, 925, 389);
		mainSection.add(image3);
		
		JTextPane sectionParagraph = new JTextPane();
		sectionParagraph.setForeground(Color.WHITE);
		sectionParagraph.setBackground(new Color(205, 133, 63));
		sectionParagraph.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		sectionParagraph.setEditable(false);
		sectionParagraph.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		sectionParagraph.setText("Travel List Journey is a compilation of stories on the road, tales of experiences, and a bunch of tips about traveling. Take a look at these articles and learn how is the best way to see the world, meet people, make new friends, survive long-term traveling, and enjoy life. With over 7,000 islands, the Philippines is an easy destination to visit multiple times. Each region of the Philippines has a different landscape, ranging from mountainous to tropical to urban. You may spend a day strolling through Manila's ancient colonial streets or visiting a private sanctuary on the island of Bohol to see small tarsier monkeys. Hiking in the steep, green mountains is a once-in-a-lifetime adventure.\r\n\r\nFurthermore, if you wish to begin your adventure of conquering the Philippines, these articles will offer you an overview of what to expect in the Philippines.");
		sectionParagraph.setBounds(75, 488, 429, 289);
		mainSection.add(sectionParagraph);
		
		JLabel sectionTitle = new JLabel("Travel List Journey");
		sectionTitle.setForeground(Color.WHITE);
		sectionTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		sectionTitle.setBounds(153, 430, 268, 37);
		mainSection.add(sectionTitle);
		
		JLabel sectionLogo = new JLabel("");
		sectionLogo.setIcon(new ImageIcon(logo));
		sectionLogo.setHorizontalAlignment(SwingConstants.CENTER);
		sectionLogo.setBounds(69, 412, 84, 75);
		mainSection.add(sectionLogo);
		
		JLabel heroPhoto = new JLabel("");
		heroPhoto.setIcon(new ImageIcon(hero));
		heroPhoto.setBounds(501, 412, 355, 365);
		mainSection.add(heroPhoto);
		
		JPanel aboutTeamPanel = new JPanel();
		aboutTeamPanel.setBackground(Color.DARK_GRAY);
		aboutTeamPanel.setBounds(0, 788, 925, 57);
		mainSection.add(aboutTeamPanel);
		aboutTeamPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("ABOUT THE TEAM");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(324, 11, 264, 35);
		aboutTeamPanel.add(lblNewLabel_4);
		
		JPanel imageContainer1 = new JPanel();
		imageContainer1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), null));
		imageContainer1.setBackground(Color.GRAY);
		imageContainer1.setBounds(153, 874, 150, 164);
		mainSection.add(imageContainer1);
		imageContainer1.setLayout(null);
		
		JLabel member1 = new JLabel("");
		member1.setBounds(5, 18, 150, 150);
		imageContainer1.add(member1);
		member1.setIcon(new ImageIcon(slear));
		
		JLabel facebookIcon = new JLabel("");
		facebookIcon.setBounds(3, 135, 25, 25);
		imageContainer1.add(facebookIcon);
		facebookIcon.setIcon(new ImageIcon(facebook));
		
		JLabel memberName = new JLabel("SLEAR");
		memberName.setForeground(Color.WHITE);
		memberName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		memberName.setHorizontalAlignment(SwingConstants.CENTER);
		memberName.setBounds(31, 8, 85, 14);
		imageContainer1.add(memberName);
		
		JPanel imageContainer2 = new JPanel();
		imageContainer2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		imageContainer2.setBackground(Color.GRAY);
		imageContainer2.setBounds(383, 874, 150, 164);
		mainSection.add(imageContainer2);
		imageContainer2.setLayout(null);
		
		JLabel member2 = new JLabel("");
		member2.setBounds(0, 11, 150, 150);
		imageContainer2.add(member2);
		member2.setIcon(new ImageIcon(kayla));
		
		JLabel facebookIcon_1 = new JLabel("");
		facebookIcon_1.setIcon(new ImageIcon(facebook));
		facebookIcon_1.setBounds(3, 136, 25, 25);
		imageContainer2.add(facebookIcon_1);
		
		JLabel memberName2 = new JLabel("KAYLA");
		memberName2.setHorizontalAlignment(SwingConstants.CENTER);
		memberName2.setForeground(Color.WHITE);
		memberName2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		memberName2.setBounds(33, 8, 85, 14);
		imageContainer2.add(memberName2);
		
		JPanel imageContainer3 = new JPanel();
		imageContainer3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		imageContainer3.setBackground(Color.GRAY);
		imageContainer3.setBounds(608, 874, 150, 164);
		mainSection.add(imageContainer3);
		imageContainer3.setLayout(null);
		
		JLabel facebookIcon_2 = new JLabel("");
		facebookIcon_2.setIcon(new ImageIcon(facebook));
		facebookIcon_2.setBounds(3, 136, 25, 25);
		imageContainer3.add(facebookIcon_2);
		
		JLabel member3 = new JLabel("");
		member3.setHorizontalAlignment(SwingConstants.CENTER);
		member3.setBounds(3, 16, 147, 150);
		imageContainer3.add(member3);
		member3.setIcon(new ImageIcon(eljay));
		
		JLabel memberName3 = new JLabel("EL-JAY");
		memberName3.setHorizontalAlignment(SwingConstants.CENTER);
		memberName3.setForeground(Color.WHITE);
		memberName3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		memberName3.setBounds(30, 5, 85, 14);
		imageContainer3.add(memberName3);
		
		JPanel imageContainer4 = new JPanel();
		imageContainer4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		imageContainer4.setBackground(Color.GRAY);
		imageContainer4.setBounds(153, 1100, 150, 164);
		mainSection.add(imageContainer4);
		imageContainer4.setLayout(null);
		
		JLabel member4 = new JLabel("");
		member4.setHorizontalAlignment(SwingConstants.CENTER);
		member4.setBounds(3, 21, 147, 140);
		imageContainer4.add(member4);
		member4.setIcon(new ImageIcon(cherry));
		
		JLabel facebookIcon_3 = new JLabel("");
		facebookIcon_3.setIcon(new ImageIcon(facebook));
		facebookIcon_3.setBounds(3, 136, 25, 25);
		imageContainer4.add(facebookIcon_3);
		
		JLabel memberName4 = new JLabel("CHERRY MAE");
		memberName4.setHorizontalAlignment(SwingConstants.CENTER);
		memberName4.setForeground(Color.WHITE);
		memberName4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		memberName4.setBounds(32, 6, 85, 14);
		imageContainer4.add(memberName4);
		
		JPanel imageContainer5 = new JPanel();
		imageContainer5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		imageContainer5.setLayout(null);
		imageContainer5.setBackground(Color.GRAY);
		imageContainer5.setBounds(383, 1100, 150, 165);
		mainSection.add(imageContainer5);
		
		JLabel member5 = new JLabel("");
		member5.setBounds(-3, -15, 175, 185);
		imageContainer5.add(member5);
		member5.setIcon(new ImageIcon(nat));
		
		JLabel facebookIcon_4 = new JLabel("");
		facebookIcon_4.setIcon(new ImageIcon(facebook));
		facebookIcon_4.setBounds(3, 136, 25, 25);
		imageContainer5.add(facebookIcon_4);
		
		JLabel memberName5 = new JLabel("NATANIEL");
		memberName5.setHorizontalAlignment(SwingConstants.CENTER);
		memberName5.setForeground(Color.WHITE);
		memberName5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		memberName5.setBounds(28, 6, 85, 14);
		imageContainer5.add(memberName5);
		
		JPanel imageContainer6 = new JPanel();
		imageContainer6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		imageContainer6.setLayout(null);
		imageContainer6.setBackground(Color.GRAY);
		imageContainer6.setBounds(608, 1100, 150, 164);
		mainSection.add(imageContainer6);
		
		JLabel member6 = new JLabel("");
		member6.setBounds(-10, 0, 190, 162);
		imageContainer6.add(member6);
		member6.setIcon(new ImageIcon(kyle));
		member6.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JLabel facebookIcon_5 = new JLabel("");
		facebookIcon_5.setIcon(new ImageIcon(facebook));
		facebookIcon_5.setBounds(3, 136, 25, 25);
		imageContainer6.add(facebookIcon_5);
		
		JLabel lblRosselene = new JLabel("ROSSELENE");
		lblRosselene.setHorizontalAlignment(SwingConstants.CENTER);
		lblRosselene.setForeground(Color.WHITE);
		lblRosselene.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lblRosselene.setBounds(29, 6, 85, 14);
		imageContainer6.add(lblRosselene);
		
		JPanel footer = new JPanel();
		footer.setBackground(Color.DARK_GRAY);
		footer.setBounds(0, 1809, 925, 106);
		mainSection.add(footer);
		footer.setLayout(null);
		
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
		footerLogo.setBounds(32, 11, 84, 75);
		footer.add(footerLogo);
		
		emailSubs = new JTextField();
		emailSubs.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(emailSubs.getText().equals("ENTER YOUR EMAIL")) {
					emailSubs.setText("");
				}else {
					emailSubs.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(emailSubs.getText().equals("")) {
					emailSubs.setText("ENTER YOUR EMAIL");
				}
			}
		});
		emailSubs.setBounds(455, 46, 288, 35);
		footer.add(emailSubs);
		emailSubs.setText("ENTER YOUR EMAIL");
		emailSubs.setHorizontalAlignment(SwingConstants.CENTER);
		emailSubs.setForeground(Color.WHITE);
		emailSubs.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		emailSubs.setColumns(10);
		emailSubs.setBackground(Color.LIGHT_GRAY);
		
		JButton btnSubscribe = new JButton("SUBSCRIBE");
		btnSubscribe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSubscribe.setForeground(Color.BLACK);
		btnSubscribe.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		btnSubscribe.setFocusPainted(false);
		btnSubscribe.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		btnSubscribe.setBackground(Color.GRAY);
		btnSubscribe.setBounds(753, 46, 138, 37);
		footer.add(btnSubscribe);
		
		JLabel footerParag = new JLabel("Subscribe here and get the latest travel tips.");
		footerParag.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		footerParag.setForeground(Color.WHITE);
		footerParag.setBounds(455, 11, 430, 27);
		footer.add(footerParag);
		
		JLabel copyRight = new JLabel("\u00A9COPYRIGHT 2022");
		copyRight.setForeground(Color.WHITE);
		copyRight.setFont(new Font("Segoe UI Semibold", Font.BOLD, 10));
		copyRight.setBounds(138, 55, 101, 45);
		footer.add(copyRight);
		
		JPanel askUsQuestions = new JPanel();
		askUsQuestions.setLayout(null);
		askUsQuestions.setBackground(Color.DARK_GRAY);
		askUsQuestions.setBounds(0, 1343, 925, 57);
		mainSection.add(askUsQuestions);
		
		JLabel lblNewLabel_4_1 = new JLabel("ASK US ANY QUESTIONS!");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		lblNewLabel_4_1.setBounds(324, 11, 264, 35);
		askUsQuestions.add(lblNewLabel_4_1);
		
		JTextPane askUsParag = new JTextPane();
		askUsParag.setForeground(new Color(255, 255, 255));
		askUsParag.setBackground(new Color(205, 133, 63));
		askUsParag.setEditable(false);
		askUsParag.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		askUsParag.setText("We appreciate hearing from readers, so get in touch if you have any valuable feedback, need guidance on trip planniing, have concerns about your first trip, or simply have a question for us.");
		askUsParag.setBounds(75, 1411, 796, 75);
		mainSection.add(askUsParag);
		
		JPanel messageContainer = new JPanel();
		messageContainer.setBackground(Color.DARK_GRAY);
		messageContainer.setBounds(196, 1558, 477, 178);
		mainSection.add(messageContainer);
		messageContainer.setLayout(null);
		
		JTextPane txtpnWriteMessage = new JTextPane();
		txtpnWriteMessage.setBorder(new LineBorder(Color.WHITE));
		txtpnWriteMessage.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtpnWriteMessage.getText().equals("WRITE MESSAGE..")) {
					txtpnWriteMessage.setText("");
				}else {
					txtpnWriteMessage.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtpnWriteMessage.getText().equals("")) {
					txtpnWriteMessage.setText("WRITE MESSAGE..");
				}
			}
		});
		txtpnWriteMessage.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 11));
		txtpnWriteMessage.setForeground(Color.BLACK);
		txtpnWriteMessage.setBackground(Color.LIGHT_GRAY);
		txtpnWriteMessage.setText("WRITE MESSAGE..");
		txtpnWriteMessage.setBounds(10, 11, 457, 156);
		messageContainer.add(txtpnWriteMessage);
		
		JButton askSendBtn = new JButton("SEND MESSAGE");
		askSendBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		askSendBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		askSendBtn.setForeground(Color.BLACK);
		askSendBtn.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		askSendBtn.setBackground(Color.GRAY);
		askSendBtn.setFocusPainted(false);
		askSendBtn.setBounds(366, 1747, 139, 48);
		mainSection.add(askSendBtn);
		
		JLabel facebookLink1 = new JLabel("www.facebook.com/slear08");
		facebookLink1.setForeground(Color.WHITE);
		facebookLink1.setBounds(160, 1038, 204, 14);
		mainSection.add(facebookLink1);
		
		JLabel facebookLink2 = new JLabel("www.facebook.com/kayla.descalzo");
		facebookLink2.setForeground(Color.WHITE);
		facebookLink2.setBounds(374, 1038, 228, 14);
		mainSection.add(facebookLink2);
		
		JLabel facebookLink3 = new JLabel("www.facebook.com/jimenezeljay");
		facebookLink3.setForeground(Color.WHITE);
		facebookLink3.setBounds(603, 1038, 253, 14);
		mainSection.add(facebookLink3);
		
		JLabel facebookLink4 = new JLabel("www.facebook.com/cherrymae.marquez.7");
		facebookLink4.setForeground(Color.WHITE);
		facebookLink4.setBounds(121, 1263, 247, 14);
		mainSection.add(facebookLink4);
		
		JLabel facebookLink5 = new JLabel("www.facebook.com/nataniel.domens");
		facebookLink5.setForeground(Color.WHITE);
		facebookLink5.setBounds(369, 1263, 229, 14);
		mainSection.add(facebookLink5);
		
		JLabel facebookLink6 = new JLabel("www.facebook.com/kyledjp.5");
		facebookLink6.setForeground(Color.WHITE);
		facebookLink6.setBounds(608, 1263, 229, 14);
		mainSection.add(facebookLink6);
		
		JPanel emailCointainer = new JPanel();
		emailCointainer.setBounds(499, 1488, 308, 57);
		mainSection.add(emailCointainer);
		emailCointainer.setBackground(Color.DARK_GRAY);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setBounds(10, 11, 288, 35);
		txtEnterYourEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterYourEmail.getText().equals("ENTER YOUR EMAIL")) {
					txtEnterYourEmail.setText("");
				}else {
					txtEnterYourEmail.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtEnterYourEmail.getText().equals("")) {
					txtEnterYourEmail.setText("ENTER YOUR EMAIL");
				}
			}
		});
		emailCointainer.setLayout(null);
		txtEnterYourEmail.setText("ENTER YOUR EMAIL");
		txtEnterYourEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourEmail.setForeground(Color.BLACK);
		txtEnterYourEmail.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		txtEnterYourEmail.setColumns(10);
		txtEnterYourEmail.setBackground(Color.LIGHT_GRAY);
		emailCointainer.add(txtEnterYourEmail);
		
		JPanel nameContainer = new JPanel();
		nameContainer.setBounds(75, 1488, 308, 57);
		mainSection.add(nameContainer);
		nameContainer.setBackground(Color.DARK_GRAY);
		nameContainer.setLayout(null);
		
		txtName = new JTextField();
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtName.getText().equals("ENTER YOUR NAME")) {
					txtName.setText("");
				}else {
					txtName.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtName.getText().equals("")) {
					txtName.setText("ENTER YOUR NAME");
				}
			}
		});
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		txtName.setForeground(Color.BLACK);
		txtName.setBackground(Color.LIGHT_GRAY);
		txtName.setText("ENTER YOUR NAME");
		txtName.setBounds(10, 11, 288, 35);
		nameContainer.add(txtName);
		txtName.setColumns(10);
		
		contactPanel.setVisible(false);
		contentPane.add(contactPanel);
		
		palawanMainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		
		marinduqueMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		
		romblonMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		
		dinagatIslandMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		
		surigaoMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		
		
		agusanMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		
		intrestMainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		
		
		
		
		destination.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(true);
				destination.setBackground(Color.GRAY);
				
				interest.setBackground(Color.DARK_GRAY);
				
			}
			
		});
		disabler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
			}
		});
		interest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(intrestMainPanel);
				mainSection.setVisible(false);
				backFromContact.setVisible(false);
				contactUs.setVisible(true);
				
				destination.setVisible(false);
				backFromDestination.setVisible(true);
			}
		});
		
		firstRegion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				firstRegion.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(true);
				touristSpot2.setVisible(false);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				firstRegion.setForeground(Color.WHITE);
				touristSpot1.setVisible(false);
			}
		});

		touristSpot1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				firstRegion.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(true);
				 
			}
			@Override
			public void mouseExited(MouseEvent e) {
				destination.setBackground(Color.DARK_GRAY);
				firstRegion.setForeground(Color.WHITE);
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
			}
		});
		
		secondRegion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				secondRegion.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				secondRegion.setForeground(Color.WHITE);
				touristSpot2.setVisible(false);
			}
		});
		touristSpot2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				secondRegion.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot2.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				destination.setBackground(Color.DARK_GRAY);
				secondRegion.setForeground(Color.WHITE);
				destinationItem.setVisible(false);
				touristSpot2.setVisible(false);
			}
		});
		
		firstRegionSpot1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				firstRegion.setForeground(Color.RED);
				firstRegionSpot1.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(true);
				touristSpot2.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				firstRegionSpot1.setForeground(Color.WHITE);
				firstRegion.setForeground(Color.WHITE);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(palawanMainPanel);
				mainSection.setVisible(false);
				backFromContact.setVisible(false);
				contactUs.setVisible(true);
				
				destination.setVisible(false);
				backFromDestination.setVisible(true);
			}
		});
		firstRegionSpot2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				firstRegion.setForeground(Color.RED);
				firstRegionSpot2.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(true);
				touristSpot2.setVisible(false);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				firstRegionSpot2.setForeground(Color.WHITE);
				firstRegion.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(marinduqueMain);
				mainSection.setVisible(false);
				backFromContact.setVisible(false);
				contactUs.setVisible(true);
				
				destination.setVisible(false);
				backFromDestination.setVisible(true);
			}

		});
		firstRegionSpot3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				firstRegionSpot3.setForeground(Color.RED);
				firstRegion.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(true);
				touristSpot2.setVisible(false);
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				firstRegionSpot3.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(romblonMain);
				mainSection.setVisible(false);
				backFromContact.setVisible(false);
				contactUs.setVisible(true);
				
				destination.setVisible(false);
				backFromDestination.setVisible(true);
			}
			
		});
	
		
		secondRegionSpot1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				secondRegion.setForeground(Color.RED);
				secondRegionSpot1.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				secondRegionSpot1.setForeground(Color.WHITE);
				secondRegion.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(dinagatIslandMain);
				mainSection.setVisible(false);
				backFromContact.setVisible(false);
				contactUs.setVisible(true);
				
				destination.setVisible(false);
				backFromDestination.setVisible(true);
			}
			
			
		});
		secondRegionSpot2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				secondRegion.setForeground(Color.RED);
				secondRegionSpot2.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				secondRegionSpot2.setForeground(Color.WHITE);
				secondRegion.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(agusanMain);
				mainSection.setVisible(false);
				backFromContact.setVisible(false);
				contactUs.setVisible(true);
				
				destination.setVisible(false);
				backFromDestination.setVisible(true);
			}
			
		});
		secondRegionSpot3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				secondRegionSpot3.setForeground(Color.RED);
				secondRegion.setForeground(Color.RED);
				destination.setBackground(Color.GRAY);
				destinationItem.setVisible(true);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				secondRegionSpot3.setForeground(Color.WHITE);
				secondRegion.setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(surigaoMain);
				mainSection.setVisible(false);
				backFromContact.setVisible(false);
				contactUs.setVisible(true);
				
				destination.setVisible(false);
				backFromDestination.setVisible(true);
			}
			
		});
		contactUs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				interest.setBackground(Color.DARK_GRAY);
				contactUs.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				contactUs.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(contactPanel);
				mainSection.setVisible(false);
				contactUs.setVisible(false);
				backFromContact.setVisible(true);
				backFromDestination.setVisible(false);
				destination.setVisible(true);
				
			}
		});
		contactPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				destinationItem.setVisible(false);
				touristSpot1.setVisible(false);
				touristSpot2.setVisible(false);
				destination.setBackground(Color.DARK_GRAY);
				interest.setBackground(Color.DARK_GRAY);
			}
		});
		backFromContact.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contactUs.setVisible(true);
				mainSection.setVisible(true);
				contactPanel.setVisible(false);
				backFromContact.setVisible(false);
				backFromDestination.setVisible(false);
				destination.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				interest.setBackground(Color.DARK_GRAY);
				backFromContact.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backFromContact.setBackground(Color.DARK_GRAY);
			}
		});
		backFromDestination.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destination.setVisible(true);
				mainSection.setVisible(true);
				
				palawanMainPanel.closeTab();
				marinduqueMain.closeTab();
				romblonMain.closeTab();
				
				dinagatIslandMain.closeTab();
				agusanMain.closeTab();
				surigaoMain.closeTab();
				
				intrestMainPanel.closeTab();
							
				romblonMain.setVisible(false);
				marinduqueMain.setVisible(false);
				palawanMainPanel.setVisible(false);
				
				dinagatIslandMain.setVisible(false);
				agusanMain.setVisible(false);
				surigaoMain.setVisible(false);
		
				intrestMainPanel.setVisible(false);
				
				backFromDestination.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				backFromDestination.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backFromDestination.setBackground(Color.DARK_GRAY);
			}
		}); 
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int nb = 0;
				
				try {
					while(true) {
						switch(nb) {
							case 0:
								Thread.sleep(10000);
								aClass.jLabelXLeft(0, -900, 10, 50,  image1);
								aClass.jLabelXLeft(900, 0, 10, 50,  image2);
								aClass.jLabelXLeft(1800,900, 10, 50,  image3);
								
								nb++;
							case 1:
								Thread.sleep(1000);
								aClass.jLabelXLeft(-900, -1800, 10, 50,  image1);
								aClass.jLabelXLeft(0, -900, 10, 50,  image2);
								aClass.jLabelXLeft(900, 0, 10, 50,  image3);
								nb++;
							case 2:
								Thread.sleep(1000);
								aClass.jLabelXRight(-1800, -900, 10, 50, image1);
								aClass.jLabelXRight(-900, 0, 10, 50, image2);
								aClass.jLabelXRight(0, 900, 10, 50, image3);
								nb++;
							case 3:
								Thread.sleep(1000);
								aClass.jLabelXRight(-900, 0, 10, 50, image1);
								aClass.jLabelXRight(0, 900, 10, 50, image2);
								aClass.jLabelXRight(900,1800, 10, 50, image3);
								nb=0;
						}
					}
				} catch (Exception e) {
					System.out.print(e);
				}
			}
		}).start();
	
		scrollPanel(contactPanel);
		scrollPanel(intrestMainPanel);
		
		scrollPanel(palawanMainPanel);
		scrollPanel(marinduqueMain);
		scrollPanel(romblonMain);
		
		scrollPanel(dinagatIslandMain);
		scrollPanel(agusanMain);
		scrollPanel(surigaoMain);
		
		
		
		
		
//		Line 817 the content controller
		contentPane.add(palawanMainPanel);
		contentPane.add(marinduqueMain);
		contentPane.add(romblonMain);
		
		contentPane.add(dinagatIslandMain);
		contentPane.add(surigaoMain);
		contentPane.add(agusanMain);
		
		contentPane.add(intrestMainPanel);
		
	}
	
	public void menuClicked(JPanel panel) {
		
			intrestMainPanel.setVisible(false);
			contactPanel.setVisible(false);
			
			palawanMainPanel.setVisible(false);
			marinduqueMain.setVisible(false);
			romblonMain.setVisible(false);
			
			dinagatIslandMain.setVisible(false);
			surigaoMain.setVisible(false);
			agusanMain.setVisible(false);
			
			
			panel.setVisible(true);
		
	}
	public void scrollPanel(JPanel panel) {
		addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
//				int h = panel.getHeight();
				int a = e.getWheelRotation();
				int x = panel.getX();
				int y = panel.getY();
				int b = 0;
				
				if(a>0) {
					if(y==y-panel.getHeight()) {
						a=0;
					}
				}else {
					b+=50;
					if(x==0&&y==76) {
						panel.setLocation(x,y);
					}else {
						panel.setLocation(x,y+b);
						b=0;
					}
					
				}
				
				if(a<0) {
					if(y==0) {
						a=0;  
					}
				}else {
					b+=50;
					if(x==0&&y<=51) {
						panel.setLocation(x,y);
					}else {
						panel.setLocation(x,y-b);
						b=0;
					}
					
				}
				
			}
		});
	}
}
