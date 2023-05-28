package view1;

import java.util.Scanner;

import controller1.PersonManagement;
import model1.Employee;
import model1.Engineer;
import model1.Person;
import model1.Woker;

public class PersonMain {

	public static void main(String[] args) {
		PersonManagement employeeManagement = new PersonManagement();
		PersonManagement engineerManagement = new PersonManagement();
		PersonManagement workerManagement = new PersonManagement();
		while (true) {
			System.out.println("--------Employee Management--------");
			System.out.println("1. Add employee");
			System.out.println("2. Search employee by name");
			System.out.println("3. Show list employee");
			System.out.println("4. Exit");
			System.out.println("Enter your choice :");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				// add employee
				System.out.println("Enter fullname : ");
				String fullname = new Scanner(System.in).nextLine();

				System.out.println("Enter age :");
				int age = new Scanner(System.in).nextInt();

				System.out.println("Enter gender :");
				String gender = new Scanner(System.in).nextLine();

				System.out.println("Enter address : ");
				String address = new Scanner(System.in).nextLine();

				System.out.println("Do type of person you want to add ?");
				TypePerson();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();

				if (choiceType == 1) {
					System.out.println("Enter work :");
					String work = new Scanner(System.in).nextLine();
					Person employee = new Employee(fullname, age, gender, address, work);
					employeeManagement.addPerson(employee);
					System.out.println("add employee done!!!");

				} else if (choiceType == 2) {
					System.out.println("Enter major : ");
					String major = new Scanner(System.in).nextLine();
					Person engineer = new Engineer(fullname, age, gender, address, major);
					engineerManagement.addPerson(engineer);
					System.out.println("add engineer done!!!");

				} else if (choiceType == 3) {
					while(true) {
						System.out.println("Enter level : ");
						int level = new Scanner(System.in).nextInt();
						if(level >= 1 && level<= 10) {
							Person woker = new Woker(fullname, age, gender, address, level);
							workerManagement.addPerson(woker);
							System.out.println("add woker done!!!");
							break;
						}else {
							System.out.println("moi nhap lai level!!!");
						}
					}
				}

			} else if (choice == 2) {
				// search employee

				System.out.println("Enter fullname that you want to search");
				String fullname = new Scanner(System.in).nextLine();

				System.out.println("Do type of person you want to search ?");
				TypePerson();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();

				if (choiceType == 1) {
					employeeManagement.searchPersonByFullName(fullname);
				} else if (choiceType == 2) {
					engineerManagement.searchPersonByFullName(fullname);
				} else if (choiceType == 3) {
					workerManagement.searchPersonByFullName(fullname);
				}

			} else if (choice == 3) {
				// show list employee
				System.out.println("Do type of list person you want to show ?");
				TypePerson();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();
				if (choiceType == 1) {
					employeeManagement.showListPerson();
				} else if (choiceType == 2) {
					engineerManagement.showListPerson();
				} else if (choiceType == 3) {
					workerManagement.showListPerson();
				}
			} else {
				break;
			}
		}
	}

	public static void TypePerson() {
		System.out.println("1. Employee");
		System.out.println("2. Engineer");
		System.out.println("3. Worker");
	}
}
