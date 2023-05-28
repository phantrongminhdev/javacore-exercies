package model4;

import java.util.ArrayList;
import java.util.List;

public class Town {
	List<Family> familyList;
		
	public Town() {
		this.familyList = new ArrayList<>();
	}

	public List<Family> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(List<Family> familyList) {
		this.familyList = familyList;
	}
	
	public void addFamily(Family family) {
		this.familyList.add(family);
	}
}
