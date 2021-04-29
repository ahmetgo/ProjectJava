package odev2;

public class Instructor extends User{
	String sendHomework;
	
	
	public Instructor() {
		
	}


	public Instructor(String sendHomework) {
		super();
		this.sendHomework = sendHomework;
	}


	public String getSendHomework() {
		return sendHomework;
	}


	public void setSendHomework(String sendHomework) {
		this.sendHomework = sendHomework;
	}
	
}
