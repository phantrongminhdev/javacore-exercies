package view4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model4.Family;
import model4.Person;
import model4.Town;

public class Main {

	public static void main(String[] args) {
		Town town = new Town();
		
		// input 
		System.out.println("Enter number familys : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("---INPUT INFORMATION FAMILY---");
		
		for(int i = 0 ; i < n ; i++) { // has n familys in a town
			
			
			System.out.println("Enter address family number " + (i+1) + " : "); // address of family
			String address = new Scanner(System.in).nextLine();
			
			System.out.println("Enter numbers person in family number " + (i + 1) + " : ");
			int number = new Scanner(System.in).nextInt();
			List<Person> personList = new ArrayList<>();  // each family has m person
			for(int j = 0 ; j < number ; j ++) {
				System.out.println("Enter fullname person " + (j+1) + " : "); 
				String fullname = new Scanner(System.in).nextLine();
				
				System.out.println("Enter age person " + (j+1) + " : " );
				int age = new Scanner(System.in).nextInt();
				
				System.out.println("Enter job person " + (j+1) + " : " );
				String job = new Scanner(System.in).nextLine();
				
				System.out.println("Enter idNumber person " + (j+1) + " : ");
				int idNumber = new Scanner(System.in).nextInt();
				
				personList.add(new Person(fullname, age, job, idNumber));
			}
			
			town.addFamily(new Family(personList, address));
		}
		
		// show
		List<Family> familyList = town.getFamilyList();
		System.out.println("Numbers family in a town : " + familyList.size());
		System.out.println("Infomation each of family in a town : ");
		
		for(int i = 0 ; i < familyList.size() ; i++) {
			System.out.println("-----Info family " + (i + 1));
			System.out.println("Adress : " + familyList.get(i).getAddress());
			List<Person> personList = familyList.get(i).getPersonList();
			for(int j = 0 ; j < personList.size() ; j++) {
				System.out.println("Info person " + (j+1) + " : "+ personList.get(j).toString());
			}
		}
	}
}





