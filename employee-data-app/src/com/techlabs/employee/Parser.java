package com.techlabs.employee;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Parser {

	private String[] employeeData;
	private int idIndex = 0;
	private int nameIndex = 1;
	private int designationIndex = 2;
	private int managerIDIndex = 3;
	private int DOJIndex = 4;
	private int salaryIndex = 5;
	private int comissionIndex = 6;
	private int departmentNoIndex = 7;

	Map<Employee, Employee> employees = new TreeMap<Employee, Employee>();

	public Parser(FileLoader fileLoader) throws IOException{

		this(ToStringConverter.getDataString(fileLoader.getBufferReader()));
	}

	public Parser(LinkLoader linkLoader) throws IOException {

		this(ToStringConverter.getDataString(linkLoader.getBufferReader()));
	}

	public Parser(String dataString) throws IOException {

		String[] employeeRow = dataString.split("\n");

		for (String employee : employeeRow) {
			employeeData = employee.split(",");

			if (employeeData[managerIDIndex].equals("NULL")) {
				employeeData[managerIDIndex] = "0";

			}
			if (employeeData[comissionIndex].equals("NULL")) {
				employeeData[comissionIndex] = "0";
			}
			employees.put(new Employee(Integer.parseInt(employeeData[idIndex]), employeeData[nameIndex],
					employeeData[designationIndex], Integer.parseInt(employeeData[managerIDIndex]),
					employeeData[DOJIndex], Double.parseDouble(employeeData[salaryIndex]),
					Integer.parseInt(employeeData[comissionIndex]), Integer.parseInt(employeeData[departmentNoIndex])),
					null);
		}
	}

}
