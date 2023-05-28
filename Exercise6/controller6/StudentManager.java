package controller6;

import java.util.ArrayList;
import java.util.List;

import model6.Student;

public class StudentManager {
	List<Student> studentList;
	
	public void StudentManager() {
		this.studentList = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void showStudentAge20() {
		for(Student student : studentList) {
			if(student.getAge() == 20) {
				student.toString();
			}
		}
	}
	
	public void showStudentAge23() {
		int count = 0;
		for(Student student : studentList) {
			if(student.getAge() == 23 && student.getAddress().equals("DN")) {
				count++;
			}
		}
		System.out.println("Count = " + count);
	}
}
