package flowerOrderProgramProject.ui.content;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.panel.CustomerPanel;
import flowerOrderProgramProject.service.Customer_informationService;
import flowerOrderProgramProject.ui.FlowerFrm;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class CustomerInfo extends JFrame {
private Customer_informationService service;
	
	private JPanel contentPane;
	private JButton btnSave; 
	private CustomerPanel panel;
	private CustomerPanel panel_1;

	private FlowerFrm flowerFrm;

	
	public CustomerInfo() {
		initialize();
	}
	
	protected void setService() {
		service = new Customer_informationService();
	}
	
	
	private void initialize() {
		setTitle("customer information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 635, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		contentPane.setLayout(null);
		
		panel_1 = new CustomerPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u203B \uD68C\uC6D0 \uC815\uBCF4 \u203B", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.control);
		panel_1.setBounds(256, 47, 342, 260);
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
				JOptionPane.showMessageDialog(null, "Welcome to Join us♥ ");
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
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Back to ");
		lblNewLabel_1.setBounds(12, 0, 60, 25);
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(12, 0, 36, 25);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\arrow1.jpg"));
		panel_4.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Main");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
				
				dispose();
			}
		});
		panel_3.add(btnNewButton);
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\copy-space-roses-flowers_23-21488600321.jpg"));
		lblNewLabel.setBounds(0, -187, 1002, 735);
		contentPane.add(lblNewLabel);
	}

	
	protected void actionPerformedBtnSaveInfo(ActionEvent e) {
		
		
		service = new Customer_informationService();
		
		service.addCustomer_information(panel_1.getItem());
	
		
				
	}
	
	protected void actionPerformedBtnCancel(ActionEvent e) {
		panel_1.clearTf();
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		this.flowerFrm = new FlowerFrm();
		FlowerFrm frame = new FlowerFrm();
		frame.setResizable(false);
		

	}
}