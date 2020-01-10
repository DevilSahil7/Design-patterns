package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private List<String> empList;
	public Employee() {
		empList = new ArrayList<String>();
	}
	public Employee(List<String> list) {
		this.empList = list;
	}
	public void loadData() {
		empList.add("sahil");
		empList.add("ganesh");
		empList.add("mayur");
		empList.add("omkar");
	}
	public List<String> getEmpList(){
		return empList;
	}
	
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employee(temp);
	}
	
}
