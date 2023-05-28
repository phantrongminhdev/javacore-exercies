package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model14.GoodStudent;
import model14.NormalStudent;
import model14.Student;

public class StudentManagement {
	List<Student> studentList;

	public StudentManagement() {
		this.studentList = new ArrayList<>();
	}

	// add
	public void addStudent(Student student) {
		this.studentList.add(student);
	}

	// filter goodStudent
	public void filterGoodStudent(List<GoodStudent> studentList) {
		System.out.println("Thong tin cac ung vien gioi trung tuyen la : ");
		if (studentList.size() <= 15) {
			studentList.forEach((st) -> st.toString());
		} else if(studentList.size() > 15) {
			Collections.sort(studentList, new Comparator<GoodStudent>() {
				public int compare(GoodStudent o1, GoodStudent o2) {
					if(o1.getGpaScore() > o2.getGpaScore()) {
						return 1;
					}else if(o1.getGpaScore() < o2.getGpaScore()) {
						return -1;
					}else {
						return o1.getFullname().compareTo(o2.getFullname());
					}
				};
			});
		}else if(studentList.size() < 11) {
			
		}
		// đảo ngược list
		Collections.reverse(studentList);
		
		studentList.forEach((st) -> System.out.println(st.toString()));
	}
	
	// filter normalStudent
	public void filterNormalStudent(List<NormalStudent> studentList) {
		System.out.println("Thong tin cac ung vien trung binh trung tuyen la : ");
		Collections.sort(studentList , new Comparator<NormalStudent>() {
			public int compare(NormalStudent o1, NormalStudent o2) {
				if(o1.getEntryTestScore() > o2.getEntryTestScore()) {
					return 1;
				}else if(o1.getEntryTestScore() < o2.getEntryTestScore()) {
					return -1;
				}else {
					if(o1.getToeicScore() > o1.getToeicScore()) {
						return 1;
					}else if(o1.getToeicScore() < o1.getToeicScore()) {
						return -1;
					}else {
						return o1.getFullname().compareTo(o2.getFullname());
					}
				}
			};
		});
		
		Collections.reverse(studentList);
		studentList.forEach((st) -> System.out.println(st.toString()));
	}
	
	// show list fullname giảm dần và phonenumber tăng dần
	public void showFullnameAndPhoneNumberListStudent(List<Student> studentList) {
		Collections.sort(studentList , new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFullname().compareToIgnoreCase(o2.getFullname()) & o2.getPhoneNumber().compareTo(o1.getPhoneNumber());
			}
		});
		studentList.forEach((st) -> System.out.println(st.toString()));
	}
	
	
}





















