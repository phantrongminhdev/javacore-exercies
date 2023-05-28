package model7;

public class Teacher {
	private String fullname;
	private int age;
	private String address;
	private int idTeacher;
	private double hardSalary;// lương cứng
	private double bonusSalary; // lương thưởng
	private double fineMoney; // tiền phạt

	public Teacher() {

	}

	public Teacher(String fullname, int age, String address, int idTeacher, double hardSalary, double bonusSalary,
			double fineMoney) {
		this.fullname = fullname;
		this.age = age;
		this.address = address;
		this.idTeacher = idTeacher;
		this.hardSalary = hardSalary;
		this.bonusSalary = bonusSalary;
		this.fineMoney = fineMoney;

	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public double getHardSalary() {
		return hardSalary;
	}

	public void setHardSalary(double hardSalary) {
		this.hardSalary = hardSalary;
	}

	public double getBonusSalary() {
		return bonusSalary;
	}

	public void setBonusSalary(double bonusSalary) {
		this.bonusSalary = bonusSalary;
	}

	public double getFineMoney() {
		return fineMoney;
	}

	public void setFineMoney(double fineMoney) {
		this.fineMoney = fineMoney;
	}

	@Override
	public String toString() {
		return "Teacher [fullname=" + fullname + ", age=" + age + ", address=" + address + ", idTeacher=" + idTeacher
				+ ", hardSalary=" + hardSalary + ", bonusSalary=" + bonusSalary + ", fineMoney=" + fineMoney + "]";
	}

}
