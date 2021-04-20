package flowerOrderProgramProject.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.MenuItem;
import java.awt.Panel;
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

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.service.Customer_informationService;
import flowerOrderProgramProject.ui.FlowerFrm;
import flowerOrderProgramProject.view.Customer_information_panel;

@SuppressWarnings("serial")
public class SearchPage_info extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfSearch;
	private JPopupMenu popMenu;
	private Customer_informationService service;
	
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
		panelSearch.add(btnSearch);
		
		Customer_information_panel panelTable = new Customer_information_panel();
		panelTable.loadData();
		contentPane.add(panelTable);
		
//		
//		JPopupMenu popMenu = new JPopupMenu();
//		panelTable.setPopupMenu(popMenu);
//		
//	}
//		private JPopupMenu createPopupMenu() {
//			
//			
//			JMenuItem deleteItem = new JMenuItem("Delete");
//			deleteItem.addActionListener(this);
//			popMenu.add(deleteItem);
//			
//			return popMenu;
//		}
//		
//		public void actionPerformed(ActionEvent popMenu) {
//			
//			
//			if(popMenu.getSource() instanceof JMenuItem) {
//				if(popMenu.getActionCommand().equals("삭제")) {
//					actionPerformedMenuDelete();
//				}
//			}
		
		
		
		
		MenuItem item = new MenuItem();
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("◀ Back");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Main ▶");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_2(e);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		panel_1.add(btnNewButton_2);
	}






//	private void actionPerformedMenuDelete() {
//			Customer_information delInformation = p
//			
//			
//			
//		}

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
}