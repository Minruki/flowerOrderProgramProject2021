package flowerOrderProgramProject.ui.content;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.panel.CustomerPanel;
import flowerOrderProgramProject.service.Customer_informationService;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CustomerInfo extends JFrame {
private Customer_informationService service;
	
	private JPanel contentPane;
	private JButton btnSave; 
	private CustomerPanel panel;
	private CustomerPanel panel_1;

	
	public CustomerInfo() {
		initialize();
	}
	
	protected void setService() {
		service = new Customer_informationService();
	}
	
	
	private void initialize() {
		setTitle("customer information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 637, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		contentPane.setLayout(null);
		
		panel_1 = new CustomerPanel();
		panel_1.setBackground(SystemColor.control);
		panel_1.setBounds(235, 56, 310, 222);
		contentPane.add(panel_1);
		
		JPanel empty = new JPanel();
		panel_1.add(empty);
		
		JPanel panelbuttons = new JPanel();
		panel_1.add(panelbuttons);
		panelbuttons.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnSaveInfo = new JButton("Save");
		btnSaveInfo.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSaveInfo(e);
			}
		});
		panelbuttons.add(btnSaveInfo);
		
		JButton btnCancel = new JButton("Clear");
		btnCancel.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCancel(e);
			}
		});
		panelbuttons.add(btnCancel);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\copy-space-roses-flowers_23-21488600321.jpg"));
		lblNewLabel.setBounds(0, -187, 1002, 735);
		contentPane.add(lblNewLabel);
	}

	
	protected void actionPerformedBtnSaveInfo(ActionEvent e) {
		
		
		service = new Customer_informationService();
		
		service.addCustomer_information(panel_1.getItem());
	
		dispose();
				
	}
	
	protected void actionPerformedBtnCancel(ActionEvent e) {
		panel.clearTf();
		
	}

	
}