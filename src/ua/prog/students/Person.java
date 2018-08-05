package ua.prog.students;

public class Person {
	
	 private int age;
	 private String firstName;
	 private String lastName;
	 private boolean sex;
	
	
	public Person() {
		super();
	}
	public Person(int age, String firstName, String lastName, boolean sex) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFisrtName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + "]";
	}
	

}
