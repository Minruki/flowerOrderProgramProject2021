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
	
	
	public Flower_information(String flower_name, int flower_price) {
	
		this.flower_name = flower_name;
		this.flower_price = flower_price;
	}

	public Flower_information(String flower_code) {
		this.flower_code = flower_code;
	}
 
	public Flower_information(String flower_code, String flower_name, int flower_price) {

		this.flower_code = flower_code;
		this.flower_name = flower_name;
		this.flower_price = flower_price;
	}

	public String getFlower_code() {
		return flower_code;
	}

	public void setFlower_code(String flower_code) {
		this.flower_code = flower_code;
	}

	
	public String getFlower_name() {
		return flower_name;
	}

	public void setFlower_name(String flower_name) {
		this.flower_name = flower_name;
	}

	
	public int getFlower_price() {
		return flower_price;
	}

	public void setFlower_price(int flower_price) {
		this.flower_price = flower_price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flower_code == null) ? 0 : flower_code.hashCode());
		result = prime * result + ((flower_name == null) ? 0 : flower_name.hashCode());
		result = prime * result + flower_price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower_information other = (Flower_information) obj;
		if (flower_code == null) {
			if (other.flower_code != null)
				return false;
		} else if (!flower_code.equals(other.flower_code))
			return false;
		if (flower_name == null) {
			if (other.flower_name != null)
				return false;
		} else if (!flower_name.equals(other.flower_name))
			return false;
		if (flower_price != other.flower_price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		
		
		return String.format("%s %s %s",
				flower_code == null ? "" : flower_code,
				flower_name == null ? "" : flower_name,
				flower_price == 0 ? "" : flower_price);
	}

}
