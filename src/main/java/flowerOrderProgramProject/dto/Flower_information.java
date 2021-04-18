package flowerOrderProgramProject.dto;

public class Flower_information {
	private String flower_code;
	private String flower_name;
	private int flower_price;

	public Flower_information() {

	}
 
	public Flower_information(int flower_price) {
		super();
		this.flower_price = flower_price;
	}

	public Flower_information(String flower_code, String flower_name, int flower_price) {

		this.flower_code = flower_code;
		this.flower_name = flower_name;
		this.flower_price = flower_price;
	}


	public Flower_information(String flower_code) {
		this.flower_code = flower_code;
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
	 * @return the flower_name
	 */
	public String getFlower_name() {
		return flower_name;
	}

	/**
	 * @param flower_name the flower_name to set
	 */
	public void setFlower_name(String flower_name) {
		this.flower_name = flower_name;
	}

	/**
	 * @return the flower_price
	 */
	public int getFlower_price() {
		return flower_price;
	}

	/**
	 * @param flower_price the flower_price to set
	 */
	public void setFlower_price(int flower_price) {
		this.flower_price = flower_price;
	}

	
	

	@Override
	public String toString() {
		
		
		
		return String.format("%s %s %s",
				flower_code == null ? "" : flower_code,
				flower_name == null ? "" : flower_name,
				flower_price == 0 ? "" : flower_price);
	}

}
