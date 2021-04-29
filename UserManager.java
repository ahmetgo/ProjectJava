package odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " " + user.getSurname() 
		+ " eklendi.");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			 add(user);
		}
	}
}
