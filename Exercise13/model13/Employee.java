package model13;

import java.util.Date;
import java.util.List;

public class Employee {
	private int id;
	private String fullname;
	private Date birthday;
	private String phone;
	private String email;
	private static int countEmployee = 0;
	private List<Certificate> certificates;

	public Employee() {

	}

	public Employee(int id, String fullname, Date birthday, String phone, String email,
			List<Certificate> certificates) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.certificates = certificates;
	}

	public void showInformation() {
		
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getCountEmployee() {
		return countEmployee;
	}

	public static void setCountEmployee(int countEmployee) {
		Employee.countEmployee = countEmployee;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}
}
