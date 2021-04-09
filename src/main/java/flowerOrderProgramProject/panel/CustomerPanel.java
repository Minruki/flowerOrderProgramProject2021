package flowerOrderProgramProject.panel;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import flowerOrderProgramProject.dto.Customer_information;



@SuppressWarnings("serial")
public class CustomerPanel extends JPanel {
	private JTextField tfid;
	private JTextField tfMember_name;
	private JTextField tfPhone_number;
	private JLabel lblcumulativemoney;
	private JTextField tfCumulative_amount;
	private JLabel lblmembership;
	private JTextField tfMembership_title;

	/**
	 * Create the panel.
	 */
	public CustomerPanel() {

		initialize();
	}

	private void initialize() {
		setBorder(new TitledBorder(null, "\uD68C\uC6D0 \uC815\uBCF4", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblid = new JLabel("Customer id");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblid);

		tfid = new JTextField();
		add(tfid);
		tfid.setColumns(10);

		JLabel lblname = new JLabel("Member Name");
		lblname.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblname);

		tfMember_name = new JTextField();
		add(tfMember_name);
		tfMember_name.setColumns(10);

		JLabel lblphonenumber = new JLabel("Phone Number");
		lblphonenumber.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblphonenumber);

		tfPhone_number = new JTextField();
		add(tfPhone_number);
		tfPhone_number.setColumns(10);

		lblcumulativemoney = new JLabel("Cumulative amount");
		lblcumulativemoney.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblcumulativemoney);

		tfCumulative_amount = new JTextField();
		tfCumulative_amount.setColumns(10);
		add(tfCumulative_amount);

		lblmembership = new JLabel("Membership Title");
		lblmembership.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblmembership);

		tfMembership_title = new JTextField();
		tfMembership_title.setColumns(10);
		add(tfMembership_title);
	}

	public Customer_information getcustomer_information() {
		String id = tfid.getText().trim();
		String Member_name = tfMember_name.getText().trim();
		String Phone_number = tfPhone_number.getText().trim();
		int Cumulative_amount = Integer.parseInt(tfCumulative_amount.getText().trim());
		String Membership_title = tfMembership_title.getText().trim();
		return new Customer_information(id, Member_name, Phone_number, Cumulative_amount, Membership_title);
	}

	public void setcustomer_information(Customer_information customer_information) {
		tfid.setText(customer_information.getId());
		tfMember_name.setText(customer_information.getMember_name());
		tfPhone_number.setText(customer_information.getPhone_number());
		tfCumulative_amount.setText(customer_information.getCumulative_amount() + "");
		tfMembership_title.setText(customer_information.getMembership_title());
	}

	public void clearTf() {
		tfid.setText("");
		tfMember_name.setText("");
		tfPhone_number.setText("");
		tfCumulative_amount.setText("");
		tfMembership_title.setText("");

	}
}
