package model14;

import java.util.Date;

public class GoodStudent extends Student{
	private double gpaScore;
	private String bestRewardName;
	
	public GoodStudent() {
		
	}
	
	public GoodStudent(String fullname, Date date, String sex, String phoneNumber, String universityName,
			String gradeLevel , double gpaScore , String bestRewardName) {
		super(fullname , date , sex , phoneNumber , universityName , gradeLevel);
		this.gpaScore = gpaScore;
		this.bestRewardName = bestRewardName;
	}

	public double getGpaScore() {
		return gpaScore;
	}

	public void setGpaScore(double gpaScore) {
		this.gpaScore = gpaScore;
	}

	public String getBestRewardName() {
		return bestRewardName;
	}

	public void setBestRewardName(String bestRewardName) {
		this.bestRewardName = bestRewardName;
	}
	
	public void showInfo() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "GoodStudent [gpaScore=" + gpaScore + ", bestRewardName=" + bestRewardName + ", getFullname()="
				+ getFullname() + ", getDate()=" + getDate() + ", getSex()=" + getSex() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getUniversityName()=" + getUniversityName() + ", getGradeLevel()="
				+ getGradeLevel() + "]";
	}
}
