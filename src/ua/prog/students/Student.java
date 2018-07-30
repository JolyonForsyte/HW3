package ua.prog.students;

public class Student extends Person{
	
	private int studentID;
	
	public Student() {
		super();
		
	}

	
	public Student(int age, String name, int studentID) {
		super(age, name);
		this.studentID = studentID;
	}
	
	

	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	@Override
	public String toString() {
		return super.toString()+", student ID = "+studentID +"]";
	}

}
