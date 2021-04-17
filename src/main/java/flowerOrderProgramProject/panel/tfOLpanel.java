package flowerOrderProgramProject.panel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class tfOLpanel extends JPanel {
	private JTextField textField;

	public tfOLpanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
	}
	public JTextField getTextField() {
		return textField;
	}
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

}
