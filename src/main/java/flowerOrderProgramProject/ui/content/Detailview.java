package flowerOrderProgramProject.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.panel.Flowerpricelist;
import flowerOrderProgramProject.service.Flower_informationService;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Detailview extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Flowerpricelist panel;
	private Flower_informationService service;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detailview frame = new Detailview();
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
	public Detailview() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 766, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel = new Flowerpricelist();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 10, 20));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnAdd(e);
			}
		});
		panel_6.add(btnAdd);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCancel(e);
			}
		});
		panel_6.add(btnCancel);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel("l");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\_convertToPNG.png"));
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\_convertToPNG.png"));
		panel_2.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "List view", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("수정");
		panel_3.add(btnNewButton); 
		
		JButton btnNewButton_1 = new JButton("저장");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_1(e);
			}
		});
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("삭제");
		panel_3.add(btnNewButton_2);
		
		textField = new JTextField();
		panel_1.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}
	
	private void setTextField(String f) {
		textField.setText(f+"");
	}
	
	
	
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Flower_information flower = panel.getItem();
//		
		setTextField(String.format("%s,%s,%s", flower.getFlower_code(),flower.getFlower_name(),flower.getFlower_price()));
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		String flower = textField.getText();	
		
		String fc = flower.substring(0, flower.indexOf(","));
		String fn = flower.substring(flower.indexOf(",")+1, flower.lastIndexOf(","));
		int fp = Integer.parseInt((flower.substring(flower.lastIndexOf(",")+1)));
		
		String flower_code = fc;
		String flower_name = fn;
		int flower_price = fp;
		
		Flower_information f = new Flower_information(flower_code, flower_name, flower_price);
		System.out.println(f);
		service = new Flower_informationService();
		service.addFlower_information(f);
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {
		panel.clearTf();
	}
}