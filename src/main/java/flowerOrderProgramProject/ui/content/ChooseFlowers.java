package flowerOrderProgramProject.ui.content;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
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
import flowerOrderProgramProject.panel.resultPricepanel;
import flowerOrderProgramProject.panel.tfOLpanel;
import flowerOrderProgramProject.service.Flower_informationService;

@SuppressWarnings("serial")
public class ChooseFlowers extends JFrame {

	private JPanel contentPane;
	
	private JCheckBox checkboxRose;
	private JCheckBox checkboxRanun;
	private JCheckBox checkboxLily;
	
	private tfOLpanel tfOL;
	private resultPricepanel rPP;
	private Flower_informationService fService;
	private JCheckBox checkboxTulip;
	private JSpinner number_tulip;
	private JCheckBox checkboxSun;
	private JCheckBox checkboxPeony;
	private JCheckBox checkboxFre;
	private JCheckBox checkboxCarna;
	private JCheckBox checkboxGyps;




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


	public ChooseFlowers() {
		fService = new Flower_informationService();
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
		
		JPanel panelRanun = new JPanel();
		panelRanun.setBackground(Color.WHITE);
		panelRanun.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A002(Ranunculus)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelRanun);
		
		JLabel lblRanun = new JLabel("");
		lblRanun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\라넌큘러스3.jpg"));
		lblRanun.setHorizontalAlignment(SwingConstants.LEFT);
		panelRanun.add(lblRanun);
		
		checkboxRanun = new JCheckBox("라넌큘러스");
		checkboxRose.setBackground(new Color(255, 240, 245));
		panelRanun.add(checkboxRanun);
		
		JPanel panelLily = new JPanel();
		panelLily.setBackground(Color.WHITE);
		panelLily.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A003(Lily)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelLily);
		
		JLabel lblLily = new JLabel("");
		lblLily.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\백합3.jpg"));
		lblLily.setHorizontalAlignment(SwingConstants.LEFT);
		panelLily.add(lblLily);
		
		checkboxLily = new JCheckBox("백합");
		panelLily.add(checkboxLily);
		
		JPanel panelTulip = new JPanel();
		panelTulip.setBackground(Color.WHITE);
		panelTulip.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A004(Tulip)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelTulip);
		
		JLabel lblTulip = new JLabel("");
		lblTulip.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\튤립3.jpg"));
		lblTulip.setHorizontalAlignment(SwingConstants.LEFT);
		panelTulip.add(lblTulip);
		
		checkboxTulip = new JCheckBox("튤립");
		checkboxTulip.setBackground(new Color(255, 240, 245));
		panelTulip.add(checkboxTulip);
		
		JPanel panelSun = new JPanel();
		panelSun.setBackground(Color.WHITE);
		panelSun.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A005(Sunflower)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelSun);
		
		JLabel lblSun = new JLabel("");
		lblSun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\해바라기3.jpg"));
		lblSun.setHorizontalAlignment(SwingConstants.LEFT);
		panelSun.add(lblSun);
		
		checkboxSun = new JCheckBox("해바라기");
		checkboxSun.setBackground(new Color(255, 240, 245));
		panelSun.add(checkboxSun);
		
		JPanel panelPeony = new JPanel();
		panelPeony.setBackground(Color.WHITE);
		panelPeony.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A006(Peony)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelPeony);
		
		JLabel lblPeony = new JLabel("");
		lblPeony.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\피오니4.jpg"));
		lblPeony.setHorizontalAlignment(SwingConstants.LEFT);
		panelPeony.add(lblPeony);
		
		checkboxPeony = new JCheckBox("피오니");
		checkboxPeony.setBackground(new Color(255, 240, 245));
		panelPeony.add(checkboxPeony);
		
		JPanel panelFre = new JPanel();
		panelFre.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A007(Freesia)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelFre.setBackground(Color.WHITE);
		contentPane.add(panelFre);
		
		JLabel lblFre = new JLabel("");
		lblFre.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\프리지아5.jpg"));
		lblFre.setHorizontalAlignment(SwingConstants.LEFT);
		panelFre.add(lblFre);
		
		checkboxFre = new JCheckBox("프리지아");
		checkboxFre.setBackground(new Color(255, 240, 245));
		panelFre.add(checkboxFre);
		
		JPanel panelCarna = new JPanel();
		panelCarna.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A008(Carnation)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCarna.setBackground(Color.WHITE);
		contentPane.add(panelCarna);
		
		JLabel lblCarna = new JLabel("");
		lblCarna.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\카네이션3.jpg"));
		lblCarna.setHorizontalAlignment(SwingConstants.LEFT);
		panelCarna.add(lblCarna);
		
		checkboxCarna = new JCheckBox("카네이션");
		checkboxCarna.setBackground(new Color(255, 240, 245));
		panelCarna.add(checkboxCarna);
		
		JPanel panelGyps = new JPanel();
		panelGyps.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "A009(Gypsophila)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelGyps.setBackground(Color.WHITE);
		contentPane.add(panelGyps);
		
		JLabel lblGyps = new JLabel("");
		lblGyps.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\안개꽃5.jpg"));
		lblGyps.setHorizontalAlignment(SwingConstants.LEFT);
		panelGyps.add(lblGyps);
		
		checkboxGyps = new JCheckBox("안개꽃");
		checkboxGyps.setBackground(new Color(255, 240, 245));
		panelGyps.add(checkboxGyps);
		
		JPanel panelButton = new JPanel();
		panelButton.setBackground(Color.PINK);
		contentPane.add(panelButton);
		panelButton.setLayout(null);
		
		JButton btnBakset = new JButton("");
		btnBakset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println(getOrder());
	
								
				tfOL.getTextField().setText(getOrder()+"");
		
				//가격 뜨게 하기
				String flower_code = null;
				if(checkboxRose.isSelected() == true) {
					flower_code = "A001";
				}
				else if(checkboxRanun.isSelected() == true){
					flower_code = "A002";
				}
				else if(checkboxLily.isSelected() == true) {
					flower_code = "A003";
				}
				else if(checkboxTulip.isSelected() == true) {
					flower_code = "A004";
				}
				else if(checkboxSun.isSelected() == true) {
					flower_code = "A005";
				}
				else if(checkboxPeony.isSelected() == true) {
					flower_code = "A006";
				}
				else if(checkboxFre.isSelected() == true) {
					flower_code = "A007";
				}
				else if(checkboxCarna.isSelected() == true) {
					flower_code = "A008";
				}
				else if(checkboxGyps.isSelected() == true) {
					flower_code = "A009";
				}
				
				
				int order_count = 0;
				
				if(!number_tulip.getValue().equals("0")) {
					order_count = Integer.parseInt(number_tulip.getValue()+"");
				}
				
				
				
				Flower_information flowerPrice = fService.showFlowerPriceByCode(new Flower_information(flower_code));
				
				String fmflowerPrice = flowerPrice+"";
				int resultPrice = order_count*Integer.parseInt((fmflowerPrice.substring(2)+""));
				rPP.getTfResultPrice().setText(resultPrice+"");
				dispose();
			}
		});
		
		btnBakset.setBackground(new Color(255, 255, 255));
		btnBakset.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\button2.jpg"));
		btnBakset.setBounds(64, 152, 93, 78);
		panelButton.add(btnBakset);
		
		number_tulip = new JSpinner();
		number_tulip.setBounds(64, 96, 93, 46);
		panelButton.add(number_tulip);
	}
	
	public Order_program getOrder() {
		
		String flower_code = null;
		if(checkboxRose.isSelected() == true) {
			flower_code = "A001";
		}
		if(checkboxRanun.isSelected() == true) {
				
				flower_code="A002";
		}
		if(checkboxLily.isSelected() == true) {
			
				flower_code="A003";
		}
		if(checkboxTulip.isSelected() == true) {
			
			flower_code="A004";
		}
		if(checkboxSun.isSelected() == true) {
			
			flower_code="A005";
		}
		if(checkboxPeony.isSelected() == true) {
			
			flower_code="A006";
		}
		if(checkboxFre.isSelected() == true) {
			
			flower_code="A007";
		}
		if(checkboxCarna.isSelected() == true) {
			
			flower_code="A008";
		}
		if(checkboxGyps.isSelected() == true) {
			
			flower_code="A009";
		}
		
		
		int order_count = 0;
		
		
		if(!number_tulip.getValue().equals("0")) {
			order_count = Integer.parseInt(number_tulip.getValue()+"");
		}
		
		return new Order_program(new Flower_information(flower_code), order_count);
			
		}
	
	public void setTfOL(tfOLpanel tfOL) {
		this.tfOL = tfOL;
	}
	
	public void setRPP(resultPricepanel rPP) {
		this.rPP = rPP;
	}
}
		