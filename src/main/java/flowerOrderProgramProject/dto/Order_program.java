package flowerOrderProgramProject.dto;

import java.util.Date;

public class Order_program {

	private Flower_information flower = new Flower_information();
	private int ono;
	private String order_number;
	private Date order_date;
	private String id;
	private String flower_code;
	private int order_count;
	private String choice;
	private int sale_price;
 
	public Order_program() {

	}

	public Order_program(String id) {
		super();
		this.id = id;
	}
	


	public Order_program(String flower_code, int order_count) {
		this.flower_code = flower_code;
		this.order_count = order_count;
	}

	public Order_program(int ono) {
		this.ono = ono;
	}

	public Order_program(int ono, String order_number, Date order_date, String id, String flower_code, int order_count,
			String choice, int sale_price) {
		super();
		this.ono = ono;
		this.order_number = order_number;
		this.order_date = order_date;
		this.id = id;
		this.flower_code = flower_code;
		this.order_count = order_count;
		this.choice = choice;
		this.sale_price = sale_price;
	}

	/**
	 * @return the ono
	 */
	public int getOno() {
		return ono;
	}

	/**
	 * @param ono the ono to set
	 */
	public void setOno(int ono) {
		this.ono = ono;
	}

	/**
	 * @return the order_number
	 */
	public String getOrder_number() {
		return order_number;
	}

	/**
	 * @param order_number the order_number to set
	 */
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	/**
	 * @return the order_date
	 */
	public Date getOrder_date() {
		return order_date;
	}

	/**
	 * @param order_date the order_date to set
	 */
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the flower_code
	 */
	public String getFlower_code() {
		return flower_code;
	}

	/**
	 * @param flower_code the flower_code to set
	 */
	public void setFlower_code(String flower_code) {
		this.flower_code = flower_code;
	}

	/**
	 * @return the order_count
	 */
	public int getOrder_count() {
		return order_count;
	}

	/**
	 * @param order_count the order_count to set
	 */
	public void setOrder_count(int order_count) {
		this.order_count = order_count;
	}

	/**
	 * @return the choice
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * @param choice the choice to set
	 */
	public void setChoice(String choice) {
		this.choice = choice;
	}

	/**
	 * @return the sale_price
	 */
	public int getSale_price() {
		return sale_price;
	}

	/**
	 * @param sale_price the sale_price to set
	 */
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}

	@Override
	public String toString() {
		return String.format(
				"%s,%s",
				flower_code, order_count);
	}

	

}
