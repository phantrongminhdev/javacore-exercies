package view2;

import java.util.Scanner;

import controller2.DocumentManagement;
import model2.Book;
import model2.Document;
import model2.Magazine;
import model2.Paper;

public class DocumentMain {
	public static void main(String[] args) {
		DocumentManagement bookManagement = new DocumentManagement();
		DocumentManagement magazineManagement = new DocumentManagement();
		DocumentManagement paperManagement = new DocumentManagement();
		while (true) {
			System.out.println("--------Document Management--------");
			System.out.println("1. Add document");
			System.out.println("2. Search document by type");
			System.out.println("3. Show list document");
			System.out.println("4. Delete document by id");
			System.out.println("4. Exit");
			System.out.println("Enter your choice :");

			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				// add document
				System.out.println("Enter id : ");
				int id = new Scanner(System.in).nextInt();

				System.out.println("Enter name publisher :");
				String namePublisher = new Scanner(System.in).nextLine();

				System.out.println("Enter number publisher :");
				int numberPublisher = new Scanner(System.in).nextInt();

				System.out.println("Which type of document do you want to add ?");
				TypeDocument();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();

				if (choiceType == 1) {
					System.out.println("Enter name author :");
					String nameAuthor = new Scanner(System.in).nextLine();
					System.out.println("Enter number page:");
					int numberPage = new Scanner(System.in).nextInt();

					Document book = new Book(id, namePublisher, numberPublisher, nameAuthor, numberPage);
					bookManagement.addDocument(book);
					System.out.println("add book done!!!");

				} else if (choiceType == 2) {
					System.out.println("Enter number : ");
					int number = new Scanner(System.in).nextInt();

					System.out.println("Enter month : ");
					int month = new Scanner(System.in).nextInt();

					Document magazine = new Magazine(id, namePublisher, numberPublisher, number, month);
					magazineManagement.addDocument(magazine);
					System.out.println("add magazine done!!!");

				} else if (choiceType == 3) {

					System.out.println("Enter day : ");
					int day = new Scanner(System.in).nextInt();
					Document paper = new Paper(id, namePublisher, numberPublisher, day);
					paperManagement.addDocument(paper);
					System.out.println("add paper done!!!");
				}
			} else if (choice == 2) {
				// search document

				System.out.println("Which type of document do  you want to search ?");
				TypeDocument();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();

				if (choiceType == 1) {
					// search book
				} else if (choiceType == 2) {
					// search magazine
				} else if (choiceType == 3) {
					// search paper
				}

			} else if (choice == 3) {
				// show list document
				System.out.println("Which type of list documnet do you want to show ?");
				TypeDocument();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();
				if (choiceType == 1) {
					bookManagement.showInforDoc();
				} else if (choiceType == 2) {
					magazineManagement.showInforDoc();
				} else if (choiceType == 3) {
					paperManagement.showInforDoc();
				}
			} else if (choice == 4) {
				// show list document
				System.out.println("Enter id of documnet that you want to delete : ");
				int id = new Scanner(System.in).nextInt();

				System.out.println("Which type of documnet do you want to delete ?");
				TypeDocument();
				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();
				if (choiceType == 1) {
					bookManagement.deleteDocument(id);
				} else if (choiceType == 2) {
					magazineManagement.deleteDocument(id);
				} else if (choiceType == 3) {
					paperManagement.deleteDocument(id);
				}
			} else {
				break;
			}
		}
	}

	public static void TypeDocument() {
		System.out.println("1. Book");
		System.out.println("2. Magazine");
		System.out.println("3. Paper");
	}
}
