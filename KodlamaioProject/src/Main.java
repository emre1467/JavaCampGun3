
public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		User user=new User();
		Instructor instructor=new Instructor();
		instructor.firstName="instructer";
		user.firstName="user";
		student.firstName="student";
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
	}

}
