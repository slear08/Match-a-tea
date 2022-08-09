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

import agusan.agusanMain;

public class stJosephCathedral extends JPanel {

	private Image logo = new ImageIcon(agusanMain.class.getResource("/res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	private Image banner = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/Saint Joseph Cathedral1.jpg")).getImage().getScaledInstance(925,196, Image.SCALE_SMOOTH);
	private Image contentImage1 = new ImageIcon(romblonMain.class.getResource("/destinationResRomblon/Saint Joseph Cathedral3.jpg")).getImage().getScaledInstance(427, 279, Image.SCALE_SMOOTH);
	 
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public stJosephCathedral() {
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
				backBtn.setForeground(Color.BLACK);
			}
		});
		backBtn.setHorizontalAlignment(SwingConstants.CENTER);
		backBtn.setForeground(new Color(0, 0, 0));
		backBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		backBtn.setBounds(0, 0, 100, 33);
		add(backBtn);
		
		JLabel titleStJoseph = new JLabel("SAINT JOSEPH CATHERAL");
		titleStJoseph.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		titleStJoseph.setHorizontalAlignment(SwingConstants.CENTER);
		titleStJoseph.setForeground(new Color(0, 0, 0));
		titleStJoseph.setBounds(24, 180, 432, 55);
		add(titleStJoseph);
		
		JLabel stJosephBanner = new JLabel("");
		stJosephBanner.setIcon(new ImageIcon(banner));
		stJosephBanner.setBounds(0, 0, 925, 187);
		add(stJosephBanner);
		
		JTextPane txtStJoseph = new JTextPane();
		txtStJoseph.setBackground(new Color(205, 133, 63));
		txtStJoseph.setForeground(new Color(255, 255, 255));
		txtStJoseph.setEditable(false);
		txtStJoseph.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		txtStJoseph.setText("The most famous and oldest Roman Catholic Church in Romblon is Saint Joseph Cathedral, which dates from the 15th century. The church was erected between 1640 and 1726 by the Recollect Fathers and features spectacular architecture composed of coral bricks and stones. With its marble facade and bell tower on the side, it has undergone major repairs. It also boasts a lovely interior that features crafts, religious artwork, and art creations by local artists. The town's patron saint, Santo Nio de Romblon, is honored every second week of January with the Biniray Festival.");
		txtStJoseph.setBounds(63, 219, 379, 258);
		add(txtStJoseph);
		
		JLabel stJosephIImgContent = new JLabel("");
		stJosephIImgContent.setIcon(new ImageIcon(contentImage1));
		stJosephIImgContent.setBounds(452, 198, 427, 279);
		add(stJosephIImgContent);
		
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
		
		JTextPane txtStJoseph1 = new JTextPane();
		txtStJoseph1.setBackground(new Color(205, 133, 63));
		txtStJoseph1.setForeground(Color.WHITE);
		txtStJoseph1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		txtStJoseph1.setText("Romblon, the capital town of Romblon Province has many things to boast about. Aside from natural wonders, Romblon has heritage and religious sites that every tourist must explore. Considered as the oldest Roman Catholic church in the province, Saint Joseph Cathedral was one the 26 colonial churches declared as National Cultural Treasures in 2001.Built by recollect fathers way back in 15th century, Saint Joseph Cathedral showcases a multitude of artistic and tasteful craft. The windows with stained-glass, Byzantine altar, religious paintings and antique icons; all of it mesmerizes the visitors. Every year the residents of Romblon and nearby islands celebrate the traditional fiesta. This is to honor the patron saint of Romblon; St. Nino. The cathedral still makes use of the exponentially old bell made of copper; which was part of the construction in the years of 1640-1726.\n\n");
		txtStJoseph1.setBounds(63, 477, 818, 172);
		add(txtStJoseph1);
		

	}
}

