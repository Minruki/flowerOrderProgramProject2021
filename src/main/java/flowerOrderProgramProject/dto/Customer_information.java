package flowerOrderProgramProject.dto;

public class Customer_information {
	private String id;
	private String member_name;
	private String phone_number;
	private int cumulative_amount;
	private Membership_discount membership_title;
	
	public Customer_information() {

	}

	public Customer_information(String id, int cumulative_amount) {
		super();
		this.id = id;
		this.cumulative_amount = cumulative_amount;
	}

	public Customer_information(String id) { 
		super();
		this.id = id;
	}

	public Customer_information(String id, String member_name, String phone_number, int cumulative_amount,
			Membership_discount membership_title) {
	
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

	public Membership_discount getMembership_title() {
		return membership_title;
	}

	public void setMembership_title(Membership_discount membership_title) {
		this.membership_title = membership_title;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Customer_information other = (Customer_information) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"customer_information [id=%s, member_name=%s, phone_number=%s, cumulative_amount=%s, membership_title=%s]",
				id, member_name, phone_number, cumulative_amount, membership_title);
	}
	
}

	
	