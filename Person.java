import java.util.Scanner;

public class Person {
	private String name , address , DOB , employee_id , pan , email;
	private int age;
	private long mobile_no;
	
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		name = sc.next();
		
		System.out.println("Enter you Age : ");
		age = sc.nextInt();
		
		System.out.println("Enter your Mobile no. : ");
		mobile_no = sc.nextLong();
		
		System.out.println("Enter your email id : ");
		email = sc.next();
		
		System.out.println("Enter your Date of Birth (DD/MM/YYYY) : ");
		DOB = sc.next();
		
		System.out.println("Enter your Address : ");
		address = sc.next();
		
		System.out.println("Enter your Employee id : ");
		employee_id = sc.next();
		
		System.out.println("Enter your Pan card no. : ");
		pan = sc.next();
		
	}
	public void display()
	{
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Mobile no. : " +mobile_no);
		System.out.println("Email Id : " +email);
		System.out.println("DOB : " +DOB);
		System.out.println("Address : " +address);
		System.out.println("Employee Id : " +employee_id);
		System.out.println("Pan Card no. : " +pan);
		
	}

}
