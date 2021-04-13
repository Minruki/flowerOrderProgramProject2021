package flowerOrderProgramProject.view;

import javax.swing.SwingConstants;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.exception.NotSelectedException;
import flowerOrderProgramProject.service.Customer_informationService;

@SuppressWarnings("serial")
public class Customer_information_panel extends AbstractCustomTablePanel<Customer_information> {
	public Customer_information_panel() {
	}
	
	private Customer_informationService service;
	
	@Override
	public Customer_information getItem() {
		int idx = table.getSelectedRow();
		if (idx == -1) {
			throw new NotSelectedException();
		}
		return list.get(idx);
	}

	@Override
	public void initList() {
		service = new Customer_informationService();
		list = service.showCList();
	}

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 4);
		setTableCellAlign(SwingConstants.RIGHT, 2,3);

		// 컬럼별 너비 조정
		setTableCellWidth(80, 80, 120,80,100);
	}

	@Override
	public Object[] toArray(Customer_information t) {
		return new Object[] {
				t.getId(),
				t.getMember_name(),
				t.getPhone_number(),
				t.getCumulative_amount(),
				t.getMembership_title()
		};
	}

	@Override
	public String[] getColumnNames() {
		return new String[] {
				"id",
				"member",
				"phone",
				"amount",
				"membership"
		};
	}

}
