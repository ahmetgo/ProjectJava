package odev2;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Eğitmen " + user.getName() + " " + user.getSurname() 
		+ " eklendi.");
	} 
}
