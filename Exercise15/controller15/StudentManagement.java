package controller15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model15.InServiceStudent;
import model15.RegularStudent;
import model15.Student;
import model15.StudyResult;


//private int studentCode;
//private String fullname;
//private Date date;
//private int yearLearned;
//private double inScore;
//private List<StudyResult> studyResults;

public class StudentManagement {
	List<RegularStudent> regularStudentList = new ArrayList<>();
	
	public Student inputStudent() {
		Student student = new Student();
		System.out.println("enter student code :");
		student.setStudentCode(new Scanner(System.in).nextInt());
		
		System.out.println("enter student full name");
		student.setFullname(new Scanner(System.in).nextLine());
		
		System.out.println("enter date :");
		student.setDate(new Scanner(System.in).nextLine());
		
		System.out.println("enter year learned :");
		student.setYearLearned(new Scanner(System.in).nextInt());
		
		System.out.println("enter inscore : ");
		student.setInScore(new Scanner(System.in).nextDouble());
		
		StudyResult studyResult = new StudyResult();
		
		System.out.println("enter avg score :");
		studyResult.setAvgScore(new Scanner(System.in).nextDouble());
		
		System.out.println("enter semester : ");
		studyResult.setSemester(new Scanner(System.in).nextLine());
		
		List<StudyResult> studyResults = new ArrayList<>();
		studyResults.add(studyResult);
		student.setStudyResults(studyResults);
		
		return student;
	}
	
	public void inputTypeStudent(Student student) {
		System.out.println("Insert type : ");
		System.out.println("1.Regular student : ");
		System.out.println("2.Inservice student : ");
		int chocie = new Scanner(System.in).nextInt();
		student = this.inputStudent();
		if(chocie == 1) {
			RegularStudent regularStudent = (RegularStudent) student;
			this.regularStudentList.add(regularStudent);
		}else if(chocie == 2) {
			InServiceStudent inserviceStudent = (InServiceStudent) student;
			System.out.println("enter nameTrainingLink: ");
			inserviceStudent.setNameTrainingLink(new Scanner(System.in).nextLine());
		}
	}
	
	
	
	public void outputTypeStudent(Student student ) {
		
		System.out.println("Information regular student : " + student.toString());
		System.out.println("Information inservice student : ");
		InServiceStudent inServiceStudent = (InServiceStudent) student;
		System.out.println("nameTrainingLink : " + inServiceStudent.getNameTrainingLink());
	}
	
	public void caculateAvgScore(Student student) {
		List<StudyResult>  listStudyResult= student.getStudyResults();
		listStudyResult.forEach((e) -> System.out.println("semester : " + e.getSemester() + "avg : " + e.getAvgScore()));
	}
}



















