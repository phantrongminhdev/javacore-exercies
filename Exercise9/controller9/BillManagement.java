package controller9;

import java.util.ArrayList;
import java.util.List;

import model9.Bill;

public class BillManagement {
	List<Bill> billList;
	
	public BillManagement() {
		this.billList = new ArrayList<>();
	}
	
	// add bill
	public void addBill(Bill bill) {
		this.billList.add(bill);
	}
	
	//delete bill
	public void deleteBill(int id) {
		for(int i = 0 ; i < billList.size() ; i++) {
			if(billList.get(i).getIdBill() == id) {
				this.billList.remove(i);
			}
		}
	}
	
	//caculate payment money
	public int caculatePaymentMoney(int idBill){
		int paymentMoney = 0;
		for(int i = 0 ; i< billList.size() ; i++) {
			if(billList.get(i).getIdBill() == idBill) {
				paymentMoney = (billList.get(i).getNewElectricCode() - billList.get(i).getOldElectricCode()) * 5;
			}
		}
		return paymentMoney;
	}
}
