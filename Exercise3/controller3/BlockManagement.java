package controller3;

import java.util.ArrayList;
import java.util.List;

import model3.Block;

public class BlockManagement {
	
	List<Block> blockList;
	
	public BlockManagement() {
		this.blockList = new ArrayList<>();
	}
	
	// add new student
	public void addStudent(Block block) {
		this.blockList.add(block);
	}
	//show info student and block
	public void showBlockStudent() {
		this.blockList.forEach(o -> System.out.println(o.toString()));
	}
	
	// find by idNumber
	public void findByIdNumber(int id) {
		for(Block block : blockList) {
			if(block.getIdNumber() == id) {
				System.out.println(block.toString());
			}
		}
	}
}
