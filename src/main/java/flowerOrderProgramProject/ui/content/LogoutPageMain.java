package flowerOrderProgramProject.ui.content;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import flowerOrderProgramProject.panel.LogoutButtonPanel;
import java.awt.Color;

@SuppressWarnings("serial")
public class LogoutPageMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogoutPageMain frame = new LogoutPageMain();
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
	public LogoutPageMain() {
		initialize();
	}
	private void initialize() {
		setTitle("Before Logout ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 449);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(146, 203, 338, 43);
		contentPane.add(panel);
		
		LogoutButtonPanel panel_1 = new LogoutButtonPanel();
		panel_1.setFrame(this);
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 626, 417);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\logout2.jpg"));
	}

}
