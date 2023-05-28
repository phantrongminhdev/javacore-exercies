package view6;

import java.util.Scanner;

import controller6.StudentManager;
import model6.Student;

public class Main {
	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		while(true) {
			System.out.println("Student management : ");
			System.out.println("1. Add new student");
			System.out.println("2. Show student age 20");
			System.out.println("3. Show student age 23");
			System.out.println("Enter your choice");
			int choice = new Scanner(System.in).nextInt();
			
			if(choice == 1) {
				System.out.println("Enter fullname : ");
				String fullname = new Scanner(System.in).nextLine();
				System.out.println("Enter age : ");
				int age = new Scanner(System.in).nextInt();
				System.out.println("Enter address : ");
				String address = new Scanner(System.in).nextLine();
				System.out.println("Enter class student");
				String classStudent = new Scanner(System.in).nextLine();
				
				Student student = new Student(fullname , age , address , classStudent);
				studentManager.addStudent(student);
				
			}else if(choice ==2) {
				studentManager.showStudentAge20();
			}else if(choice == 3) {
				studentManager.showStudentAge23();
			}else {
				break;
			}
		}
	}
}

