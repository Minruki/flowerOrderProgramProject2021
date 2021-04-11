package flowerOrderProgramProject.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.PanelUI;

import flowerOrderProgramProject.dto.Flower_information;

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




}
