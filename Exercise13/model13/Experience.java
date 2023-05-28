package model13;

import java.util.Date;
import java.util.List;

public class Experience extends Employee{
	private int experienceOfYear;
	private String proSkill;
	
	public Experience() {
		
	}
	public Experience(int id, String fullname, Date birthday, String phone, String email,
			List<Certificate> certificates , int experienceOfYear , String proSkill) {
		// TODO Auto-generated method stub
		super(id, fullname, birthday, phone, email,certificates);
		this.experienceOfYear = experienceOfYear;
		this.proSkill = proSkill;
	}
	
	public int getExperienceOfYear() {
		return experienceOfYear;
	}
	public void setExperienceOfYear(int experienceOfYear) {
		this.experienceOfYear = experienceOfYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	@Override
	public void showInformation() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Experience [experienceOfYear=" + experienceOfYear + ", proSkill=" + proSkill + ", getId()=" + getId()
				+ ", getFullname()=" + getFullname() + ", getBirthday()=" + getBirthday() + ", getPhone()=" + getPhone()
				+ ", getEmail()=" + getEmail() 
				+ ", getCertificates()=" + getCertificates() + "]";
	}
}
