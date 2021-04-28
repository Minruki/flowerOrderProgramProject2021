package flowerOrderProgramProject.ui.content;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import flowerOrderProgramProject.panel.RecieptPanel;

@SuppressWarnings("serial")
public class Reciept extends JFrame {

	private JPanel contentPane;
	private RecieptPanel panel_1;
	private JButton button;
	private JLabel lblNewLabel;
	private JButton printComponent;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reciept frame = new Reciept();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reciept() {
		initialize();
	}
	private void initialize() {
		setTitle("Reciept Screen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 711, 398);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new RecieptPanel();
		panel_1.setBounds(12, 10, 405, 343);
		contentPane.add(panel_1);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedButton(e);
			}
		});
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\1111111111.jpg"));
		button.setBounds(504, 286, 67, 67);
		contentPane.add(button);
		
		printComponent = new JButton("");
		printComponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton(arg0);
			}
		});
		printComponent.setBackground(Color.WHITE);
		printComponent.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\프린터.jpg"));
		printComponent.setBounds(423, 286, 78, 67);
		contentPane.add(printComponent);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\1231.jpg"));
		lblNewLabel.setBounds(0, 0, 695, 359);
		contentPane.add(lblNewLabel);
	}

	public RecieptPanel getPanel_1() {
		return panel_1;
	}
	protected void actionPerformedButton(ActionEvent e) {
		dispose();
	}
	
	
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		printComponent();
	}
	
	
	
	
	public void printComponent() {
		PrinterJob pj = PrinterJob.getPrinterJob();
		pj.setJobName("print Component");
		
		pj.setPrintable(new Printable() {
			public int print(Graphics pg, PageFormat pf, int pageNum) {
				if(pageNum > 0) return Printable.NO_SUCH_PAGE;
				
				Graphics2D g2 = (Graphics2D) pg;
				return  Printable.PAGE_EXISTS;
			}
				
			});
		
			if(pj.printDialog() == false) return;
			
			try {
				pj.print();
				
			}catch (PrinterException ex) {
			}
	}
	}

