package view3;

import java.util.Scanner;

import controller3.BlockManagement;
import model3.BlockA;
import model3.BlockB;
import model3.BlockC;

public class BlockMain {
	public static void main(String[] args) {
		BlockManagement blockAManagement = new BlockManagement();
		BlockManagement blockBManagement = new BlockManagement();
		BlockManagement blockCManagement = new BlockManagement();

		while (true) {
			System.out.println("--------Block Management--------");
			System.out.println("1. Add new student");
			System.out.println("2. Show list student");
			System.out.println("3. Find by id number");
			System.out.println("4. Exit");
			System.out.println("Enter your choice :");

			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				// add student
				System.out.println("Enter id number : ");
				int idNumber = new Scanner(System.in).nextInt();

				System.out.println("Enter name student :");
				String nameStudent = new Scanner(System.in).nextLine();

				System.out.println("Enter address :");
				String address = new Scanner(System.in).nextLine();

				System.out.println("Enter priority :");
				String priority = new Scanner(System.in).nextLine();

				System.out.println("Which type of block do you want to add ?");
				TypeBlock();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();

				if (choiceType == 1) {
					BlockA blockA = new BlockA(idNumber, nameStudent, address, priority);
					blockAManagement.addStudent(blockA);
					System.out.println("add student blockA done!!!");

				} else if (choiceType == 2) {
					BlockB blockB = new BlockB(idNumber, nameStudent, address, priority);
					blockBManagement.addStudent(blockB);
					System.out.println("add student blockB done!!!");

				} else if (choiceType == 3) {

					BlockC blockC = new BlockC(idNumber, nameStudent, address, priority);
					blockCManagement.addStudent(blockC);
					System.out.println("add student blockC done!!!");
				}
			} else if (choice == 2) {
				// show list student

				System.out.println("Which type of block do  you want to search ?");
				TypeBlock();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();

				if (choiceType == 1) {
					blockAManagement.showBlockStudent();
				} else if (choiceType == 2) {
					blockBManagement.showBlockStudent();
				} else if (choiceType == 3) {
					blockCManagement.showBlockStudent();
				}

			} else if (choice == 3) {
				System.out.println("Enter id that you want to find : ");
				int id = new Scanner(System.in).nextInt();
				// show list document
				System.out.println("Which type of list block do you want to find ?");
				TypeBlock();

				System.out.println("Enter your choice :");
				int choiceType = new Scanner(System.in).nextInt();
				if (choiceType == 1) {
					 blockAManagement.findByIdNumber(id);
				} else if (choiceType == 2) {
					blockBManagement.findByIdNumber(id);
				} else if (choiceType == 3) {
					blockCManagement.findByIdNumber(id);
				}
			} else {
				break;
			}
		}
	}

	public static void TypeBlock() {
		System.out.println("1. Block A");
		System.out.println("2. Block B");
		System.out.println("3. Block C");
	}
}
