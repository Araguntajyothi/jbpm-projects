package com.myteam.decisiontablesample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Integer age;

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public Person(java.lang.String name, java.lang.Integer age) {
		this.name = name;
		this.age = age;
	}

}