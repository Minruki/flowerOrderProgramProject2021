package flowerOrderProgramProject.ui.content;


import java.awt.BorderLayout;
import java.awt.Color;
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
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.service.Customer_informationService;
import javax.swing.JList;
import flowerOrderProgramProject.panel.tfOLpanel;


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
	private JLabel lblorder_count;
	private JLabel lblchoice;
	private JLabel backgroundTop;
	private JTextField tfNo;
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
	private JTextField tfresultPrice;
	private tfOLpanel tfOL;
	private JDateChooser dateChooser;
	private Customer_informationService service;
	private JDateChooser dateChooser_1;
	private JList ChoiceList;
	private JButton btnChoose;


	public OrderPage() {
		initialize();
	}
	
	protected void setService() {
		service = new Customer_informationService();
	}
	
	private void initialize() {
		setTitle("Order Program Main");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 300, 900, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 0, 0));
		
		background1 = new JPanel();
		contentPane.add(background1);
		background1.setLayout(new BoxLayout(background1, BoxLayout.X_AXIS));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("c:\\workspace\\FlowerOrderProgramProject\\image\\flower\\IMG_0006.JPG"));
		background1.add(lblNewLabel_1);
		
		listPanel = new JPanel();
		listPanel.setBackground(Color.PINK);
		contentPane.add(listPanel);
		listPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		lblNewLabel_2 = new JLabel("");
		listPanel.add(lblNewLabel_2);
		
		lblono = new JLabel("No.");
		lblono.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblono);
		
		lblorder_number = new JLabel("Order_Number");
		lblorder_number.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_number);
		
		lblorder_date = new JLabel("Order_Date");
		lblorder_date.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_date);
		
		lblid = new JLabel("ID");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblid);
		
		lblflower_code = new JLabel("Flower");
		lblflower_code.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblflower_code);
		
		lblorder_count = new JLabel("Content");
		lblorder_count.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_count);
		
		lblchoice = new JLabel("Choice");
		lblchoice.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblchoice);
		
		lblsale_price = new JLabel("Result_Price");
		lblsale_price.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblsale_price);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.PINK);
		listPanel.add(panel_4);
		
		lblNewLabel_9 = new JLabel("");
		listPanel.add(lblNewLabel_9);
		
		writePanel = new JPanel();
		writePanel.setBackground(Color.PINK);
		contentPane.add(writePanel);
		writePanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		backgroundTop = new JLabel("");
		writePanel.add(backgroundTop);
		
		tfNo = new JTextField();
		writePanel.add(tfNo);
		tfNo.setColumns(10);
		
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
		
		JPanel contentPanel = new JPanel();
		writePanel.add(contentPanel);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		ChoiceList = new JList();
		contentPanel.add(ChoiceList, BorderLayout.NORTH);
		
		gubunPanel = new JPanel();
		gubunPanel.setBackground(Color.PINK);
		writePanel.add(gubunPanel);
		gubunPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		rdbtn01 = new JRadioButton("Bouquet");
		rdbtn01.setBackground(Color.PINK);
		gubunPanel.add(rdbtn01);
		
		rdbtn02 = new JRadioButton("Besket");
		rdbtn02.setBackground(Color.PINK);
		gubunPanel.add(rdbtn02);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn01);
		group.add(rdbtn02);
		
	
		tfresultPrice = new JTextField();
		writePanel.add(tfresultPrice);
		tfresultPrice.setColumns(10);
		
		saveBtnPanel = new JPanel();
		saveBtnPanel.setBackground(Color.PINK);
		writePanel.add(saveBtnPanel);
		
		btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSave(e);
			}
		});
		saveBtnPanel.add(btnSave);
		
		JButton btnNewButton = new JButton("New button");
		saveBtnPanel.add(btnNewButton);
		
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
				frame.setVisible(true);
				frame.setTfOL(tfOL);
				
			}
		});
		btnChoose.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\icon2.png"));
		
		background2 = new JPanel();
		contentPane.add(background2);
		background2.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("");
		background2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("c:\\workspace\\FlowerOrderProgramProject\\image\\flower\\IMG_0006.JPG"));
	}
	
	public void clearTf() {
		tfNo.setText("");
		tfOrderNo.setText("");
		dateChooser.setDate(new Date());
		tfId.setText("");
//		ChoiceList.setListData(new Data());
		tfresultPrice.setText("");

	}
	
	public Order_program getOrder_program() {
		
		//자동생성 번호 tfNo - ?? - 필요없음
		String order_number = tfOrderNo.getText().trim();
		
		// 날짜 선택 - ??
		Date parseDate = setDate();
		Date order_date = parseDate;
		
		String id = tfId.getText().trim();
//		New Data = tfOL.getText().trim();
		//아래 두 코드 한번에 텍스트 필드 출력 가능?
//		String flower_code = tfList.getText().trim();
//		int order_count = tfList.getText().trim();
		//주문 내역 - 꽃 이름(?) : 수량(?) 예)A002(1개)
		//꽃 선택 -?? 선택한 꽃 나오도록, A001 (꽃이름)
	
		//구분 - 라디오 버튼 선택 하나만 하도록/꽃다발은 포장값 5천원 추가, 꽃바구니 1만원 추가 기능 넣기
		//판매가 - 꽃 단가 * 수량 + 추가금액
		
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
	
	public void setOrder_program(Order_program order_program) {
		
	}

	protected void actionPerformedBtnSave(ActionEvent e) {
//		service = new Customer_informationService();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(dateChooser_1.getDate()));
		
	}

	public tfOLpanel getTfOL() {
		return tfOL;
	}

	public void setTfOL(tfOLpanel tfOL) {
		this.tfOL = tfOL;
	}
	
}