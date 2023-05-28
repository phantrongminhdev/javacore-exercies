package controller1;

import java.util.ArrayList;
import java.util.List;

import model1.Person;


public class PersonManagement {
	List<Person> personList;

	public PersonManagement() {
		this.personList = new ArrayList<>();
	}

	// add
	public void addPerson(Person person) {
		this.personList.add(person);
	}

	// search
	public void searchPersonByFullName(String fullName) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFullname().equals(fullName)) {
				System.out.println(personList.get(i).toString());
			}
		}
	}

	// show list
	public void showListPerson() {
		personList.forEach(o -> System.out.println(o.toString()));
	}
}
