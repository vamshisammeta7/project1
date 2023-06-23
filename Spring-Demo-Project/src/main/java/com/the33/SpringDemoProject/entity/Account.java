package com.the33.SpringDemoProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String gender;
	private Long age;
	public Account(Long id, String name, String gender, Long age) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Account() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
