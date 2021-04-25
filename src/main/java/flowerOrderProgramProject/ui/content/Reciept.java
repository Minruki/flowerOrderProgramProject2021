package flowerOrderProgramProject.ui.content;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import flowerOrderProgramProject.panel.RecieptPanel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reciept extends JFrame {

	private JPanel contentPane;
	private RecieptPanel panel_1;
	private JButton button;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reciept frame = new Reciept();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reciept() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 711, 398);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new RecieptPanel();
		panel_1.setBounds(12, 10, 405, 343);
		contentPane.add(panel_1);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedButton(e);
			}
		});
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\1111111111.jpg"));
		button.setBounds(429, 286, 67, 67);
		contentPane.add(button);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\IMG_00061.jpg"));
		lblNewLabel.setBounds(0, -15, 695, 374);
		contentPane.add(lblNewLabel);
	}

	public RecieptPanel getPanel_1() {
		return panel_1;
	}
	protected void actionPerformedButton(ActionEvent e) {
		dispose();
	}
	
	
}
