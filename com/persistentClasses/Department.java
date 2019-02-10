package com.persistentClasses;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="department")
public class Department{

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column
	private String deptName;

	public Department(){

	}

	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id = id;
	}
	public String getDeptName(){
		return deptName;
	}
	public void setDeptName(String deptName){
		this.deptName = deptName;
	}
}