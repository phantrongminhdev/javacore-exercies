package model4;

import java.util.List;

public class Family {
	List<Person> personList;
	private String address;
	
	public Family() {
		
	}
	
	public Family(List<Person> personList , String address) {
		this.personList = personList;
		this.address = address;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Family [personList=" + personList + ", address=" + address + "]";
	}
	
	
}
