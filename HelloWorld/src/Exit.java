import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Cursor;
import java.awt.Dialog.ModalityType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Window.Type;

public class Exit extends JFrame {
	private Image logo = new ImageIcon(Home.class.getResource("res/logo.png")).getImage().getScaledInstance(70,70, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exit frame = new Exit();
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
	public Exit() {
		setFocusTraversalPolicyProvider(true);
		setAlwaysOnTop(true);
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 228);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 133, 63));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 450, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(logo));
		lblNewLabel.setBounds(98, 0, 75, 72);
		panel.add(lblNewLabel);
		
		JLabel navTitle1 = new JLabel("Travel List Journey");
		navTitle1.setForeground(Color.WHITE);
		navTitle1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		navTitle1.setBounds(167, 6, 191, 37);
		panel.add(navTitle1);
		
		JLabel navTitle2 = new JLabel("Travel Vlog");
		navTitle2.setForeground(Color.WHITE);
		navTitle2.setFont(new Font("Verdana", Font.BOLD, 15));
		navTitle2.setBounds(197, 27, 101, 45);
		panel.add(navTitle2);
		
		JLabel lblNewLabel_1 = new JLabel("Are you sure? Do you want to exit?");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblNewLabel_1.setBounds(74, 89, 304, 54);
		contentPane.add(lblNewLabel_1);
		
		JButton yesBtnToExit = new JButton("YES");
		yesBtnToExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
				Exit.this.dispose();
			}
		});
		yesBtnToExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				yesBtnToExit.setBackground(Color.GRAY);
				yesBtnToExit.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				yesBtnToExit.setBackground(Color.DARK_GRAY);
				yesBtnToExit.setForeground(Color.WHITE);
			}
		});
		yesBtnToExit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		yesBtnToExit.setForeground(Color.WHITE);
		yesBtnToExit.setBorder(null);
		yesBtnToExit.setBackground(Color.DARK_GRAY);
		yesBtnToExit.setFocusPainted(false);
		yesBtnToExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		yesBtnToExit.setBounds(84, 154, 102, 54);
		contentPane.add(yesBtnToExit);
		
		JButton noBtnToExit = new JButton("NO");
		noBtnToExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exit.this.dispose();
			}
		});
		noBtnToExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				noBtnToExit.setBackground(Color.GRAY);
				noBtnToExit.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				noBtnToExit.setBackground(Color.DARK_GRAY);
				noBtnToExit.setForeground(Color.WHITE);
			}
		});
		noBtnToExit.setForeground(Color.WHITE);
		noBtnToExit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		noBtnToExit.setFocusPainted(false);
		noBtnToExit.setBorder(null);
		noBtnToExit.setBackground(Color.DARK_GRAY);
		noBtnToExit.setBounds(256, 154, 102, 54);
		contentPane.add(noBtnToExit);
		
		
	}
}
