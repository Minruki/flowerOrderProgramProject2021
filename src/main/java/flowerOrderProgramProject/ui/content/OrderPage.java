package flowerOrderProgramProject.ui.content;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

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
	private JRadioButton rdbtnNewRadioButton_1;
	private JPanel orderList;
	private JPanel flowerChoice;
	private JTextField textField_2;
	private JPanel background2;
	private JPanel panel_4;
	private JPanel saveBtnPanel;
	private JButton btnSave;
	private JTextField resultPrice;
	private JList list;
	private JPanel panel;
	private JTextField textField;


	public OrderPage() {
		initialize();
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
		
		lblorder_number = new JLabel("주문번호");
		lblorder_number.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_number);
		
		lblorder_date = new JLabel("주문날짜");
		lblorder_date.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_date);
		
		lblid = new JLabel("회원ID");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblid);
		
		lblflower_code = new JLabel("꽃 선택");
		lblflower_code.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblflower_code);
		
		lblorder_count = new JLabel("주문내역");
		lblorder_count.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblorder_count);
		
		lblchoice = new JLabel("구분");
		lblchoice.setHorizontalAlignment(SwingConstants.RIGHT);
		listPanel.add(lblchoice);
		
		lblsale_price = new JLabel("판매가");
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
		
		JDateChooser dateChooser = new JDateChooser();
		writePanel.add(dateChooser);
		
		flowerChoice = new JPanel();
		writePanel.add(flowerChoice);
		flowerChoice.setLayout(new BoxLayout(flowerChoice, BoxLayout.X_AXIS));
		
		textField_2 = new JTextField();
		flowerChoice.add(textField_2);
		textField_2.setColumns(10);
		
		orderList = new JPanel();
		writePanel.add(orderList);
		orderList.setLayout(new BoxLayout(orderList, BoxLayout.X_AXIS));
		
		list = new JList();
		orderList.add(list);
		
		textField = new JTextField();
		orderList.add(textField);
		textField.setColumns(10);
		
		panel = new JPanel();
		writePanel.add(panel);
		
		gubunPanel = new JPanel();
		gubunPanel.setBackground(Color.PINK);
		writePanel.add(gubunPanel);
		gubunPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		rdbtn01 = new JRadioButton("꽃다발");
		rdbtn01.setBackground(Color.PINK);
		gubunPanel.add(rdbtn01);
		
		rdbtnNewRadioButton_1 = new JRadioButton("꽃바구니");
		rdbtnNewRadioButton_1.setBackground(Color.PINK);
		gubunPanel.add(rdbtnNewRadioButton_1);
		
		resultPrice = new JTextField();
		writePanel.add(resultPrice);
		resultPrice.setColumns(10);
		
		saveBtnPanel = new JPanel();
		saveBtnPanel.setBackground(Color.PINK);
		writePanel.add(saveBtnPanel);
		
		btnSave = new JButton("SAVE");
		saveBtnPanel.add(btnSave);
		
		backgroundBottom = new JLabel("");
		writePanel.add(backgroundBottom);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.PINK);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JButton btnChoose = new JButton("");
		btnChoose.setBounds(0, 214, 47, 32);
		panel3.add(btnChoose);
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChooseFlowers frame = new ChooseFlowers();
				frame.setVisible(true);
				
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
}