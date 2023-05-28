package model15;

import java.util.Date;
import java.util.List;

public class Student {
	private int studentCode;
	private String fullname;
	private String date;
	private int yearLearned;
	private double inScore;
	private List<StudyResult> studyResults;
	
	public Student() {
		
	}
	
	
	public Student(int studentCode, String fullname, String date, int yearLearned, double inScore,
			List<StudyResult> studyResults) {
		super();
		this.studentCode = studentCode;
		this.fullname = fullname;
		this.date = date;
		this.yearLearned = yearLearned;
		this.inScore = inScore;
		this.studyResults = studyResults;
	}


	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getYearLearned() {
		return yearLearned;
	}

	public void setYearLearned(int yearLearned) {
		this.yearLearned = yearLearned;
	}

	public double getInScore() {
		return inScore;
	}

	public void setInScore(double inScore) {
		this.inScore = inScore;
	}

	public List<StudyResult> getStudyResults() {
		return studyResults;
	}

	public void setStudyResults(List<StudyResult> studyResults) {
		this.studyResults = studyResults;
	}
	
	
}
