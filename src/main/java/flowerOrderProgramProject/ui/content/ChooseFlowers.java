package flowerOrderProgramProject.ui.content;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ChooseFlowers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseFlowers frame = new ChooseFlowers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChooseFlowers() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 913, 549);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 5, 10, 20));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A001(Rose)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel1);
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRose = new JLabel("");
		lblRose.setHorizontalAlignment(SwingConstants.LEFT);
		lblRose.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\장미9.jpg"));
		panel1.add(lblRose);
		
		JCheckBox checkbox1 = new JCheckBox("장미");
		checkbox1.setVerticalAlignment(SwingConstants.BOTTOM);
		checkbox1.setBackground(Color.WHITE);
		panel1.add(checkbox1);
		
		JSpinner number1 = new JSpinner();
		panel1.add(number1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A002(Ranunculus)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel2);
		
		JLabel lblRanun = new JLabel("");
		lblRanun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\라넌큘러스3.jpg"));
		lblRanun.setHorizontalAlignment(SwingConstants.LEFT);
		panel2.add(lblRanun);
		
		JCheckBox checkbox2 = new JCheckBox("라넌큘러스");
		checkbox1.setBackground(new Color(255, 240, 245));
		panel2.add(checkbox2);
		
		JSpinner number2 = new JSpinner();
		panel2.add(number2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		panel3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A003(Lily)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel3);
		
		JLabel lblBaby = new JLabel("");
		lblBaby.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\백합3.jpg"));
		lblBaby.setHorizontalAlignment(SwingConstants.LEFT);
		panel3.add(lblBaby);
		
		JCheckBox checkbox3 = new JCheckBox("백합");
		panel3.add(checkbox3);
		
		JSpinner number3 = new JSpinner();
		panel3.add(number3);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		panel4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A004(Tulip)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel4);
		
		JLabel lblTulip = new JLabel("");
		lblTulip.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\튤립3.jpg"));
		lblTulip.setHorizontalAlignment(SwingConstants.LEFT);
		panel4.add(lblTulip);
		
		JCheckBox checkbox4 = new JCheckBox("튤립");
		checkbox4.setBackground(new Color(255, 240, 245));
		panel4.add(checkbox4);
		
		JSpinner number4 = new JSpinner();
		panel4.add(number4);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.WHITE);
		panel5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A005(Sunflower)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel5);
		
		JLabel lblSun = new JLabel("");
		lblSun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\해바라기3.jpg"));
		lblSun.setHorizontalAlignment(SwingConstants.LEFT);
		panel5.add(lblSun);
		
		JCheckBox checkbox5 = new JCheckBox("해바라기");
		checkbox5.setBackground(new Color(255, 240, 245));
		panel5.add(checkbox5);
		
		JSpinner number5 = new JSpinner();
		panel5.add(number5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.WHITE);
		panel6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A006(Peony)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel6);
		
		JLabel lblPeony = new JLabel("");
		lblPeony.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\피오니4.jpg"));
		lblPeony.setHorizontalAlignment(SwingConstants.LEFT);
		panel6.add(lblPeony);
		
		JCheckBox checkbox6 = new JCheckBox("피오니");
		checkbox6.setBackground(new Color(255, 240, 245));
		panel6.add(checkbox6);
		
		JSpinner number6 = new JSpinner();
		panel6.add(number6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A007(Freesia)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\프리지아5.jpg"));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);
		
		JCheckBox chckbxYellowColor = new JCheckBox("프리지아");
		chckbxYellowColor.setBackground(new Color(255, 240, 245));
		panel.add(chckbxYellowColor);
		
		JSpinner spinner = new JSpinner();
		panel.add(spinner);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A008(Carnation)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\카네이션3.jpg"));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(label_1);
		
		JCheckBox chckbxRedColor = new JCheckBox("카네이션");
		chckbxRedColor.setBackground(new Color(255, 240, 245));
		panel_1.add(chckbxRedColor);
		
		JSpinner spinner_1 = new JSpinner();
		panel_1.add(spinner_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A009(Gypsophila)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\안개꽃5.jpg"));
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(label_2);
		
		JCheckBox chckbxWhiteColor = new JCheckBox("안개꽃");
		chckbxWhiteColor.setBackground(new Color(255, 240, 245));
		panel_2.add(chckbxWhiteColor);
		
		JSpinner spinner_2 = new JSpinner();
		panel_2.add(spinner_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\button2.jpg"));
		btnNewButton.setBounds(28, 117, 129, 113);
		panel_3.add(btnNewButton);
	}
}