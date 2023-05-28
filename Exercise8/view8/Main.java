package view8;

import java.util.Scanner;

import controller8.CardManagement;
import model8.Card;
import model8.Student;

public class Main {
	public static void main(String[] args) {
		CardManagement cardM = new CardManagement();

		while (true) {
			System.out.println("Card management : ");
			System.out.println("1. Add new card");
			System.out.println("2. Delete card");
			System.out.println("3. Show card");
			System.out.println("4. Exit");
			int choice = new Scanner(System.in).nextInt();

			if (choice == 1) {
				System.out.println("Enter fullname student: ");
				String fullname = new Scanner(System.in).nextLine();
				System.out.println("Enter age student: ");
				int age = new Scanner(System.in).nextInt();
				System.out.println("Enter classname student : ");
				String nameClassStudent = new Scanner(System.in).nextLine();

				System.out.println("Enter id card");
				int idCard = new Scanner(System.in).nextInt();
				System.out.println("Enter borrow date ");
				int borrowDate = new Scanner(System.in).nextInt();
				System.out.println("Enter return date ");
				int returnDate = new Scanner(System.in).nextInt();
				System.out.println("Enter id book ");
				int idBook = new Scanner(System.in).nextInt();

				Student student = new Student(fullname, age, nameClassStudent);

				Card card = new Card(idCard, borrowDate, returnDate, idBook, student);
				cardM.addCard(card);

			} else if (choice == 2) {
				System.out.println("Enter id need to delete ");
				int id = new Scanner(System.in).nextInt();
				cardM.deleteCardByid(id);
			} else if (choice == 3) {
				cardM.showListCard();
			} else {
				break;
			}
		}
	}

}
