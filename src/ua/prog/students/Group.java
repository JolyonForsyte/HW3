package ua.prog.students;

import java.util.Arrays;
import java.util.Iterator;

public class Group {
	
	private Student[] stud = new Student[10];
	
	
	public Group() {
		super();
	
	}
	
	public void insert(Student student) throws MyException{
		for (int i = 0; i < stud.length; i++) {
			if(stud[i] == null) {
				stud[i] = student;
				return;
			}
		}
		throw new MyException();
	}
	
	public Student find (String searchName) 
	{
		for (Student student : stud) {
			if(student!=null&&student.getName().equals(searchName)) {
				return student;
			}
		}
		return null;
	}
	
	public boolean delete(int number) {
		for (int i = 0; i < stud.length; i++) {
			if(stud[i] !=null && stud[i].getStudentID()==number) {
				stud[i]=null;
				return true;
			}
		}
		return false;

	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stud.length; i++) {
			if(stud[i]!= null) {
				sb.append(stud[i]);
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	

}
}
