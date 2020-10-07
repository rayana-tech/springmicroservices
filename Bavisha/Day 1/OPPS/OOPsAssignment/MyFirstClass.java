package OOPsAssignment;

public class MyFirstClass {

	public static void main(String[] args) {
		

		Address add = new Address("Ist Main HSR Layout", "Bangalore");
		System.out.println(add.getAddressDetails());
		Customer customer = new Customer("John",add);
		System.out.println(customer.getCustomerDetails());
	}

}
