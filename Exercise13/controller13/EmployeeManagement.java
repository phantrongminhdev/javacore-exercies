package controller13;

import java.util.ArrayList;
import java.util.List;

import model13.Employee;
import model13.Experience;
import model13.Fresher;
import model13.Intern;

public class EmployeeManagement {
	private List<Employee> employees;
	
	public EmployeeManagement() {
		this.employees = new ArrayList<>();
	}
	
	// thêm 1 nhân viên mới
	public void insert(Employee employee) {
		this.employees.add(employee);
	}
	
	// tìm nhân viên bởi id
	public Employee findById(int id) {
		Employee employee = new Employee();
		for(int i = 0 ; i < this.employees.size() ; i++) {
			if(employees.get(i).getId() == id) {
				employee = employees.get(i);
			}else {
				throw new RuntimeException();
			}
		}		
		return employee;
	}
	// xoá nhân viên bởi id
	public boolean deleteById(int id) {
		Employee employee = this.findById(id);
		if(employee == null) {
			return false;
		}else {
			this.employees.remove(employee);
		}
		return true;
	}
	
	//tìm theo loại
	public List<Employee> findByType(int type){
		List<Employee> employees = new ArrayList<>();
		if(type == 0) {
			Employee employee = new Experience();
			employees.add(employee);
		}
		if(type == 1) {
			Employee employee = new Fresher();
			employees.add(employee);
		}
		
		if(type == 2) {
			Employee employee = new Intern();
			employees.add(employee);
		}
		
		return employees;
	}
	
	// tìm tất cả nhân viên
	public List<Employee> findAll(){
		return this.employees;
	}
}






























