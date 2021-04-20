package flowerOrderProgramProject.ui.content;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.view.Flower_information_panel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class SearchPage_flowers extends JFrame {

	private JPanel contentPane;
	private JTextField tfSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPage_flowers frame = new SearchPage_flowers();
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
	public SearchPage_flowers() {
		initialize();
	}
	private void initialize() {
		setTitle("Flowers_infomation");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1013, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel picture = new JPanel();
		contentPane.add(picture);
		picture.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\flowerline.jpg"));
		
		
		picture.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_search = new JPanel();
		contentPane.add(panel_search);
		
		tfSearch = new JTextField();
		panel_search.add(tfSearch);
		tfSearch.setColumns(20);
		
		JButton btnSearch = new JButton("Search");
		panel_search.add(btnSearch);
		
		Flower_information_panel panelTable = new Flower_information_panel();
		panelTable.loadData();
		contentPane.add(panelTable);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 10, 0, 0));
	}

}