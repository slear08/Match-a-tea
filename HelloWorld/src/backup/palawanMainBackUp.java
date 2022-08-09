package backup;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

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

public class palawanMainBackUp extends JPanel {

	private Image logo = new ImageIcon(palawanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/DJI_0287-1024x768.jpg")).getImage().getScaledInstance(925,206, Image.SCALE_SMOOTH);
	private Image map = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/6.png")).getImage().getScaledInstance(321,251, Image.SCALE_SMOOTH);
	private Image pic1 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/WEBSITE.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic2 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Baraccuda Lake.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic3 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Puerto Princesa Subteranean river.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic4 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Iwahig firefly watching.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic5 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/kayangan lake.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic6 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/p1a1jinojl1v7e7fl1bs61ft4esu5.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic7 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Palawan Crocodile Farm.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic8 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Tabon Cave.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic9 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/honda bay.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	private Image pic10 = new ImageIcon(palawanMain.class.getResource("/destinationResPalawan/Bacuit Island.jpg")).getImage().getScaledInstance(92,107, Image.SCALE_SMOOTH);
	
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	private Tubbataha tubbataha = new Tubbataha();
	private barracudaLake barracudaLake = new barracudaLake();
	
	
	public  palawanMainBackUp() {
		setVisible(false);
		setBounds(0, 76, 925, 809);
		setBackground(new Color(205, 133, 63));
		setLayout(null);
		add(tubbataha);
		add(barracudaLake);
		
		JLabel destinationlabel1 = new JLabel("Tubbataha reefs");
		destinationlabel1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel1.setForeground(Color.WHITE);
		destinationlabel1.setBounds(0, 613, 82, 14);
		add(destinationlabel1);
		
		JLabel destinationlabel2 = new JLabel(" Barracuda Lake");
		destinationlabel2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel2.setForeground(Color.WHITE);
		destinationlabel2.setBounds(94, 613, 82, 14);
		add(destinationlabel2);
		
		JLabel destinationlabel3 = new JLabel(" Underground River \n");
		destinationlabel3.setForeground(Color.WHITE);
		destinationlabel3.setBounds(185, 613, 104, 14);
		add(destinationlabel3);
		
		JLabel destinationlabel4_1 = new JLabel("Iwahig Firefly");
		destinationlabel4_1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel4_1.setForeground(Color.WHITE);
		destinationlabel4_1.setBounds(288, 598, 75, 14);
		add(destinationlabel4_1);
		
		JLabel destinationlabel4_2 = new JLabel("Watching");
		destinationlabel4_2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel4_2.setForeground(Color.WHITE);
		destinationlabel4_2.setBounds(288, 613, 75, 14);
		add(destinationlabel4_2);
		
		JLabel destinationlabel5 = new JLabel(" Kayangan Lake ");
		destinationlabel5.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel5.setForeground(Color.WHITE);
		destinationlabel5.setBounds(380, 613, 82, 14);
		add(destinationlabel5);
		
		JLabel destinationlabel6_1 = new JLabel("Feel The Heat in");
		destinationlabel6_1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel6_1.setForeground(Color.WHITE);
		destinationlabel6_1.setBounds(469, 598, 84, 14);
		add(destinationlabel6_1);
		
		JLabel destinationlabel6_2 = new JLabel("Bacuit Bay Islans");
		destinationlabel6_2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel6_2.setForeground(Color.WHITE);
		destinationlabel6_2.setBounds(469, 613, 84, 14);
		add(destinationlabel6_2);
		
		JLabel destinationlabel7 = new JLabel("Honda Bay");
		destinationlabel7.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel7.setForeground(Color.WHITE);
		destinationlabel7.setBounds(555, 613, 82, 14);
		add(destinationlabel7);
		
		JLabel destinationlabel8 = new JLabel("Tabon Cave");
		destinationlabel8.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel8.setForeground(Color.WHITE);
		destinationlabel8.setBounds(648, 613, 82, 14);
		add(destinationlabel8);
		
		JLabel destinationlabel9 = new JLabel("Crocodile Farm");
		destinationlabel9.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel9.setForeground(Color.WHITE);
		destinationlabel9.setBounds(741, 613, 82, 14);
		add(destinationlabel9);
		
		JLabel destinationlabel10_1 = new JLabel("Immaculate");
		destinationlabel10_1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel10_1.setForeground(Color.WHITE);
		destinationlabel10_1.setBounds(842, 583, 75, 14);
		add(destinationlabel10_1);
		
		JLabel destinationlabel10_2 = new JLabel("Conception");
		destinationlabel10_2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel10_2.setForeground(Color.WHITE);
		destinationlabel10_2.setBounds(842, 598, 75, 14);
		add(destinationlabel10_2);
		
		
		JLabel destinationlabel10_3 = new JLabel("Cathedral");
		destinationlabel10_3.setHorizontalAlignment(SwingConstants.CENTER);
		destinationlabel10_3.setForeground(Color.WHITE);
		destinationlabel10_3.setBounds(842, 613, 75, 14);
		add(destinationlabel10_3);
		
		JLabel mapImage = new JLabel("");
		mapImage.setIcon(new ImageIcon(map));
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
				destinationClicked(tubbataha);
			}
		});
		destination1.setIcon(new ImageIcon(pic1));
		destination1.setBounds(0, 520, 92, 107);
		add(destination1);
		
		JLabel destination2 = new JLabel("");
		destination2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		destination2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				destinationClicked(barracudaLake);
			}
		});
		destination2.setIcon(new ImageIcon(pic2));
		destination2.setBounds(93, 520, 92, 107);
		add(destination2);
		
		JLabel destination3 = new JLabel("");
		destination3.setIcon(new ImageIcon(pic3));
		destination3.setBounds(186, 520, 92, 107);
		add(destination3);
		
		JLabel destination4 = new JLabel("");
		destination4.setIcon(new ImageIcon(pic4));
		destination4.setBounds(279, 520, 92, 107);
		add(destination4);
		
		JLabel destination5 = new JLabel("");
		destination5.setIcon(new ImageIcon(pic5));
		destination5.setBounds(372, 520, 90, 107);
		add(destination5);
		
		JLabel destination10 = new JLabel("l");
		destination10.setIcon(new ImageIcon(pic6));
		destination10.setBounds(833, 520, 92, 107);
		add(destination10);
		
		JLabel destination9 = new JLabel("");
		destination9.setIcon(new ImageIcon(pic7));
		destination9.setBounds(740, 520, 92, 107);
		add(destination9);
		
		JLabel destination8 = new JLabel("");
		destination8.setIcon(new ImageIcon(pic8));
		destination8.setBounds(647, 520, 92, 107);
		add(destination8);
		
		JLabel destination7 = new JLabel("");
		destination7.setIcon(new ImageIcon(pic9));
		destination7.setBounds(554, 520, 92, 107);
		add(destination7);
		
		JLabel destination6 = new JLabel("");
		destination6.setIcon(new ImageIcon(pic10));
		destination6.setBounds(461, 520, 92, 107);
		add(destination6);
		
		JLabel contentTitle = new JLabel("EVERYTHING YOU NEED TO KNOW ABOUT PALAWAN");
		contentTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		contentTitle.setForeground(Color.WHITE);
		contentTitle.setBounds(60, 217, 646, 68);
		add(contentTitle);
		scrollPanel(tubbataha);
	}
	public void destinationClicked(JPanel panel) {
		tubbataha.setVisible(false);
		barracudaLake.setVisible(false);
		panel.setVisible(true);
		
	}
	public void closeTab() {
		tubbataha.setVisible(false);
		barracudaLake.setVisible(false);
	}
	public void scrollPanel(JPanel panel) {
		addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int h = panel.getHeight();
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
					if(x==0&&y==0) {
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
					if(x==0&&y<=1) {
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

