package ua.prog.students;

public class Main {
		public static void main(String[] args) {
			
			Group arr = new Group();
			try {
				arr.insert(new Student(19, "Petrenko", 12345));
				arr.insert(new Student(20, "Petrov", 12346));
				arr.insert(new Student(22, "Nesterenko", 12347));
				arr.insert(new Student(21, "Shipilin", 12348));
				arr.insert(new Student(19, "Pavliuk", 12349));
				arr.insert(new Student(20, "Andreev", 12355));
				arr.insert(new Student(23, "Ivanov", 12356));
				arr.insert(new Student(25, "Konoplyanka", 12357));
				arr.insert(new Student(20, "Shevchenko", 12358));
				arr.insert(new Student(22, "Rebrov", 12359));
				
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
			
			
			System.out.println(arr);
			System.out.println("*******************************");
			
			
			String searchKey = "Petrov";
			Student found = arr.find(searchKey);
			if (found != null)
			{
			System.out.println("Found "+found.toString());
			} else
			System.out.println("Can't find " + searchKey);
			
			
			System.out.println("*******************************");
			
			arr.delete(12345);
			System.out.println(arr);
			
			
			
	}
}
