package view5;

import java.util.Scanner;

import controller5.HotelManagement;
import model5.Person;
import model5.Room;
import model5.RoomA;
import model5.RoomB;
import model5.RoomC;

//private String fullname;
//private int age;
//private int idNumber;
//private int numberRent;

public class Main {
	public static void main(String[] args) {
		
		HotelManagement hotelManagement = new HotelManagement();
		
		while (true) {
			System.out.println("----HOTEL MANAGEMENT----");
			System.out.println("1. Add person for renting ");
			System.out.println("2. Delete person by id");
			System.out.println("3. Caculate money");
			System.out.println("4.Exit");
			System.out.println("Enter your choice :");
			int choice = new Scanner(System.in).nextInt();
			if(choice == 1) {
				//add person for renting
				System.out.println("Enter fullname : ");
				String fullname = new Scanner(System.in).nextLine();
				
				System.out.println("Enter age : ");
				int age = new Scanner(System.in).nextInt();
				
				System.out.println("Enter idNumber : ");
				int idNumber = new Scanner(System.in).nextInt();
				
				System.out.println("Enter numberRent : ");
				int numberRent = new Scanner(System.in).nextInt();
				
				Room room = new Room();
				System.out.println("Enter type of room :");
				System.out.println("1. A");
				System.out.println("2. B");
				System.out.println("3. C");
				int choiceRoom = new Scanner(System.in).nextInt();
				
				if(choiceRoom == 1)
				{
					room = new RoomA();
				}else if(choiceRoom == 2) {
					room = new RoomB();
				}else if(choiceRoom == 3) {
					room = new RoomC();
				}
				hotelManagement.addPerson(new Person( fullname ,  age ,  idNumber ,  room ,  numberRent));
			}else if(choice == 2) {
				//delete person by id
				System.out.println("enter id person need to delete !!!");
				int id = new Scanner(System.in).nextInt();
				hotelManagement.deletePersonById(id);
			}else if(choice == 3) {
				//caculate money
				//delete person by id
				System.out.println("enter id person need to caculate !!!");
				int id = new Scanner(System.in).nextInt();
				System.out.println("Your money!!!");
				System.out.println(hotelManagement.caculateMoney(id)); 
			}else {
				break;
			}
		}
	}
}
