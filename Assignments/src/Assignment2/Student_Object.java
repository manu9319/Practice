package Assignment2;

public class Student_Object {

	public static void main(String[] args) {
		// (int Std_id,String std_name,String Email_id,long phone_no,int yop,String
		// Std_Address,String Degree)
		Student std = new Student(123, "manu", "manu@gmail.com", 123456987, 20016, "987 4th cross", "B.Tech");
		std.printAttributes();
		System.out.println("------------------------------------");
		std.setphone_no(9911634244L);
		System.out.println(std.getphone_no());
	}

}
