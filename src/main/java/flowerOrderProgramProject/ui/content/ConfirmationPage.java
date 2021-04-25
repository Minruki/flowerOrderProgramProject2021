package flowerOrderProgramProject.ui.content;

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


import flowerOrderProgramProject.panel.ConfirmPanel;
import flowerOrderProgramProject.ui.FlowerFrm;

@SuppressWarnings("serial")
public class ConfirmationPage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmationPage frame = new ConfirmationPage();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConfirmationPage() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		JScrollPane scroll = new JScrollPane(panel);
//		panel.add(scroll);
		
		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//		
//		scrollPane.add(contentPane);
//		panel.add(scrollPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton(arg0);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\1111111111.jpg"));
		btnNewButton.setBounds(774, 328, 71, 67);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 42, 685, 353);
		contentPane.add(scrollPane);
		
		ConfirmPanel panel = new ConfirmPanel();
		scrollPane.setViewportView(panel);
		panel.loadData();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\different-color-roses.jpg"));
		lblNewLabel.setBounds(0, 0, 861, 441);
		contentPane.add(lblNewLabel);
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		
		FlowerFrm frame = new FlowerFrm();
		dispose();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
