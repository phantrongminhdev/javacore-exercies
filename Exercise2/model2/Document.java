package model2;

public class Document {
	private int id;
	private String namePublisher;
	private int numberPublisher;
	
	public Document() {
		
	}
	
	public Document(int id , String namePublisher , int numberPublisher) {
		this.id = id;
		this.namePublisher = namePublisher;
		this.numberPublisher = numberPublisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamePublisher() {
		return namePublisher;
	}

	public void setNamePublisher(String namePublisher) {
		this.namePublisher = namePublisher;
	}

	public int getNumberPublisher() {
		return numberPublisher;
	}

	public void setNumberPublisher(int numberPublisher) {
		this.numberPublisher = numberPublisher;
	}
	
	
}
