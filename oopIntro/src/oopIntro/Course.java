package oopIntro;

public class Course {

	public Course(int id, String name, int instructorId) {
		this.id = id;
		this.name = name;
		this.instructorId = instructorId;
	}

	int id;
	String name;
	int instructorId;
}

//public class Instructor {
//
//	public Instructor(int id, String firstName, String lastName) {
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//
//	int id;
//	String firstName;
//	String lastName;}
//}
//
//
//public class CourseManager {
//
//	public void add(Course course) {
//		
//		System.out.println("--------------");
//		System.out.println("Veritabanina eklenen kurs bilgileri");
//		System.out.println("ID: " + course.id);
//		System.out.println("NAME: " + course.name);
//		System.out.println("INSTRUCTOR ID: " + course.instructorId);
//		System.out.println("--------------");
//	}
//	
//public void listAll(Course[] courses) {
//		
//	for (Course course : courses) {
//	System.out.println("--------------");
//	System.out.println("ID: " + course.id);
//	System.out.println("NAME: " + course.name);
//	System.out.println("INSTRUCTOR ID: " + course.instructorId);
//	System.out.println("--------------");
//		
//	}	
//}
//
//
//	Instructor instructor = new Instructor(1, "Engin", "Demirog");
//	Course courseJava = new Course(1, "Java+React", 1);
//	Course courseCsharp = new Course(1, "C#+Angular", 1);
//
//	Course[] courses = { courseJava, courseCsharp };
//
//
//CourseManager courseManager = new CourseManager();
//courseManager.listAll(courses);