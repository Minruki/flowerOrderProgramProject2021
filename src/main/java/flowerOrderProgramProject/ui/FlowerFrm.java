package flowerOrderProgramProject.ui;
 
import java.awt.Color;
import java.awt.Component;
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

import flowerOrderProgramProject.ui.content.CustomerInfo;
import flowerOrderProgramProject.ui.content.Detailview;

import flowerOrderProgramProject.ui.content.LogoutPageMain;
import flowerOrderProgramProject.ui.content.OrderPage;

import flowerOrderProgramProject.ui.content.SearchPage_main;

// 로그인 성공 후 메인 화면
 
@SuppressWarnings("serial")
public class FlowerFrm extends JFrame implements ActionListener{
	private JButton btnOrder;
	private JButton btnCI;
    public FlowerFrm() {
    	initialize();
    }
    private void initialize() {
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
    	btnCI.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnCI);
    	
    	JButton btnFs = new JButton("Manage Flowers");
    	btnFs.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			Detailview frame = new Detailview();
			
    			
    		}
    	});
    	panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
   
    	btnFs.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnFs);
    	
    	JButton btnSD = new JButton("View All");
    	btnSD.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			SearchPage_main frame = new SearchPage_main();
				frame.setVisible(true);
				
    		}
    		
    	});
    	btnSD.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnSD);
    	
    	JButton btnLog = new JButton("LogOut");
    	btnLog.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			actionPerformedBtnLog(e);
    		}
    	});
    	btnLog.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnLog);
    	panel.add(panel_1);
    	
    	JLabel lblNewLabel = new JLabel("");
    	lblNewLabel.setIcon(new ImageIcon("C:\\workspace_java\\FlowerOrderProgramProject\\image\\flower\\flowershop.jpg"));
    	panel.add(lblNewLabel);
    }
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCI) {
			actionPerformedBtn02(e);
		}
		if (e.getSource() == btnOrder) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		OrderPage frame = new OrderPage();
		frame.setVisible(true);
		this.dispose();
	}
	protected void actionPerformedBtn02(ActionEvent e) {
		CustomerInfo frame = new CustomerInfo();
		frame.setVisible(true);
		this.dispose();
		
	}
	protected void actionPerformedBtnLog(ActionEvent e) {
		
		LogoutPageMain frame = new LogoutPageMain();
		frame.setVisible(true);
		this.dispose();
		
	}
}