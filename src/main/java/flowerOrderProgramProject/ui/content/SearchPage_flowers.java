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
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.service.Flower_informationService;
import flowerOrderProgramProject.ui.FlowerFrm;
import flowerOrderProgramProject.view.Flower_information_panel;
import java.awt.Color;

@SuppressWarnings("serial")
public class SearchPage_flowers extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	private Flower_informationService service;
	private JTextField tfCode;
	private JTextField tfName;
	private JTextField tfPrice;
	private Flower_information_panel panelTable;
	private JButton btnSearch;
	private JTextField tfSearch;
		
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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel picture = new JPanel();
		contentPane.add(picture);
		picture.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\flowerline.png"));
		
		
		picture.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_search = new JPanel();
		contentPane.add(panel_search);
		
		tfSearch = new JTextField();
		panel_search.add(tfSearch);
		tfSearch.setColumns(20);
		
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnSearch(arg0);
			}
		});
		
		panel_search.add(btnSearch_1);
		
		panelTable = new Flower_information_panel();
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
		
		JButton btnSave = new JButton("↓");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton1(e);
			}
		});
		panel_2.add(btnSave);
		
		JButton btnClear = new JButton("x");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton_1(arg0);
			}
		});
		panel_2.add(btnClear);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnBack = new JButton("◀ Back");
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		panel_1.add(btnBack);
		
		JButton btnMain = new JButton("Main ▶");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnMain(arg0);
			}
		});
		btnMain.setBackground(Color.WHITE);
		panel_1.add(btnMain);
		
		JPopupMenu popupMenu = createPopupMenu();
		panelTable.setPopupMenu(popupMenu);
	}

	private JPopupMenu createPopupMenu() {
		JPopupMenu popMenu = new JPopupMenu();
		
		JMenuItem deleteItem = new JMenuItem("삭제");
		deleteItem.addActionListener(this);
		popMenu.add(deleteItem);
		return popMenu;
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		SearchPage_main frame = new SearchPage_main();
		frame.setVisible(true);
		dispose();
		
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		clearTf();
		
//		FlowerFrm frame = new FlowerFrm();
//		frame.setVisible(true);
//		dispose();
	}


	
	private void clearTf() {
		tfCode.setText("");
		tfName.setText("");
		tfPrice.setText("");
		tfSearch.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(panelTable.getItem());
		service.removeFlower_information(panelTable.getItem());
		panelTable.loadData();
	}
	
	private void setItemPanel(Flower_information fInfo) {
		tfCode.setText(fInfo.getFlower_code());
		tfName.setText(fInfo.getFlower_name());
		tfPrice.setText(fInfo.getFlower_price()+"");
		tfCode.setEnabled(false);
		
	}
	
	private Flower_information getItemPanel() {
		String code = tfCode.getText();
		String name = tfName.getText();
		int price = Integer.parseInt(tfPrice.getText());
		
		return new Flower_information(code, name, price);
	}
	
	protected void actionPerformedBtnSearch(ActionEvent arg0) {
		Flower_information searchFlower_information = new Flower_information(tfSearch.getText());
		Flower_information fInfo = service.selectFlower_infoByNo(searchFlower_information);
		setItemPanel(fInfo);
	}
	
	protected void actionPerformedBtnNewButton1(ActionEvent e) {
		service.modifyFlower_information(getItemPanel());
		panelTable.loadData();
	}

	protected void actionPerformedBtnMain(ActionEvent arg0) {
		FlowerFrm frame = new FlowerFrm();
		frame.setVisible(true);
		dispose();
		
	}
}