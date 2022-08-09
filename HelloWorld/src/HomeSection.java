import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.MatteBorder;

import AppPackage.AnimationClass;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HomeSection extends JFrame {

	private Image logo = new ImageIcon(Home.class.getResource("res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image hero = new ImageIcon(Home.class.getResource("res/hero.png")).getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH);
	private Image slear = new ImageIcon(Home.class.getResource("res/slear.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image kayla = new ImageIcon(Home.class.getResource("res/kayla.png")).getImage().getScaledInstance(155,155, Image.SCALE_SMOOTH);
	private Image eljay = new ImageIcon(Home.class.getResource("res/eljay.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image cherry = new ImageIcon(Home.class.getResource("res/cherry.png")).getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
	private Image nat = new ImageIcon(Home.class.getResource("res/nat.png")).getImage().getScaledInstance(155,190, Image.SCALE_SMOOTH);
	private Image kyle = new ImageIcon(Home.class.getResource("res/kyle.png")).getImage().getScaledInstance(165,200, Image.SCALE_SMOOTH);
	private Image facebook = new ImageIcon(Home.class.getResource("res/facebook.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH);

	AnimationClass aClass = new AnimationClass();
	
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JTextField txtEnterYourEmail;
	private JTextField emailSubs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeSection frame = new HomeSection();
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
	public HomeSection() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 1810);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel mainSection = new JPanel();
		mainSection.setLayout(null);
		mainSection.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		mainSection.setBackground(new Color(205, 133, 63));
		mainSection.setBounds(0, 0, 925, 1915);
		contentPane.add(mainSection);
		
		JLabel image1 = new JLabel("");
		image1.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)));
		image1.setBounds(0, 0, 925, 389);
		mainSection.add(image1);
		
		JLabel image2 = new JLabel("");
		image2.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)));
		image2.setBounds(900, 0, 925, 389);
		mainSection.add(image2);
		
		JLabel image3 = new JLabel("");
		image3.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)));
		image3.setBounds(1800, 0, 925, 389);
		mainSection.add(image3);
		
		JTextPane sectionParagraph = new JTextPane();
		sectionParagraph.setText("Travel List Journey is a compilation of stories on the road, tales of experiences, and a bunch of tips about traveling. Take a look at these articles and learn how is the best way to see the world, meet people, make new friends, survive long-term traveling, and enjoy life. With over 7,000 islands, the Philippines is an easy destination to visit multiple times. Each region of the Philippines has a different landscape, ranging from mountainous to tropical to urban. You may spend a day strolling through Manila's ancient colonial streets or visiting a private sanctuary on the island of Bohol to see small tarsier monkeys. Hiking in the steep, green mountains is a once-in-a-lifetime adventure.\r\n\r\nFurthermore, if you wish to begin your adventure of conquering the Philippines, these articles will offer you an overview of what to expect in the Philippines.");
		sectionParagraph.setForeground(Color.WHITE);
		sectionParagraph.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		sectionParagraph.setEditable(false);
		sectionParagraph.setBackground(new Color(205, 133, 63));
		sectionParagraph.setBounds(75, 488, 429, 289);
		mainSection.add(sectionParagraph);
		
		JLabel sectionTitle = new JLabel("Travel List Journey");
		sectionTitle.setForeground(Color.WHITE);
		sectionTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		sectionTitle.setBounds(153, 430, 268, 37);
		mainSection.add(sectionTitle);
		
		JLabel sectionLogo = new JLabel("");
		sectionLogo.setHorizontalAlignment(SwingConstants.CENTER);
		sectionLogo.setBounds(69, 412, 84, 75);
		mainSection.add(sectionLogo);
		
		JLabel heroPhoto = new JLabel("");
		heroPhoto.setBounds(501, 412, 355, 365);
		mainSection.add(heroPhoto);
		
		JPanel aboutTeamPanel = new JPanel();
		aboutTeamPanel.setLayout(null);
		aboutTeamPanel.setBackground(Color.DARK_GRAY);
		aboutTeamPanel.setBounds(0, 788, 925, 57);
		mainSection.add(aboutTeamPanel);
		
		JLabel lblNewLabel_4 = new JLabel("ABOUT THE TEAM");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
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
		askUsParag.setBounds(75, 1411, 781, 57);
		mainSection.add(askUsParag);
		
		JPanel nameContainer = new JPanel();
		nameContainer.setBackground(Color.DARK_GRAY);
		nameContainer.setBounds(75, 1472, 308, 57);
		mainSection.add(nameContainer);
		nameContainer.setLayout(null);
		
		JTextField txtName = new JTextField();
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
		
		JPanel emailCointainer = new JPanel();
		emailCointainer.setBackground(Color.DARK_GRAY);
		emailCointainer.setBounds(501, 1472, 308, 57);
		mainSection.add(emailCointainer);
		emailCointainer.setLayout(null);
		
		txtEnterYourEmail = new JTextField();
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
		txtEnterYourEmail.setText("ENTER YOUR EMAIL");
		txtEnterYourEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourEmail.setForeground(Color.BLACK);
		txtEnterYourEmail.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		txtEnterYourEmail.setColumns(10);
		txtEnterYourEmail.setBackground(Color.LIGHT_GRAY);
		txtEnterYourEmail.setBounds(10, 11, 288, 35);
		emailCointainer.add(txtEnterYourEmail);
		
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
	}
}
