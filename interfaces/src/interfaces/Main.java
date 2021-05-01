package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Logger[] {new DBLogger(),new FileLogger()});
		Customer customer = new Customer(1,"Ertugrul","Ozdemir");
		customerManager.add(customer);

	}

}
