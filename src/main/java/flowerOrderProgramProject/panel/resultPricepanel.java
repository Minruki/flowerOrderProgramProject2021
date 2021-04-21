package flowerOrderProgramProject.panel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class resultPricepanel extends JPanel {
	private JTextField tfResultPrice;

	public resultPricepanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		tfResultPrice = new JTextField();
		add(tfResultPrice);
		tfResultPrice.setColumns(10);
	}
	public JTextField getTfResultPrice() {
		return tfResultPrice;
	}
	public void setTfResultPrice(JTextField tfResultPrice) {
		this.tfResultPrice = tfResultPrice;
	}

}
