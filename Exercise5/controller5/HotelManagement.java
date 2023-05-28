package controller5;

import java.util.ArrayList;
import java.util.List;

import model5.Person;

public class HotelManagement {
	
	List<Person> personList;
	
	public HotelManagement() {
		this.personList = new ArrayList<>();
	}
	
	//add
	public void addPerson(Person person) {
		this.personList.add(person);
	}
	
	//delete
	public void deletePersonById(int id) {
		for(Person person : personList) {
			if(person.getIdNumber() == id) {
				personList.remove(person);
			}
		}
	}
	
	//caculate money
	public int caculateMoney(int id) {
		Person person = new Person();
		for(Person per : personList) {
			if(per.getIdNumber() == id) {
				person = per;
			}
		}
		return person.getRoom().getPrice()*person.getNumberRent();
	}
}
