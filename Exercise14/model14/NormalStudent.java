package model14;

import java.util.Date;

public class NormalStudent extends Student{
	private int toeicScore;
	private double entryTestScore;
	
	public NormalStudent() {
		
	}
	
	public NormalStudent(String fullname, Date date, String sex, String phoneNumber, String universityName,
			String gradeLevel , int toeicScore , double entryTestScore) {
		super(fullname , date , sex , phoneNumber , universityName , gradeLevel );
		this.toeicScore = toeicScore;
		this.entryTestScore = entryTestScore;
	}

	public int getToeicScore() {
		return toeicScore;
	}

	public void setToeicScore(int toeicScore) {
		this.toeicScore = toeicScore;
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore(double entryTestScore) {
		this.entryTestScore = entryTestScore;
	}
	
	public void showInfo() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "NormalStudent [toeicScore=" + toeicScore + ", entryTestScore=" + entryTestScore + ", getFullname()="
				+ getFullname() + ", getDate()=" + getDate() + ", getSex()=" + getSex() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getUniversityName()=" + getUniversityName() + ", getGradeLevel()="
				+ getGradeLevel()+ "]";
	}
	
	
}
