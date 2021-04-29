package odev2;

public class Student extends User{
	String addHomework;

	
	
	public Student() {
		
	}

	
	
	public Student(String addHomework) {
		super();
		this.addHomework = addHomework;
	}



	public String getAddHomework() {
		return addHomework;
	}

	public void setAddHomework(String addHomework) {
		this.addHomework = addHomework;
	}
}
