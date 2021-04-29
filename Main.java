package odev2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Ahmet");
		student.setSurname("Ayhan");
		student.setId(1);
		student.setPassword("12345");
		student.setEmail("aa@gmail.com");
		student.setAddHomework("Ödev teslim edildi.");
		
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin");
		instructor.setSurname("Demiroğ");
		instructor.setId(2);
		instructor.setEmail("bb@gmail.com");
		instructor.setPassword("56789");
		instructor.setSendHomework("Ödev gönderildi.");
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		

	}

}
