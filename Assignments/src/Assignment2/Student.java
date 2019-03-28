package Assignment2;

public class Student {
	private int std_id;
	private String std_name;
	private String Email_id;
	int yop;
	long phone_no;
	String Std_Address;
    String Degree;

	public Student(int std_id, String std_name, long phone_no) {
		this.std_id = std_id;
		this.std_name = std_name;
		this.phone_no = phone_no;

	}

	public Student(int Std_id, String std_name, String Email_id) {
		this.std_id = std_id;
		this.std_name = std_name;
		this.Email_id = Email_id;

	}

	public void printAttributes() {
		System.out.println("student_id = " + std_id);
		System.out.println("std_name = " + std_name);
		System.out.println("yop = " + yop);
		System.out.println("phone_no = " + phone_no);
		System.out.println("Email_id = " + Email_id);
		System.out.println("Std_Address = " + Std_Address);
		System.out.println("Degree = " + Degree);
	}

	public Student(int std_id, String std_name, String Email_id, long phone_no, int yop, String Std_Address,
			String Degree) {
		this.std_id = std_id;
		this.std_name = std_name;
		this.Email_id = Email_id;
		this.phone_no = phone_no;
		this.yop = yop;
		this.Std_Address = Std_Address;
		this.Degree = Degree;

	}

	public int getId() {
		return std_id;
	}

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String Email_id) {
		this.Email_id = Email_id;
	}

	public String getStd_Address() {
		return Std_Address;
	}

	public void setStd_Address(String Std_Address) {
		this.Std_Address = Std_Address;
	}

	public String getDegree() {
		return Degree;
	}

	public int getyop() {
		return yop;
	}

	public long getphone_no() {
		return phone_no;
	}

	public void setphone_no(long phone_no) {
		this.phone_no = phone_no;
	}

}