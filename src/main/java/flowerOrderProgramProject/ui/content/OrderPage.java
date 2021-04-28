package flowerOrderProgramProject.ui.content;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.service.Customer_informationService;
import flowerOrderProgramProject.service.Order_ProgramService;
import flowerOrderProgramProject.ui.FlowerFrm;

import javax.swing.JList;
import javax.swing.JOptionPane;

import flowerOrderProgramProject.panel.tfOLpanel;
import flowerOrderProgramProject.panel.resultPricepanel;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.SystemColor;
import java.awt.Font;


@SuppressWarnings("serial")
public class OrderPage extends JFrame {

	private JPanel contentPane;
	private JPanel background1;
	private JPanel listPanel;
	private JPanel writePanel;
	private JPanel panel3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblono;
	private JLabel lblorder_number;
	private JLabel lblorder_date;
	private JLabel lblid;
	private JLabel lblflower_code;
	private JLabel lblsale_price;
	private JLabel lblNewLabel_9;
	private JLabel lblchoice;
	private JButton tfNo;
	private JTextField tfOrderNo;
	private JLabel backgroundBottom;
	private JPanel gubunPanel;
	private JRadioButton rdbtn01;
	private JRadioButton rdbtn02;
	private JPanel orderList;
	private JPanel flowerChoice;
	private JTextField tfId;
	private JPanel background2;
	private JPanel panel_4;
	private JPanel saveBtnPanel;
	private JButton btnSave;
	
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private JButton btnChoose;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	
	private resultPricepanel resultPricePanel;
	private tfOLpanel tfOL;
 
	private Customer_informationService cService;
	private Order_ProgramService oService;
	
	
	private boolean isBtn01;
	private boolean isBtn02;
	private JPanel panel;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;
	private FlowerFrm flowerFrm;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPage frame = new OrderPage();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public OrderPage() {
		
		cService = new Customer_informationService();
		oService = new Order_ProgramService();
		initialize();
	}
	
	protected void setService() {
		cService = new Customer_informationService();
	}
	
	private void initialize() { 
		setTitle("Order Program Main");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(300, 300, 865, 503);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 0, 0));
		
		background1 = new JPanel();
		contentPane.add(background1);
		background1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 496, 464);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\flower\\IMG_0006.JPG"));
		background1.add(lblNewLabel_1);
		
		listPanel = new JPanel(); 
		listPanel.setBackground(Color.PINK);
		contentPane.add(listPanel);
		listPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		lblNewLabel_2 = new JLabel("");
		listPanel.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("");
		listPanel.add(lblNewLabel_4);
		
		lblorder_number = new JLabel("º 주문번호 : ");
		lblorder_number.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_number);
		
		lblorder_date = new JLabel("º 주문날짜 : ");
		lblorder_date.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_date);
		
		lblid = new JLabel("º 회원 ID : ");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblid);
		
		lblflower_code = new JLabel("º 꽃 선택 : ");
		lblflower_code.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblflower_code);
		
		lblchoice = new JLabel("º 구분 : ");
		lblchoice.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblchoice);
		
		lblsale_price = new JLabel("º 구매금액 : ");
		lblsale_price.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblsale_price);
		
		lblono = new JLabel("");
		lblono.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblono);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.PINK);
		listPanel.add(panel_4);
		
		lblNewLabel_9 = new JLabel("");
		listPanel.add(lblNewLabel_9);
		
		writePanel = new JPanel();
		writePanel.setBackground(Color.PINK);
		contentPane.add(writePanel);
		writePanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		lblNewLabel_3 = new JLabel("");
		writePanel.add(lblNewLabel_3);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		writePanel.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		lblNewLabel_6 = new JLabel("");
		panel.add(lblNewLabel_6);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton(arg0);
				
				dispose();
			}
		});
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\returnicon2.jpg"));
		panel.add(btnNewButton);
		
		lblNewLabel_7 = new JLabel("");
		panel.add(lblNewLabel_7);
		
		tfOrderNo = new JTextField();
		writePanel.add(tfOrderNo);
		tfOrderNo.setColumns(10);
		
		dateChooser_1 = new JDateChooser();
		writePanel.add(dateChooser_1);
		
		flowerChoice = new JPanel();
		writePanel.add(flowerChoice);
		flowerChoice.setLayout(new BoxLayout(flowerChoice, BoxLayout.X_AXIS));
		
		tfId = new JTextField();
		flowerChoice.add(tfId);
		tfId.setColumns(10);
		
		orderList = new JPanel();
		writePanel.add(orderList);
		orderList.setLayout(new BoxLayout(orderList, BoxLayout.X_AXIS));
		
		tfOL = new tfOLpanel();
		orderList.add(tfOL);
		
		gubunPanel = new JPanel();
		gubunPanel.setBackground(Color.PINK);
		writePanel.add(gubunPanel);
		gubunPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		rdbtn01 = new JRadioButton("Bouquet");
		rdbtn01.setFont(new Font("Gabriola", Font.PLAIN, 17));
		rdbtn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedRdbtn01(e);
			}
		});
		rdbtn01.setBackground(Color.PINK);
		gubunPanel.add(rdbtn01);
		
		rdbtn02 = new JRadioButton("Besket");
		rdbtn02.setFont(new Font("Gabriola", Font.PLAIN, 17));
		rdbtn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedRdbtn02(e);
			}
		});
		rdbtn02.setBackground(Color.PINK);
		gubunPanel.add(rdbtn02);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn01);
		group.add(rdbtn02);
		
	
		resultPricePanel = new resultPricepanel();
		writePanel.add(resultPricePanel);
		
		tfNo = new JButton();
		tfNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reciept frame = new Reciept();
				frame.setResizable(false);
				actionPerformedTfNo(e);
			}
		});
		tfNo.setHorizontalAlignment(SwingConstants.CENTER);
		tfNo.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\reciept1.jpg"));
		writePanel.add(tfNo);
		
		saveBtnPanel = new JPanel();
		saveBtnPanel.setBackground(Color.PINK);
		writePanel.add(saveBtnPanel);
		
		btnSave = new JButton("");
		btnSave.setBounds(38, 5, 99, 25);
		btnSave.setBackground(SystemColor.controlHighlight);
		btnSave.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSave.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\saveicon1.jpg"));
		btnSave.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSave(e);
				JOptionPane.showMessageDialog(null, "Thank you for Order :) ");
			}
		});
		saveBtnPanel.setLayout(null);
		saveBtnPanel.add(btnSave);
		
		backgroundBottom = new JLabel("");
		writePanel.add(backgroundBottom);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.PINK);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		btnChoose = new JButton("");
		btnChoose.setBounds(0, 214, 47, 32);
		panel3.add(btnChoose);
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseFlowers frame = new ChooseFlowers();
				frame.setResizable(false);
				frame.setVisible(true);
				frame.setTfOL(tfOL);
				frame.setRPP(resultPricePanel);
			}
		});
		btnChoose.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\flower\\icon2.png"));
		
		background2 = new JPanel();
		contentPane.add(background2);
		background2.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-327, 0, 496, 464);
		background2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\flower\\IMG_0006.JPG"));
	}
	
	public void clearTf() {
		tfNo.setText("");
		tfOrderNo.setText("");
		dateChooser.setDate(new Date());
		tfId.setText("");
//		ChoiceList.setListData(new Data());
		resultPricePanel.getTfResultPrice().setText("");

	}
	
	public Order_program getOrder_program() {
		
		//자동생성 번호 tfNo - ?? - 필요없음
		String order_number = tfOrderNo.getText().trim();
		
		// 날짜 선택 - ??
		Date parseDate = setDate();
		Date order_date = parseDate;
		
		String id = tfId.getText().trim();
//		New Data = tfOL.getText().trim();

//		String flower_code = tfList.getText().trim();
//		int order_count = tfList.getText().trim();
		int sale_price = 0;
		//구분 - 꽃다발은 포장값 5천원 추가, 꽃바구니 1만원 추가 기능 넣기
		//판매가 - 꽃 단가 * 수량 + 추가금액
		if(rdbtn01.getText().equals("Bouquet")) {
			sale_price = Integer.parseInt((resultPricePanel.getTfResultPrice().getText()));
			sale_price += 5000;
		}else if(rdbtn02.getText().equals("Besket")){
			sale_price += 10000;
		};
//		return new Order_program(order_number, order_date, id, flower_code, order_count, choice, sale_price);
		return null;
	}

	
	
	private Date setDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = null;
		Date order_date1 = dateChooser_1.getDate();
		String modiDate = sdf.format(order_date1);
		try {
			parseDate = sdf.parse(modiDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parseDate;
	}
	

	protected void actionPerformedBtnSave(ActionEvent e) {
//		service = new Customer_informationService();
//		oService.addOrder_program(getOrder_program());
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(sdf.format(dateChooser_1.getDate()));
//		System.out.println(on);
//		System.out.println(on.substring(0, on.indexOf(" ")));
//		System.out.println(on.substring(on.indexOf(",")+1));
//		System.out.printf("%s, %tF, %s, %s, %s, %s, %d", order_number, date, id, flower_code, order_count, choice, price);
//		
		String order_number = tfOrderNo.getText().trim();
		Date date = dateChooser_1.getDate();
		String id = tfId.getText().trim();
		String on = tfOL.getTextField().getText();
		
		String flower_code = on.substring(0, on.indexOf(" "));
		
		int order_count = Integer.parseInt((on.substring(on.indexOf(",")+1,on.lastIndexOf(","))));
		
		String choice = null;
		if(rdbtn01.isSelected()) {
			choice = "꽃다발";
		} else {
			choice = "꽃바구니";
		}
		
		int price = Integer.parseInt(resultPricePanel.getTfResultPrice().getText().trim());
		
		oService.addOrder_program(new Order_program(order_number, date,new Customer_information(id), new Flower_information(flower_code), order_count, choice, price));
		
		Customer_information cInformation = new Customer_information(id,price);
		cService.cumulativeCustomer_information(cInformation);
	}

	public tfOLpanel getTfOL() {
		return tfOL;
	}

	public void setTfOL(tfOLpanel tfOL) {
		this.tfOL = tfOL;
	}
	
	protected void actionPerformedRdbtn01(ActionEvent e) {
		if(isBtn01 == false) {
			isBtn01 = true;
			resultPricePanel.getTfResultPrice().setText((Integer.parseInt(resultPricePanel.getTfResultPrice().getText())+5000)+"");
		}else {
			isBtn01 = false;
			resultPricePanel.getTfResultPrice().setText((Integer.parseInt(resultPricePanel.getTfResultPrice().getText())-5000)+"");
		}
	}
	protected void actionPerformedRdbtn02(ActionEvent e) {
		if(isBtn02 == false) {
			isBtn02 = true;
			resultPricePanel.getTfResultPrice().setText((Integer.parseInt(resultPricePanel.getTfResultPrice().getText())+10000)+"");
		}else {
			isBtn02 = false;
			resultPricePanel.getTfResultPrice().setText((Integer.parseInt(resultPricePanel.getTfResultPrice().getText())-10000)+"");
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		this.flowerFrm = new FlowerFrm();
		
	}
	
	protected void actionPerformedTfNo(ActionEvent e) {
		Reciept frame = new Reciept();
		frame.getPanel_1().setRecItem(getReceipt());
		frame.setVisible(true);
	}

	private Order_program getReceipt() {
		Order_program op = new Order_program();
		op.setOrder_date(dateChooser_1.getDate());
		op.setId(new Customer_information(tfId.getText()));
		op.setFlower_code(new Flower_information(tfOL.getTextField().getText().substring(0, tfOL.getTextField().getText().indexOf(",")-2)));
		op.setOrder_count(Integer.parseInt(tfOL.getTextField().getText().substring(tfOL.getTextField().getText().lastIndexOf(",")-1, tfOL.getTextField().getText().lastIndexOf(","))));
		op.setSale_price(Integer.parseInt(resultPricePanel.getTfResultPrice().getText()));
		if(rdbtn01.isSelected() == true) {
			op.setChoice(rdbtn01.getText());
		}else if(rdbtn02.isSelected() == true) {
			op.setChoice(rdbtn02.getText());
		}else {
			JOptionPane.showMessageDialog(null, "선택해주세요");
		}
		
		
		return op;
	}
}