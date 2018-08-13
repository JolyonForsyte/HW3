package ua.prog.students;

import java.io.File;
import java.util.Iterator;

public class Main {
		public static void main(String[] args) {
			
			Group arr = new Group("AN 143");
			try {
				arr.insert(new Student(19,"Ivan", "Petrenko",true, 12345, "AN 143"));
				arr.insert(new Student(20,"Dima", "Petrov",true, 12346, "AN 143"));
				arr.insert(new Student(22,"Darja", "Nesterenko",false, 12347, "AN 143"));
				arr.insert(new Student(21, "Ivan", "Shipilin",true,  12348, "AN 143"));
				arr.insert(new Student(19, "Olga", "Pavliuk",false, 12349, "AN 143"));
				arr.insert(new Student(20, "Alex", "Andreev",true,  12355,"AN 143"));
				arr.insert(new Student(23, "Andrew", "Ivanov", true, 12356, "AN 143"));
				arr.insert(new Student(25, "Evg", "Konoplyanka",true, 12357, "AN 143"));
				arr.insert(new Student(20,"Andrej", "Shevchenko",true,  12358,"AN 143"));
				arr.insert(new Student(22, "Serg","Rebrov", true, 12359, "AN 143"));
				//arr.insertInteractive();
				
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
			
			
			arr.writeIntoFile(new File("students.csv"));
			System.out.println(arr);
			
			System.out.println("*******************************");
			Student[] soldier = arr.getSoldiers();
			for (Student student : soldier) {
			System.out.println("Recruited for army: " + student);
	}
			
}
}
