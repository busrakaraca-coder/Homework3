
public class Main {

	public static void main(String[] args) {
		
	    StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		
		Student student = new Student();
		student.setId(1);
		student.setFullName("Büşra Karaca");
		student.setPhoneNumber("05555555555");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFullName("Engin Demiroğ");
		instructor.setPhoneNumber("05555555555");
		
		userManager.add(student);
		userManager.add(instructor);
		userManager.signIn(student);
		userManager.signInthisclass(student);
		
		
		
		

	}

}
