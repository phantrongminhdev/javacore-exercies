package controller2;

import java.util.ArrayList;
import java.util.List;

import model2.Document;

public class DocumentManagement {

	List<Document> documentList;
	
	public DocumentManagement() {
		this.documentList = new ArrayList<>();
	}
	
	// add document
	public void addDocument(Document document) {
		this.documentList.add(document);
	}
	
	// delete document by id
	public void deleteDocument(int id) {
		for(Document document : documentList) {
			if(document.getId() == id) {
				this.documentList.remove(document);
			}
		}
	}
	// show information about document
	public void showInforDoc() {
		documentList.forEach(o -> System.out.println(o.toString()));
	}
	
	//search document by type( book , magazine , paper)
	
}
