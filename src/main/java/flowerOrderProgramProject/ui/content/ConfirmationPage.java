package flowerOrderProgramProject.ui.content;

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.panel.ConfirmPanel;
import flowerOrderProgramProject.service.Order_ProgramService;
import flowerOrderProgramProject.ui.FlowerFrm;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ConfirmationPage extends JFrame {

	private JPanel contentPane;
	private Order_ProgramService service;
	private Order_program oProgram;
	private List<Order_program> list;
	
	private JTextField lblTotal1;
	private JTextField lblTotal2;
	private JTextField lblTotal3;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmationPage frame = new ConfirmationPage();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConfirmationPage() {
		service = new Order_ProgramService();
		list = service.showOList(oProgram);
		
		initialize();
	}

	private void initialize() {
		setTitle("Confirmation List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		JScrollPane scroll = new JScrollPane(panel);
//		panel.add(scroll);

//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//		
//		scrollPane.add(contentPane);
//		panel.add(scrollPane);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton(arg0);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(
				new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\1111111111.jpg"));
		btnNewButton.setBounds(766, 358, 71, 67);
		contentPane.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 41, 685, 353);
		contentPane.add(scrollPane);

		ConfirmPanel panel = new ConfirmPanel();
		scrollPane.setViewportView(panel);
		panel.loadData();
		////////////////////////////////////////////////////////

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(77, 404, 685, 21);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 6, 0, 0));

		JLabel lbl1 = new JLabel("총 주문건수 : ");
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lbl1);

		lblTotal1 = new JTextField("");
		lblTotal1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal1.setEditable(false);
		lblTotal1.setBackground(Color.WHITE);
		panel_1.add(lblTotal1);

		JLabel lbl2 = new JLabel("총 주문수량 : ");
		lbl2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lbl2);

		lblTotal2 = new JTextField();
		lblTotal2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal2.setBackground(Color.WHITE);
		lblTotal2.setEditable(false);
		panel_1.add(lblTotal2);
		lblTotal2.setColumns(10);

		JLabel lbl3 = new JLabel("총 판매금액 : ");
		lbl3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lbl3);

		lblTotal3 = new JTextField("");
		lblTotal3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal3.setBackground(Color.WHITE);
		lblTotal3.setEditable(false);
		panel_1.add(lblTotal3);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(
				"D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\different-color-roses.jpg"));
		lblNewLabel_5.setBounds(0, 0, 861, 473);
		contentPane.add(lblNewLabel_5);
		
		setTotal(list);
	}
	
	 

	protected void actionPerformedBtnNewButton(ActionEvent arg0) {

		FlowerFrm frame = new FlowerFrm();
		dispose();
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public void setTotal(List<Order_program> list) {
		int total1 = list.size();
		int total2 = list.parallelStream().mapToInt(Order_program::getOrder_count).sum();
		int total3 = list.parallelStream().mapToInt(Order_program::getSale_price).sum();
		lblTotal1.setText(total1+"");
		lblTotal2.setText(total2+"");
		lblTotal3.setText(total3+"");
	}
}
