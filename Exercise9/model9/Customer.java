package model9;

public class Customer {
	private String fullname;
	private int address;
	private int codeElectric;
	
	public Customer() {
		
	}
	
	public Customer(String fullname , int address, int codeElectric) {
		this.fullname = fullname;
		this.address = address;
		this.codeElectric = codeElectric;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public int getCodeElectric() {
		return codeElectric;
	}

	public void setCodeElectric(int codeElectric) {
		this.codeElectric = codeElectric;
	}

	@Override
	public String toString() {
		return "Customer [fullname=" + fullname + ", address=" + address + ", codeElectric=" + codeElectric + "]";
	}
}
