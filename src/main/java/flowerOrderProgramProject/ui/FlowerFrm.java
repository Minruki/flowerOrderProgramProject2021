package flowerOrderProgramProject.ui;
 
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import flowerOrderProgramProject.ui.content.ConfirmationPage;
import flowerOrderProgramProject.ui.content.CustomerInfo;
import flowerOrderProgramProject.ui.content.Detailview;

import flowerOrderProgramProject.ui.content.LogoutPageMain;
import flowerOrderProgramProject.ui.content.OrderPage;
import flowerOrderProgramProject.ui.content.Reciept;
import flowerOrderProgramProject.ui.content.SearchPage_main;

// 로그인 성공 후 메인 화면
 
@SuppressWarnings("serial")
public class FlowerFrm extends JFrame implements ActionListener{
	private JButton btnOrder;
	private JButton btnCI;
	private JButton btnConfirm;
	private JButton btnFs;
	private JButton btnSD;
	private JButton btnLog;
    
	public FlowerFrm() {
    	initialize();
    	}
	
    private void initialize() {
    	setTitle("Main Page");
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	setSize(1139, 478);
    	setVisible(true);
    	getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
    	
    	JPanel panel = new JPanel();
    	getContentPane().add(panel);
    	
    	JPanel panel_1 = new JPanel();
    	panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
    	panel_1.setBackground(Color.WHITE);
    	
    	btnOrder = new JButton("Order");
    	btnOrder.addActionListener(this);
    	panel_1.setLayout(new GridLayout(0, 1, 10, 10));
    	btnOrder.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnOrder);
    	
    	btnCI = new JButton("Join New");
    	btnCI.addActionListener(this);
    	
    	btnConfirm = new JButton("Confirmation");
    	btnConfirm.addActionListener(this);
    	btnConfirm.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnConfirm);
    	btnCI.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnCI);
    	
    	btnFs = new JButton("Manage Flowers");
    	btnFs.addActionListener(this);
    	panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
   
    	btnFs.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnFs);
    	
    	btnSD = new JButton("View All");
    	btnSD.addActionListener(this);
    	btnSD.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnSD);
    	
    	btnLog = new JButton("LogOut");
    	btnLog.addActionListener(this);
    		
    	btnLog.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnLog);
    	panel.add(panel_1);
    	
    	JLabel lblNewLabel = new JLabel("");
    	lblNewLabel.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\flowershop1.jpg"));
    	panel.add(lblNewLabel);
    }
    
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCI) {
			actionPerformedBtnCI(e);
		}
		if (e.getSource() == btnOrder) {
			actionPerformedBtnOrder(e);
		}
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
		if (e.getSource() == btnFs) {
			actionPerformedBtnFs(e);
		}
	
		if (e.getSource() == btnSD) {
			actionPerformedBtnSD(e);
		}
		
		if (e.getSource() == btnLog) {
			actionPerformedBtnLog(e);
		}
		
	
		
	}
	
	
	
	protected void actionPerformedBtnOrder(ActionEvent e) {

		OrderPage frame = new OrderPage();

		frame.setResizable(false);
		frame.setVisible(true);
		this.dispose();
	}
	
	
	protected void actionPerformedBtnCI(ActionEvent e) {

		CustomerInfo frame = new CustomerInfo();
		
		frame.setResizable(false);
		frame.setVisible(true);
		this.dispose();
		
	}
	
	
	protected void actionPerformedBtnLog(ActionEvent e) {
		
		LogoutPageMain frame = new LogoutPageMain();
	
		frame.setVisible(true);
		frame.setResizable(false);
		this.dispose();
		
	}
	
	protected void actionPerformedBtnFs(ActionEvent e) {
	
		Detailview frame = new Detailview();

		frame.setVisible(true);
		frame.setResizable(false);
		this.dispose();
		
	}
	
	protected void actionPerformedBtnSD(ActionEvent e) {
	
		SearchPage_main frame = new SearchPage_main();

		frame.setResizable(false);
		frame.setVisible(true);
		this.dispose();
		
	}
	
	
	
	protected void actionPerformedBtnConfirm(ActionEvent e) {
		
		ConfirmationPage frame = new ConfirmationPage();
		frame.setResizable(false);
		frame.setVisible(true);
		this.dispose();
		
	}
}