package assignment3;

public class StudentManager extends UserManager{

	 public void register(Student student) {
		   System.out.println(student.getFirstName() + " kayıt oldu!");
	   }
	 public void registerToCourse(Student student) {
		   System.out.println(student.getFirstName() + " kursa kayıt oldu!");
	   }
}
