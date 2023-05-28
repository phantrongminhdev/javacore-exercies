package model5;

public class Person {
	private String fullname;
	private int age;
    private int idNumber;
    private int numberRent;
    private Room room;
    
    public Person() {
    	
    }
    
    public Person(String fullname , int age , int idNumber , Room room , int numberRent) {
    	this.fullname = fullname;
    	this.age = age;
    	this.idNumber = idNumber;
    	this.room = room;
    	this.numberRent = numberRent;
    }

	public int getNumberRent() {
		return numberRent;
	}

	public void setNumberRent(int numberRent) {
		this.numberRent = numberRent;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}   
	
	
}
