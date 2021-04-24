package flowerOrderProgramProject.panel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import flowerOrderProgramProject.dto.Order_program;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class RecieptPanel extends JPanel {
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_3;
	private JLabel lbl5;

	public RecieptPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 0, 0));
		
		lblNewLabel_4 = new JLabel("▒ Order_Date >>>  ");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblNewLabel_4);
		
		lbl1 = new JLabel("");
		add(lbl1);
		
		lblNewLabel = new JLabel("▒ Flower_code >>>  ");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(null);
		add(lblNewLabel);
		
		lbl2 = new JLabel("");
		add(lbl2);
		
		lblNewLabel_1 = new JLabel("▒ Order_count >>>  ");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblNewLabel_1);
		
		lbl3 = new JLabel("");
		add(lbl3);
		
		lblNewLabel_3 = new JLabel("▒ Choice >>>");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		add(lblNewLabel_3);
		
		lbl5 = new JLabel("");
		add(lbl5);
		
		lblNewLabel_2 = new JLabel("▒ Sale_Price >>>  ");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblNewLabel_2);
		
		lbl4 = new JLabel("");
		add(lbl4);
	}
	
	public void setRecItem(Order_program o) {
		lbl1.setText(o.getOrder_date()+"");
		lbl2.setText(o.getFlower_code().getFlower_code());
		lbl3.setText(o.getOrder_count()+"");
		lbl4.setText(o.getSale_price()+"");
	}

}
