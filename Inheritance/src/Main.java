import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer individualCustomer1 = new IndividualCustomer(1, "1", "fatime", "celik", "123");
		IndividualCustomer individualCustomer2 = new IndividualCustomer(2, "2", "fatime", "celik", "123");
		IndividualCustomer individualCustomer3 = new IndividualCustomer(3, "3", "fatime", "celik", "123");
		IndividualCustomer individualCustomer4 = new IndividualCustomer(4, "4", "fatime", "celik", "123");
		IndividualCustomer individualCustomer5 = new IndividualCustomer(5, "5", "fatime", "celik", "123");

		CorporateCustomer corporateCustomer1 = new CorporateCustomer(1, "1", "kodlamaio", "123");
		CorporateCustomer corporateCustomer2 = new CorporateCustomer(2, "2", "casgem", "153");
		CorporateCustomer corporateCustomer3 = new CorporateCustomer(3, "3", "turkcell", "123");
		CorporateCustomer corporateCustomer4 = new CorporateCustomer(4, "4", "etiya", "183");
		CorporateCustomer corporateCustomer5 = new CorporateCustomer(5, "5", "trendyol", "4123");

		List<IndividualCustomer> individualCutomers = new ArrayList<>();
		individualCutomers.add(individualCustomer1);
		individualCutomers.add(individualCustomer2);
		individualCutomers.add(individualCustomer3);
		individualCutomers.add(individualCustomer4);
		individualCutomers.add(individualCustomer5);

		List<CorporateCustomer> corporateCustomers = new ArrayList<>();
		corporateCustomers.add(corporateCustomer1);
		corporateCustomers.add(corporateCustomer2);
		corporateCustomers.add(corporateCustomer3);
		corporateCustomers.add(corporateCustomer4);
		corporateCustomers.add(corporateCustomer5);

		List<Customer> customers = new ArrayList<>();
		customers.add(corporateCustomer1);
		customers.add(corporateCustomer2);
		customers.add(corporateCustomer3);
		customers.add(corporateCustomer4);
		customers.add(corporateCustomer5);
		customers.add(individualCustomer1);
		customers.add(individualCustomer2);
		customers.add(individualCustomer3);
		customers.add(individualCustomer4);
		customers.add(individualCustomer5);
		
		IndividualCustomer individualCustomer6 = new IndividualCustomer(6, "1", "fatime", "celik", "123");
		CorporateCustomer corporateCustomer6 = new CorporateCustomer(6, "1", "kodlamaio", "123");
		
		//polymorphism -> sürdürülebilirlik için lazým
		Customer customer1 = individualCustomer6;
		
		System.out.println(((IndividualCustomer)customer1).getFirstName());
	}

}
