package flowerOrderProgramProject.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

public class BackgroundPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BackgroundPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\3d-render-cherry-blossom-bokeh-lights-background_1048-6029.jpg"));
		add(lblNewLabel);
	}

}
