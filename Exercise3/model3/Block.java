package model3;

public class Block {
	private int idNumber;
	private String nameStudent;
	private String address;
	private String priority;

	public Block() {
		
	}

	public Block(int idNumber, String nameStudent, String address, String priority) {
		this.idNumber = idNumber;
		this.nameStudent = nameStudent;
		this.address = address;
		this.priority = priority;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
}
