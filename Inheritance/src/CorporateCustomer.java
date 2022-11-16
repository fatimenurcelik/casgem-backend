
public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNuber;

	public CorporateCustomer() {
		super();
	}

	public CorporateCustomer(int id, String number, String companyName, String taxNuber) {
		super(id, number);
		this.companyName = companyName;
		this.taxNuber = taxNuber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNuber() {
		return taxNuber;
	}

	public void setTaxNuber(String taxNuber) {
		this.taxNuber = taxNuber;
	}
}
