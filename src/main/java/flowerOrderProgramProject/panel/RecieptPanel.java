package flowerOrderProgramProject.panel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import flowerOrderProgramProject.dto.Order_program;

import javax.swing.JLabel;

public class RecieptPanel extends JPanel {
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;

	public RecieptPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		lbl1 = new JLabel("New label");
		add(lbl1);
		
		lbl2 = new JLabel("New label");
		add(lbl2);
		
		lbl3 = new JLabel("New label");
		add(lbl3);
		
		lbl4 = new JLabel("New label");
		add(lbl4);
	}
	
	public void setRecItem(Order_program o) {
		lbl1.setText(o.getOrder_date()+"");
		lbl2.setText(o.getFlower_code().getFlower_code());
		lbl3.setText(o.getOrder_count()+"");
		lbl4.setText(o.getSale_price()+"");
	}

}
