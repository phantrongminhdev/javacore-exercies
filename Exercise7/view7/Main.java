package view7;

import java.util.Scanner;

import controller7.TeacherManagement;
import model7.Teacher;

public class Main {
	public static void main(String[] args) {
		TeacherManagement teacherManager = new TeacherManagement();
		while(true) {
			System.out.println("Teacher management : ");
			System.out.println("1. Add new teacher");
			System.out.println("2. Delete teacher");
			System.out.println("3. Caculate net salary");
			System.out.println("4. Exit");
			int choice = new Scanner(System.in).nextInt();
			
			if(choice == 1) {
				System.out.println("Enter fullname : ");
				String fullname = new Scanner(System.in).nextLine();
				System.out.println("Enter age : ");
				int age = new Scanner(System.in).nextInt();
				System.out.println("Enter address : ");
				String address = new Scanner(System.in).nextLine();
				System.out.println("Enter id teacher");
				int idTeacher = new Scanner(System.in).nextInt();
				System.out.println("Enter hard salary ");
				double hardSalary = new Scanner(System.in).nextDouble();
				System.out.println("Enter bonusSalary ");
				double bonusSalary = new Scanner(System.in).nextDouble();
				System.out.println("Enter fineMoney ");
				double fineMoney = new Scanner(System.in).nextDouble();
				Teacher teacher = new Teacher( fullname,  age,  address,  idTeacher,  hardSalary,  bonusSalary,fineMoney);
				teacherManager.addTeacher(teacher);
				
			}else if(choice ==2) {
				System.out.println("Enter id need to delete ");
				int id = new Scanner(System.in).nextInt();
				teacherManager.deleteTeacher(id);
			}else if(choice == 3) {
				System.out.println("Enter id need to caculate ");
				int id = new Scanner(System.in).nextInt();
				System.out.println("Net salary is : " + teacherManager.caculateNetSalary(id));
			}else {
				break;
			}
		}
	}
}















