package model2;

public class Book extends Document {
	private String nameAuthor;
	private int numberPage;

	public Book() {

	}

	public Book(int id, String namePublisher, int numberPublisher, String nameAuthor, int numberPage) {
		super(id, namePublisher, numberPublisher);
		this.nameAuthor = nameAuthor;
		this.numberPage = numberPage;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public int getNumberPage() {
		return numberPage;
	}

	public void setNumberPage(int numberPage) {
		this.numberPage = numberPage;
	}

	@Override
	public String toString() {
		return "Book [nameAuthor=" + nameAuthor + ", numberPage=" + numberPage + ", getId=" + getId()
				+ ", NamePublisher=" + getNamePublisher() + ", NumberPublisher=" + getNumberPublisher() + "]";
	}
}





