package flowerOrderProgramProject.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.panel.Flowerpricelist;
import flowerOrderProgramProject.service.Flower_informationService;
import flowerOrderProgramProject.ui.FlowerFrm;

@SuppressWarnings("serial")
public class Detailview extends JFrame {

	private JPanel contentPane;
	private JList<Flower_information> tfResult;
	private Flowerpricelist AddPanel;
	private Flower_informationService service;
	private DefaultListModel<Flower_information> model = new DefaultListModel<Flower_information>();
	private AbstractButton btnAdd;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detailview frame = new Detailview();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
		});
	}


	public Detailview() {
		service = new Flower_informationService();
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
		AddPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u203B Flower Add \u203B", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(AddPanel);
		AddPanel.setLayout(new GridLayout(0, 2, 10, 20));
		
		JPanel empty = new JPanel();
		AddPanel.add(empty);
		empty.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\returnicon1.jpg"));
		btnNewButton.setBounds(0, 10, 50, 23);
		empty.add(btnNewButton);
		
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
		picture1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\background.jpg"));
		lblNewLabel_1.setBounds(0, 0, 370, 242);
		picture1.add(lblNewLabel_1);
		
		JButton button = new JButton("New button");
		button.setBounds(31, 186, 97, 23);
		picture1.add(button);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\flowerOrderProgramProject\\flowerOrderProgramProject\\image\\flower\\_convertToPNG.png"));
		lblNewLabel.setBounds(0, 0, 370, 242);
		panel_2.add(lblNewLabel);
		
		JPanel ListViewPanel = new JPanel();
		contentPane.add(ListViewPanel);
		ListViewPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "List view", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		ListViewPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel FunctionPanel = new JPanel();
		ListViewPanel.add(FunctionPanel, BorderLayout.SOUTH);
		
		JButton btnModify = new JButton("수정");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnModify(arg0);
			}
		});
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
		
		tfResult = new JList<>();
		tfResult.setModel(model);
		ListViewPanel.add(tfResult, BorderLayout.CENTER);
	}
	
	
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Flower_information flower = AddPanel.getItem();
//		
		model.addElement(flower);
		JOptionPane.showMessageDialog(null, "It's been added :) ");
//		setTextField(String.format("%s,%s,%s", flower.getFlower_code(),flower.getFlower_name(),flower.getFlower_price()));
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		Flower_information flower = tfResult.getSelectedValue();	
		service.addFlower_information(flower);
		JOptionPane.showMessageDialog(null, "It's been Saved :) ");
//		String fc = flower.substring(0, ((DefaultListModel<Flower_information>) flower).indexOf(","));
//		String fn = flower.substring(flower.indexOf(",")+1, flower.lastIndexOf(","));
//		int fp = Integer.parseInt((flower.substring(flower.lastIndexOf(",")+1)));
//		
//		String flower_code = fc;
//		String flower_name = fn;
//		int flower_price = fp;
//		
//		Flower_information f = new Flower_information(flower_code, flower_name, flower_price);
//		System.out.println(f);
		
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {
		AddPanel.clearTf();
	}
	protected void actionPerformedBtnDel(ActionEvent e) {
		Flower_information fInformation = tfResult.getSelectedValue();
		model.removeElement(fInformation);
		JOptionPane.showMessageDialog(null, "It's been deleted :) ");
			
	}
	protected void actionPerformedBtnModify(ActionEvent e) {
		Flower_information flower = tfResult.getSelectedValue();
		AddPanel.setItem(flower);
		
		JOptionPane.showMessageDialog(null, "You can update the values now *^^* ");
		
	
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		FlowerFrm frame = new FlowerFrm();
		frame.setVisible(true);
		frame.setResizable(false);
		dispose();
		
	}
}