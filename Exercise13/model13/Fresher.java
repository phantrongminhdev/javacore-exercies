package model13;

import java.util.Date;
import java.util.List;

public class Fresher extends Employee{
	
	private Date date;
	private String graduationRank;
	private String university;
	
	public Fresher() {
		
	}
	
	public Fresher(int id, String fullname, Date birthday, String phone, String email,
			List<Certificate> certificates , Date date , String graduationRank , String university) {
		super(id, fullname, birthday, phone, email,certificates);
		this.date = date;
		this.graduationRank = graduationRank;
		this.university = university;
	}
	
	@Override
	public void showInformation() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Fresher [date=" + date + ", graduationRank=" + graduationRank + ", university=" + university
				+ ", getId()=" + getId() + ", getFullname()=" + getFullname() + ", getBirthday()=" + getBirthday()
				+ ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getCertificates()="
				+ getCertificates() + "]";
	}
}
