package flowerOrderProgramProject.dto;

public class Membership_discount {

	private String membership_title;
	private String discount_rate;

	public Membership_discount() {

	}

	public Membership_discount(String membership_title) {
		super();
		this.membership_title = membership_title;
		

	}

	

	public Membership_discount(String membership_title, String discount_rate) {
		super();
		this.membership_title = membership_title;
		this.discount_rate = discount_rate;
	}




	
	/**
	 * @return 
	 */
	public String getMembership_title(){
		return membership_title;
		
	}

	/**
	 * @param membership_title the membership_title to set
	 */
	public void setMembership_title(String membership_title) {
		this.membership_title = membership_title;
	}

	/**
	 * @return the discount_rate
	 */
	public String getDiscount_rate() {
		return discount_rate;
	}

	/**
	 * @param discount_rate the discount_rate to set
	 */
	public void setDiscount_rate(String discount_rate) {
		this.discount_rate = discount_rate;
	}

	@Override
	public String toString() {
		return String.format("%s", membership_title);
	}

}
