package ua.prog.students;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Group implements Voenkom {
	private String groupName;
	
	private Student[] stud = new Student[10];
	
	
	
	public Group() {
		super();
		this.groupName = "unknown";
	
	}
	
	
	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}
	


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	
	public void insertInteractive() throws MyException {
		Student student = new Student();
		
		student.setFirstName(JOptionPane.showInputDialog(null, "Enter first name: "));
		student.setLastName(JOptionPane.showInputDialog(null, "Enter last name: "));
		student.setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter age: ")));
		student.setGroup(JOptionPane.showInputDialog(null, "Enter the group: "));
		student.setSex(Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Enter the gender: ")));
		student.setStudentID(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the student ID: ")));
	
	for (int i = 0; i < stud.length; i++) {
		if(stud[i] == null) {
			student.setGroup(this.groupName);
			stud[i] = student;
			System.out.println("Student " + stud[i].getLastName() + " added.");
			return;
		}
	}throw new MyException();
	
	}

	public void insert(Student student) throws MyException{
		for (int i = 0; i < stud.length; i++) {
			if(stud[i] == null) {
				student.setGroup(this.groupName);
				stud[i] = student;
				return;
			}
		}
		throw new MyException();
	}
	
	public Student find (String searchName) 
	{
		for (Student student : stud) {
			if(student!=null&&student.getLastName().equals(searchName)) {
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
	
	
	private static Comparator<Student> nameComp = new Comparator<Student>() {

		@Override
		public int compare(Student e1, Student e2) {
			return e1.getLastName().compareTo(e2.getLastName());
		}
	};
	
	private static Comparator<Student>ageComp = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getAge() -o2.getAge();
			
		}
		
	};
	
	private static Comparator<Student> idComp = new Comparator<Student>() {

		@Override
		public int compare(Student a1, Student a2) {
			return a1.getStudentID() -a2.getStudentID();
			
		}
		
	};
	
	public void sortByName() {
		Arrays.sort(stud, nameComp);
	}
	
	public void sortByAge() {
		Arrays.sort(stud,ageComp);
	}
	
	public void sortById() {
		Arrays.sort(stud, idComp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stud.length; i++) {
			if(stud[i]!= null) {
				sb.append(stud[i]);
			}
			
			//e.g.use of Age Comparator
			sortByAge();
		
			
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	

}


	@Override
	public Student[] getSoldiers() {
		
		int n = 0;
		for (Student student : stud) {
			if(student!=null&& student.isSex() && student.getAge()>=18) {
				n++;
			}
		}
		Student[] soldier = new Student[n];
		int i = 0;
		
		for (Student student : this.stud) {
			if(student!=null&& student.isSex() && student.getAge()>=18) {
				soldier[i++] = student;
			}
			
		}
		return soldier;
		
		
		
		
	}
	
	
	//writing output into csv file
	
	public void writeIntoFile(File out) {
		try {
			FileWriter writer = new FileWriter(out);
			
			for(Student arr : stud) {
				String append = " ";
				writer.write(append + arr);
				append = ",  ";
				writer.write("\n");
			}
			
	        writer.flush();
	        writer.close();
		
	}
		catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	

}
