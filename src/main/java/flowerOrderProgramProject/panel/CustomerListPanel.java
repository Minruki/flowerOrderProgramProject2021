package flowerOrderProgramProject.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class CustomerListPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CustomerListPanel() {
		setLayout(new BorderLayout(0, 0)); 
		
		JPanel panel = new JPanel();
		add(panel);
		
		table = new JTable();
		panel.add(table);

	}

}
