package model8;

public class Card {
	
	int idCard;
	int borrowDate;
	int returnDate;
	int idBook;
	
	Student student;
	
	public Card() {
		
	}
	
	public Card(int idCard, int borrowDate, int returnDate, int idBook, Student student) {
		super();
		this.idCard = idCard;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.idBook = idBook;
		this.student = student;
	}

	public int getIdCard() {
		return idCard;
	}

	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}

	public int getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(int borrowDate) {
		this.borrowDate = borrowDate;
	}

	public int getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(int returnDate) {
		this.returnDate = returnDate;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Card [idCard=" + idCard + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + ", idBook="
				+ idBook + ", nameStudent=" + student.getFullname() + "]";
	}
	
	
}
