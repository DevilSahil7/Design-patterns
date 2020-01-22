package com.designpattern.prototype;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		emp.loadData();
		Employee empNew = (Employee) emp.clone();
		Employee empNew1 = (Employee) emp.clone();
		List<String> list = empNew.getEmpList();
		list.add("john");
		List<String> list1 = empNew1.getEmpList();
		list1.remove("ganesh");
		System.out.println("emp list: "+emp.getEmpList());
		System.out.println("empNew List: "+list);
		System.out.println("empNew1 List: "+list1);

	}

}
