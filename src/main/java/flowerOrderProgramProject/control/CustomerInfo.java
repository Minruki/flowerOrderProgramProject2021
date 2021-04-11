package flowerOrderProgramProject.control;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.panel.CustomerPanel;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class CustomerInfo extends JFrame {

	private JPanel contentPane;
	private JButton btnSave; 

	public CustomerInfo() {
		initialize();
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
		
		CustomerPanel panel = new CustomerPanel();
		panel.setBackground(SystemColor.control);
		panel.setBounds(235, 56, 310, 222);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("Save");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Del");
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\copy-space-roses-flowers_23-21488600321.jpg"));
		lblNewLabel.setBounds(0, -187, 1002, 735);
		contentPane.add(lblNewLabel);
	}
	public JButton getBtnSave() {
		return btnSave;
	}
	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}
	
	
}