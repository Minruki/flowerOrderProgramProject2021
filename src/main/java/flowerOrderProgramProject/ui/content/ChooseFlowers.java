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

import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.panel.tfOLpanel;

public class ChooseFlowers extends JFrame {

	private JPanel contentPane;
	private JCheckBox checkboxRose;
	private JSpinner number_rose;
	private tfOLpanel tfOL;
	
	
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
		initialize();
	}
	private void initialize() {
		setTitle("Choose Flower");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 913, 549);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 5, 10, 20));
		
		JPanel panelRose = new JPanel();
		panelRose.setBackground(Color.WHITE);
		panelRose.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A001(Rose)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelRose);
		panelRose.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRose = new JLabel("");
		lblRose.setHorizontalAlignment(SwingConstants.LEFT);
		lblRose.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\장미9.jpg"));
		panelRose.add(lblRose);
		
		checkboxRose = new JCheckBox("장미");
		checkboxRose.setVerticalAlignment(SwingConstants.BOTTOM);
		checkboxRose.setBackground(Color.WHITE);
		panelRose.add(checkboxRose);
		
		number_rose = new JSpinner();
		panelRose.add(number_rose);
		
		JPanel panelRanun = new JPanel();
		panelRanun.setBackground(Color.WHITE);
		panelRanun.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A002(Ranunculus)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelRanun);
		
		JLabel lblRanun = new JLabel("");
		lblRanun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\라넌큘러스3.jpg"));
		lblRanun.setHorizontalAlignment(SwingConstants.LEFT);
		panelRanun.add(lblRanun);
		
		JCheckBox checkboxRanun = new JCheckBox("라넌큘러스");
		checkboxRose.setBackground(new Color(255, 240, 245));
		panelRanun.add(checkboxRanun);
		
		JSpinner number_ranun = new JSpinner();
		panelRanun.add(number_ranun);
		
		JPanel panelLily = new JPanel();
		panelLily.setBackground(Color.WHITE);
		panelLily.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A003(Lily)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelLily);
		
		JLabel lblLily = new JLabel("");
		lblLily.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\백합3.jpg"));
		lblLily.setHorizontalAlignment(SwingConstants.LEFT);
		panelLily.add(lblLily);
		
		JCheckBox checkbox3 = new JCheckBox("백합");
		panelLily.add(checkbox3);
		
		JSpinner number_lily = new JSpinner();
		panelLily.add(number_lily);
		
		JPanel panelTulip = new JPanel();
		panelTulip.setBackground(Color.WHITE);
		panelTulip.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A004(Tulip)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelTulip);
		
		JLabel lblTulip = new JLabel("");
		lblTulip.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\튤립3.jpg"));
		lblTulip.setHorizontalAlignment(SwingConstants.LEFT);
		panelTulip.add(lblTulip);
		
		JCheckBox checkboxTulip = new JCheckBox("튤립");
		checkboxTulip.setBackground(new Color(255, 240, 245));
		panelTulip.add(checkboxTulip);
		
		JSpinner numberTulip = new JSpinner();
		panelTulip.add(numberTulip);
		
		JPanel panelSun = new JPanel();
		panelSun.setBackground(Color.WHITE);
		panelSun.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A005(Sunflower)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelSun);
		
		JLabel lblSun = new JLabel("");
		lblSun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\해바라기3.jpg"));
		lblSun.setHorizontalAlignment(SwingConstants.LEFT);
		panelSun.add(lblSun);
		
		JCheckBox checkboxSun = new JCheckBox("해바라기");
		checkboxSun.setBackground(new Color(255, 240, 245));
		panelSun.add(checkboxSun);
		
		JSpinner numberSun = new JSpinner();
		panelSun.add(numberSun);
		
		JPanel panelPeony = new JPanel();
		panelPeony.setBackground(Color.WHITE);
		panelPeony.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A006(Peony)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelPeony);
		
		JLabel lblPeony = new JLabel("");
		lblPeony.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\피오니4.jpg"));
		lblPeony.setHorizontalAlignment(SwingConstants.LEFT);
		panelPeony.add(lblPeony);
		
		JCheckBox checkboxPeony = new JCheckBox("피오니");
		checkboxPeony.setBackground(new Color(255, 240, 245));
		panelPeony.add(checkboxPeony);
		
		JSpinner numberPeony = new JSpinner();
		panelPeony.add(numberPeony);
		
		JPanel panelFre = new JPanel();
		panelFre.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A007(Freesia)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelFre.setBackground(Color.WHITE);
		contentPane.add(panelFre);
		
		JLabel lblFre = new JLabel("");
		lblFre.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\프리지아5.jpg"));
		lblFre.setHorizontalAlignment(SwingConstants.LEFT);
		panelFre.add(lblFre);
		
		JCheckBox checkboxFre = new JCheckBox("프리지아");
		checkboxFre.setBackground(new Color(255, 240, 245));
		panelFre.add(checkboxFre);
		
		JSpinner numberFre = new JSpinner();
		panelFre.add(numberFre);
		
		JPanel panelCarna = new JPanel();
		panelCarna.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A008(Carnation)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCarna.setBackground(Color.WHITE);
		contentPane.add(panelCarna);
		
		JLabel lblCarna = new JLabel("");
		lblCarna.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\카네이션3.jpg"));
		lblCarna.setHorizontalAlignment(SwingConstants.LEFT);
		panelCarna.add(lblCarna);
		
		JCheckBox checkboxCarna = new JCheckBox("카네이션");
		checkboxCarna.setBackground(new Color(255, 240, 245));
		panelCarna.add(checkboxCarna);
		
		JSpinner numberCarna = new JSpinner();
		panelCarna.add(numberCarna);
		
		JPanel panelGyps = new JPanel();
		panelGyps.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A009(Gypsophila)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelGyps.setBackground(Color.WHITE);
		contentPane.add(panelGyps);
		
		JLabel lblGyps = new JLabel("");
		lblGyps.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\안개꽃5.jpg"));
		lblGyps.setHorizontalAlignment(SwingConstants.LEFT);
		panelGyps.add(lblGyps);
		
		JCheckBox checkGyps = new JCheckBox("안개꽃");
		checkGyps.setBackground(new Color(255, 240, 245));
		panelGyps.add(checkGyps);
		
		JSpinner numberGyps = new JSpinner();
		panelGyps.add(numberGyps);
		
		JPanel panelButton = new JPanel();
		panelButton.setBackground(Color.PINK);
		contentPane.add(panelButton);
		panelButton.setLayout(null);
		
		JButton btnBakset = new JButton("");
		btnBakset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(getOrder());
				
				tfOL.getTextField().setText(getOrder()+"");
			}
		});
		
		btnBakset.setBackground(new Color(255, 255, 255));
		btnBakset.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\button2.jpg"));
		btnBakset.setBounds(28, 117, 129, 113);
		panelButton.add(btnBakset);
	}
	
	public Order_program getOrder() {
		
		String flower_code = null;
		if(checkboxRose.getText().equals("장미")) {
			flower_code = "A001";
		}
		int order_count = Integer.parseInt(number_rose.getValue()+"");
		
		return new Order_program(new Flower_information(flower_code),order_count);
	}
	
	public void setTfOL(tfOLpanel tfOL) {
		this.tfOL = tfOL;
	}
}