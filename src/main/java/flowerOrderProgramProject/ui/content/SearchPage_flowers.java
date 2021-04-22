package flowerOrderProgramProject.ui.content;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.service.Flower_informationService;
import flowerOrderProgramProject.ui.FlowerFrm;
import flowerOrderProgramProject.view.Flower_information_panel;

@SuppressWarnings("serial")
public class SearchPage_flowers extends JFrame {

	private JPanel contentPane;
	private JTextField tfSearch;
	
	private Flower_informationService service;
	private JTextField tfCode;
	private JTextField tfName;
	private JTextField tfPrice;
	private Flower_information_panel panelTable;
		
//	private JTextField tf
	
	protected void setService() {
		service = new Flower_informationService();
	}
	
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
		service = new Flower_informationService();
		initialize();
	}
	private void initialize() {
		setTitle("Flowers_infomation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel picture = new JPanel();
		contentPane.add(picture);
		picture.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
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
		
		JPanel panel_2 = new JPanel();
		panelTable.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblCode = new JLabel("Code");
		panel_2.add(lblCode);
		
		tfCode = new JTextField();
		panel_2.add(tfCode);
		tfCode.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		panel_2.add(lblName);
		
		tfName = new JTextField();
		panel_2.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		panel_2.add(lblPrice);
		
		tfPrice = new JTextField();
		panel_2.add(tfPrice);
		tfPrice.setColumns(10);
		
		JButton btnNewButton = new JButton("↓");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("x");
		panel_2.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnBack = new JButton("◀ Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		panel_1.add(btnBack);
		
		JButton btnMain = new JButton(" Main ▶");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_1(e);
			}
		});
		panel_1.add(btnMain);
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		SearchPage_main frame = new SearchPage_main();
		frame.setVisible(true);
		dispose();
		
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		FlowerFrm frame = new FlowerFrm();
		frame.setVisible(true);
		dispose();
	}
}