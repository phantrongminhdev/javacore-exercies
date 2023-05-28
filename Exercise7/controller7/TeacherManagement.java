package controller7;

import java.util.ArrayList;
import java.util.List;

import model7.Teacher;

public class TeacherManagement {
	List<Teacher> teacherList ;
	
	public TeacherManagement() {
		this.teacherList = new ArrayList<>();
	}
	
	// add Teacher
	public void addTeacher(Teacher teacher) {
		teacherList.add(teacher);
	}
	//delete
	public void deleteTeacher(int id) {
		for(int i = 0 ; i < teacherList.size();i++) {
			if(teacherList.get(i).getIdTeacher() == id) {
				teacherList.remove(i);
			}
		}
	}
	//caculate net salary
	
	public double caculateNetSalary(int id) {
		Teacher teacher = new Teacher();
		for(int i = 0 ; i < teacherList.size();i++) {
			if(teacherList.get(i).getIdTeacher() == id) {
				teacher = teacherList.get(i);
			}
		}
		
		return teacher.getHardSalary() + teacher.getBonusSalary() - teacher.getFineMoney();
	}
}
