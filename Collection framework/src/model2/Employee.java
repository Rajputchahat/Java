package model2;

public class Employee {
	//Instance variable
	private int id,salary;
	private String name,designation;
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignation(String dsg) {
		this.designation = dsg;
	}
	public void setSalary(int salary) {
		this.salary= salary;
	}
	//Getter
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public int getSalary() {
		return salary;
	}
	
	
	
	
	

}
