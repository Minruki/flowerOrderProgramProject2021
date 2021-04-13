package flowerOrderProgramProject.panel;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.exception.InvalidCheckException;

@SuppressWarnings("serial")
public class Flowerpricelist extends JPanel {
	private JTextField tfFlowerCode;
	private JTextField tfFlowerName;
	private JTextField tfFlowerPrice;

	/**
	 * Create the panel.
	 */
	public Flowerpricelist() {
		setBorder(new TitledBorder(null, "Flower Add", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 20));
		
		JLabel lblNewLabel = new JLabel("꽃 코드(flower code)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel);
		
		tfFlowerCode = new JTextField();
		add(tfFlowerCode);
		tfFlowerCode.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("꽃 이름(flower name)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel_1);
		
		tfFlowerName = new JTextField();
		add(tfFlowerName);
		tfFlowerName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("가격(flower price)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel_2);
		
		tfFlowerPrice = new JTextField();
		add(tfFlowerPrice);
		tfFlowerPrice.setColumns(10);

	}
	
	public void clearTf() {
		tfFlowerCode.setText("");
		tfFlowerName.setText("");
		tfFlowerPrice.setText("");
		
		if (!tfFlowerCode.isEditable()) {
			tfFlowerCode.setEditable(true);
		}
	}

	public void setItem(Flower_information item) {
		tfFlowerCode.setText(String.valueOf(item.getFlower_code()));
		tfFlowerName.setText(item.getFlower_name());
		tfFlowerPrice.setText(item.getFlower_price() + "");
		
		tfFlowerCode.setEditable(false);
	}
	
	public Flower_information getItem() {
		validCheck();
		String FlowerCode = tfFlowerCode.getText().trim();
		String FlowerName = tfFlowerName.getText().trim();
		int FlowerPrice = Integer.parseInt(tfFlowerPrice.getText().trim());
		
		return new Flower_information(FlowerCode, FlowerName, FlowerPrice);
		
	}

	private void validCheck() {
		if (tfFlowerCode.getText().contentEquals("") 
				|| tfFlowerName.getText().equals("")
				|| tfFlowerPrice.getText().equals("")) {
			throw new InvalidCheckException();
		}		
		
	}


}
