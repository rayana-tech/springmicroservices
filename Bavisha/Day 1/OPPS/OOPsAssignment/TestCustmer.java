package OOPsAssignment;

public class TestCustmer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Address add = new Address("Ist Main HSR Layout", "Bangalore");
		customer.setCustomerName("Jonh");
		customer.setResidentialAddress(add);
		System.out.println(customer.getCustomerName()+"\n"+customer.getResidentialAddress().getAddressDetails());
		Customer customer2 = new Customer("John",add);
		System.out.println(customer2.getCustomerDetails());
	}

}
