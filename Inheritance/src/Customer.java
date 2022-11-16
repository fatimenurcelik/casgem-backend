public class Customer {
	private int id;
	private String number;

	public Customer() {
		super();
	}

	public Customer(int id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
