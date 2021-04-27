package flowerOrderProgramProject.panel;


import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;

import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.service.Order_ProgramService;
import flowerOrderProgramProject.view.AbstractCustomTablePanel;



@SuppressWarnings("serial")
public class ConfirmPanel  extends AbstractCustomTablePanel<Order_program> {

//order_program 테이블 불러오기
	public ConfirmPanel() {
		initialize();
	}

	private void initialize() {
		table.getTableHeader().setFont(new Font("SanSerif", Font.BOLD, 13));
		table.getTableHeader().setForeground(Color.WHITE);
		table.getTableHeader().setBackground(Color.BLACK);
		table.setBackground(Color.white);
		table.setSelectionBackground(Color.pink);
		
	}
	
	
	
	private Order_ProgramService service;
	private Order_program oProgram;
	
	
	@Override
	public void initList() {
		service = new Order_ProgramService();
		list = service.showOList(oProgram);
		System.out.println(list.size());
	}
	
	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4, 5, 6, 7);
	 

		// 컬럼별 너비 조정
		setTableCellWidth(30, 100, 90, 70, 100, 100, 80, 100);
	}

	@Override
	public Object[] toArray(Order_program t) {
		return new Object[] {
				t.getOno(),
				t.getOrder_number(),
				t.getOrder_date(),
				t.getId(),
				t.getFlower_code(),
				t.getOrder_count(),
				t.getChoice(),
				String.format("%,d", t.getSale_price())
			};
	}
	 
	@Override
	public String[] getColumnNames() {
		return new String[] {
				"No.",
				"Order_Number",
				"Order_Date",
				"id",
				"Flower_code",
				"Order_Count",
				"Choice",
				"Sale_price"
				
		};
				
	}

	@Override
	public Order_program getItem() {
		// TODO Auto-generated method stub
		return null;
	}


}
