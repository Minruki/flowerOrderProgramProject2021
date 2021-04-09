package flowerOrderProgramProject.control;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.panel.CustomerPanel;

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
		panel.setBounds(262, 63, 310, 222);
		contentPane.add(panel);
		
		
		
		JButton btnModify = new JButton("Modify");
		panel.add(btnModify);
		
		JButton btnDel = new JButton("Delete");
		panel.add(btnDel);
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
		
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
