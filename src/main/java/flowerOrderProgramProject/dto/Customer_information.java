package flowerOrderProgramProject.dto;

public class Customer_information {
	private String id;
	private String member_name;
	private String phone_number;
	private int cumulative_amount;
	private String membership_title;
	
	public Customer_information() {

	}

	public Customer_information(String id) {
		super();
		this.id = id;
	}

	public Customer_information(String id, String member_name, String phone_number, int cumulative_amount,
			String membership_title) {
	
		this.id = id;
		this.member_name = member_name;
		this.phone_number = phone_number;
		this.cumulative_amount = cumulative_amount;
		this.membership_title = membership_title;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public int getCumulative_amount() {
		return cumulative_amount;
	}

	public void setCumulative_amount(int cumulative_amount) {
		this.cumulative_amount = cumulative_amount;
	}

	public String getMembership_title() {
		return membership_title;
	}

	public void setMembership_title(String membership_title) {
		this.membership_title = membership_title;
	}

	@Override
	public String toString() {
		return String.format(
				"customer_information [id=%s, member_name=%s, phone_number=%s, cumulative_amount=%s, membership_title=%s]",
				id, member_name, phone_number, cumulative_amount, membership_title);
	}
	
}

	
	