package com.test.services;

import java.util.List;

import com.test.entities.Employee;

public interface DataService {
	
	public int insertRow(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int updateRow(Employee employee);

	public int deleteRow(int id);

}
