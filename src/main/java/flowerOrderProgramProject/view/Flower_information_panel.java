package flowerOrderProgramProject.view;

import javax.swing.SwingConstants;


import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.exception.NotSelectedException;
import flowerOrderProgramProject.service.Customer_informationService;

@SuppressWarnings("serial")
public class Flower_information_panel extends AbstractCustomTablePanel<Flower_information> {
	public Flower_information_panel() {
	}
	
	private Customer_informationService service;
	
	@Override
	public Flower_information getItem() {
		int idx = table.getSelectedRow();
		if (idx == -1) {
			throw new NotSelectedException();
		}
		return list.get(idx);
	}

	@Override
	public void initList() {
		service = new Customer_informationService();
		list = service.showFList();
	}

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2);
	

		// 컬럼별 너비 조정
		setTableCellWidth(80, 80, 120);
	}

	@Override
	public Object[] toArray(Flower_information t) {
		return new Object[] {
				t.getFlower_code(),
				t.getFlower_name(),
				t.getFlower_price(),
		
		};
	}

	@Override
	public String[] getColumnNames() {
		return new String[] {
				"code",
				"name",
				"price",
			
		};
	}

}