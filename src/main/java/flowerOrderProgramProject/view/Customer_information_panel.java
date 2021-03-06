package flowerOrderProgramProject.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.exception.NotSelectedException;
import flowerOrderProgramProject.service.Customer_informationService;

@SuppressWarnings("serial")
public class Customer_information_panel extends AbstractCustomTablePanel<Customer_information> {
	public Customer_information_panel() {
		
		initialize();
	} 
	
	private void initialize() {
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
		table.getTableHeader().setForeground(Color.black);
		table.getTableHeader().setBackground(Color.pink);
		table.setBackground(Color.WHITE);
		table.setSelectionBackground(Color.pink);
		
	}
	
	private Customer_informationService service;
	
	@Override
	public Customer_information getItem(){
		int row = table.getSelectedRow();
		String Customer_information = table.getValueAt(row, 0)+"";
		System.out.println(Customer_information);
		return list.get(list.indexOf(new Customer_information(Customer_information)));
	}
	

	@Override
	public void initList() {
		service = new Customer_informationService();
		list = service.showCList();
	}

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3);
		setTableCellAlign(SwingConstants.RIGHT, 4);

		// 컬럼별 너비 조정
		setTableCellWidth(50, 50, 70, 50, 50);
	}

	@Override
	public Object[] toArray(Customer_information t) {
		return new Object[] {
				t.getId(),
				t.getMember_name(),
				t.getPhone_number(),
				t.getMembership_title(),
				String.format("%,d", t.getCumulative_amount())
		};
	}

	@Override
	public String[] getColumnNames() {
		return new String[] {
				"Id",
				"Member Name",
				"Phone Number",
				"Membership",
				"Cumulative amount"
				
		};
	}
	

}
