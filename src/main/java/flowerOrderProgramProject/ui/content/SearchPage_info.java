package flowerOrderProgramProject.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.MenuItem;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Membership_discount;
import flowerOrderProgramProject.service.Customer_informationService;
import flowerOrderProgramProject.ui.FlowerFrm;
import flowerOrderProgramProject.view.Customer_information_panel;

@SuppressWarnings("serial")
public class SearchPage_info extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfSearch;
	private TableRowSorter sorter;

	private Customer_informationService service;
	private JTextField tfCusId;
	private JTextField tfCusName;
	private JTextField tfCusPhone;
	private JTextField tfCusAmount;
	private JTextField tfCusMBS;
	private Customer_information_panel panelTable;
	
	protected void setService() {
		service = new Customer_informationService();
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPage_info frame = new SearchPage_info();
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
	public SearchPage_info() {
		service = new Customer_informationService();
		initialize();
	}
	private void initialize() {
		setTitle("Customer_information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JPanel panelSearch = new JPanel();
		contentPane.add(panelSearch);
		
		tfSearch = new JTextField();
		panelSearch.add(tfSearch);
		tfSearch.setColumns(30);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnSearch(arg0);
			}
		});
		panelSearch.add(btnSearch);
		
		panelTable = new Customer_information_panel();
		panelTable.loadData();
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("id");
		panel_2.add(lblNewLabel);
		
		tfCusId = new JTextField();
		panel_2.add(tfCusId);
		tfCusId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("member");
		panel_2.add(lblNewLabel_2);
		
		tfCusName = new JTextField();
		panel_2.add(tfCusName);
		tfCusName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("phone");
		panel_2.add(lblNewLabel_3);
		
		tfCusPhone = new JTextField();
		panel_2.add(tfCusPhone);
		tfCusPhone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("amount");
		panel_2.add(lblNewLabel_4);
		
		tfCusAmount = new JTextField();
		panel_2.add(tfCusAmount);
		tfCusAmount.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("membership");
		panel_2.add(lblNewLabel_5);
		
		tfCusMBS = new JTextField();
		panel_2.add(tfCusMBS);
		tfCusMBS.setColumns(10);
		
//		public void clearTf() {
//			
//			tfCusId.setText("");
//			tfCusName.setText("");
//			tfCusPhone.setText("");
//			tfCusAmount.setText("");
//			tfCusMBS.setText("");
//			
//			if (!tfCusId.isEditable()) {
//				tfCusId.setEditable(false);
//			}
//			
//		}
		
		
		JButton btnModify = new JButton("↓");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_1(e);
			}
		});
		panel_2.add(btnModify);
		
		JButton btnCancel = new JButton("X");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_3(e);
			}
		});
		panel_2.add(btnCancel);
		contentPane.add(panelTable);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnBack = new JButton("◀ Back");
		
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		
		panel_1.add(btnBack);
		
		JButton btnMain = new JButton("Main ▶");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_2(e);
			}
		});
		
		btnMain.setBackground(new Color(255, 255, 255));
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
	protected void actionPerformedBtnNewButton_2(ActionEvent e) {
		FlowerFrm frame = new FlowerFrm();
		frame.setVisible(true);
		dispose();
		
	}


	@Override
	//삭제용
	public void actionPerformed(ActionEvent arg0) {
		
		service.removeCustomer_information(panelTable.getItem());
		panelTable.loadData();
	}
	
	
	private void setItemPanel(Customer_information cus) {
		tfCusId.setText(cus.getId());
		tfCusName.setText(cus.getMember_name());
		tfCusPhone.setText(cus.getPhone_number());
		tfCusAmount.setText(cus.getCumulative_amount()+"");
		tfCusMBS.setText(cus.getMembership_title().getMembership_title());
		tfCusId.setEnabled(false);
		tfCusAmount.setEnabled(false);
	}
	
	private Customer_information getItemPanel() {
		String id = tfCusId.getText();
		String member_name = tfCusName.getText();
		String phone_number = tfCusPhone.getText();
		int cumulative_amount = Integer.parseInt(tfCusAmount.getText());
		Membership_discount membership_title = new Membership_discount(tfCusMBS.getText());
		return new Customer_information(id, member_name, phone_number, cumulative_amount, membership_title);
	}
	
	private void clearTf() {
		tfCusId.setText("");
		tfCusName.setText("");
		tfCusPhone.setText("");
		tfCusAmount.setText("");
		tfCusMBS.setText("");
		tfSearch.setText("");
	}
	
	protected void actionPerformedBtnSearch(ActionEvent arg0) {
		Customer_information searchCus = new Customer_information(tfSearch.getText());
		Customer_information cus = service.showCusInfoByNo(searchCus);
		setItemPanel(cus);
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {

		
		service.modiCusDetailInfo(getItemPanel());
		panelTable.loadData();
	}
	protected void actionPerformedBtnNewButton_3(ActionEvent e) {
		clearTf();
		
		//기존 DB에 있는 데이터는 삭제 안됨, 새로 추가한 데이터만 가능
			
	}
	
	
		
	
}