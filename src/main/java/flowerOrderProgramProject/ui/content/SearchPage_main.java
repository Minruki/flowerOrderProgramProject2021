package flowerOrderProgramProject.ui.content;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.Color;


@SuppressWarnings("serial")
public class SearchPage_main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPage_main frame = new SearchPage_main();
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
	public SearchPage_main() {
		initialize();
	}
	private void initialize() {
		setTitle("View All");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(82, 263, 463, 37);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 5, 0));
		
		JButton btnNewButton = new JButton("Flower_Information : 꽃 정보");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SearchPage_flowers frame = new SearchPage_flowers();
				frame.setVisible(true);
				dispose();
				
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Customer_information : 고객 정보");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SearchPage_info frame = new SearchPage_info();
				frame.setVisible(true);
				dispose();
			}
		});
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\3d-render-cherry-blossom-bokeh-lights-background_1048-6029.jpg"));
		lblNewLabel.setBounds(0, 0, 610, 332);
		contentPane.add(lblNewLabel);
	}
}