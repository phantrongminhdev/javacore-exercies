package model9;

public class Bill {
	private int idBill;
	private int oldElectricCode;
	private int newElectricCode;
	private int paymentMoney;
	private Customer customer;
	
	public Bill() {
		
	}
	
	public Bill(int idBill , int oldElectricCode , int newElectricCode , int paymentMoney , Customer customer) {
		this.idBill = idBill;
		this.oldElectricCode = oldElectricCode;
		this.newElectricCode = newElectricCode;
		this.paymentMoney = paymentMoney;
		this.customer = customer;
	}
	
	
	public int getIdBill() {
		return idBill;
	}

	public void setIdBill(int idBill) {
		this.idBill = idBill;
	}

	public int getOldElectricCode() {
		return oldElectricCode;
	}

	public void setOldElectricCode(int oldElectricCode) {
		this.oldElectricCode = oldElectricCode;
	}

	public int getNewElectricCode() {
		return newElectricCode;
	}

	public void setNewElectricCode(int newElectricCode) {
		this.newElectricCode = newElectricCode;
	}

	public int getPaymentMoney() {
		return paymentMoney;
	}

	public void setPaymentMoney(int paymentMoney) {
		this.paymentMoney = paymentMoney;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Bill [idBill=" + idBill + ", oldElectricCode=" + oldElectricCode + ", newElectricCode="
				+ newElectricCode + ", paymentMoney=" + paymentMoney + ", customer=" + customer.getFullname()  + "]";
	}
}
