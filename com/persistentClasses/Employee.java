package com.persistentClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="employee")
public class Employee{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="fistname")
	private String firstName;

	@Column(name="salary")
	private double salary;

	@JoinColumn(name="department")
	@ManyToOne
	private Department department;

	public Employee(){

	}
	public void setId(long id){
		this.id = id;
	}
	public long getId(){
		return id;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public Department getDepartment(){
		return department;
	}
	public void setDepartment(Department department){
		this.department = department;
	}
	@Override
	public String toString() {
		return "\nEmployee"
				+"\n id: "+this.getId()
				+"\n first name: "+this.getFirstName()
				+"\n salary: "+this.getSalary()
				+"\n department: "+this.getDepartment().getDeptName();
	}
}