package ua.prog.students;

public class Student extends Person  {
	
	private int studentID;
	private String group;
	
	public Student() {
		super();
		
	}

	
	public Student(int age, String firstName, String lastName, boolean sex, int studentID, String group) {
		super(age, firstName, lastName, sex);
		this.studentID = studentID;
		this.group = group;
		
	}
	
	

	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	@Override
	public String toString() {
		return super.toString()+ " ,group "+group+ ", student ID = "+studentID;
	}

    //sorting by last Name (Interface Comparable)
	/*
	@Override
	public int compareTo(Student other) {
		
		return this.getLastName().compareTo(other.getLastName());
	}
	*/
}
