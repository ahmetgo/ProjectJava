package odev2;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öğrenci " + user.getName() + " " + user.getSurname() 
		+ " eklendi.");
	} 
}
