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

@SuppressWarnings("serial")
public class Detailview extends JFrame {

	private JPanel contentPane;
	private JTextField tfResult;
	private Flowerpricelist AddPanel;
	private Flower_informationService service;
	

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


	public Detailview() {
		initialize();
	}
	private void initialize() {
		setTitle("Flower management");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 766, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		AddPanel = new Flowerpricelist();
		contentPane.add(AddPanel);
		AddPanel.setLayout(new GridLayout(0, 2, 10, 20));
		
		JPanel empty = new JPanel();
		AddPanel.add(empty);
		
		JPanel panelAddandCancel = new JPanel();
		AddPanel.add(panelAddandCancel);
		panelAddandCancel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnAdd(e);
			}
		});
		panelAddandCancel.add(btnAdd);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCancel(e);
			}
		});
		panelAddandCancel.add(btnCancel);
		
		JPanel picture1 = new JPanel();
		contentPane.add(picture1);
		
		JLabel lblimg2 = new JLabel("");
		lblimg2.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\_convertToPNG.png"));
		picture1.add(lblimg2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblimg = new JLabel("picture2");
		lblimg.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\_convertToPNG.png"));
		panel_2.add(lblimg, BorderLayout.CENTER);
		
		JPanel ListViewPanel = new JPanel();
		contentPane.add(ListViewPanel);
		ListViewPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "List view", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		ListViewPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel FunctionPanel = new JPanel();
		ListViewPanel.add(FunctionPanel, BorderLayout.SOUTH);
		
		JButton btnModify = new JButton("수정");
		FunctionPanel.add(btnModify); 
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_1(e);
			}
		});
		FunctionPanel.add(btnSave);
		
		JButton btnDel = new JButton("삭제");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnDel(e);
			}
		});
		FunctionPanel.add(btnDel);
		
		tfResult = new JTextField();
		ListViewPanel.add(tfResult, BorderLayout.CENTER);
		tfResult.setColumns(10);
	}
	
	private void setTextField(String f) {
		tfResult.setText(f+"");
	}
	
	
	
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Flower_information flower = AddPanel.getItem();
//		
		setTextField(String.format("%s,%s,%s", flower.getFlower_code(),flower.getFlower_name(),flower.getFlower_price()));
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		String flower = tfResult.getText();	
		
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
		AddPanel.clearTf();
	}
	protected void actionPerformedBtnDel(ActionEvent e) {
		
		
		
	}
}