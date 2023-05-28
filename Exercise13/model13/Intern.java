package model13;

import java.util.Date;
import java.util.List;

public class Intern extends Employee{
	private String majors;
	private String semester;
	private String university;
	
	public Intern() {
		
	}
	
	public Intern(int id, String fullname, Date birthday, String phone, String email,
			List<Certificate> certificates , String majors , String semester , String university) {
		super(id, fullname, birthday, phone, email,certificates);
		this.majors = majors;
		this.semester = semester;
		this.university = university;
	}
	
	
	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public void showInformation() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Intern [majors=" + majors + ", semester=" + semester + ", university=" + university + ", getId()="
				+ getId() + ", getFullname()=" + getFullname() + ", getBirthday()=" + getBirthday() + ", getPhone()="
				+ getPhone() + ", getEmail()=" + getEmail() + ", getCertificates()=" + getCertificates()
				+ "]";
	}
	
	
}
