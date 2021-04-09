package flowerOrderProgramProject.control;

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

import flowerOrderProgramProject.panel.Flowerpricelist;

public class Detailview extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		
		Flowerpricelist panel = new Flowerpricelist();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 10, 20));
		
		JButton btnAdd = new JButton("추가");
		panel.add(btnAdd);
		
		JButton btnCancel = new JButton("취소");
		panel.add(btnCancel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "List view", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		panel_1.add(list, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("수정");
		panel_3.add(btnNewButton); 
		
		JButton btnNewButton_1 = new JButton("저장");
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("삭제");
		panel_3.add(btnNewButton_2);
		
		table = new JTable();
		panel_1.add(table, BorderLayout.WEST);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{1, 2, 3, 4, 5},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uAF43 \uCF54\uB4DC", "\uAF43 \uC774\uB984", "\uB2E8\uAC00", "New column"
			}
		));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
	}
}