import java.util.Scanner;

public class Ass_prof extends Person {
	private double basicPay , DA , HRA , PF , SCF , grossSalary , netSalary;
	private String dept;
	
	public void accept()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your Department : ");
		dept = s.next();
		
		System.out.println("Enter your Basic Pay : ");
		basicPay = s.nextDouble();
		
		//Salary Calculation 
		
		DA = 1.19 * basicPay;
		PF = 0.12 * basicPay;
		HRA = 0.3 * basicPay;
		SCF = 0.001 * basicPay;
		grossSalary = basicPay + DA + HRA;
		netSalary = grossSalary - (PF + SCF);
	
	}
	public void output()
	{
		System.out.println("Department : " +dept);
		System.out.println("Basic Pay : " +basicPay);
		System.out.println("Post : Assistant Professor.");
		System.out.println("Gross Salary : " +grossSalary);
		System.out.println("Net Salary : " +netSalary);
	}
	

}