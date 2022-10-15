import java.util.Scanner;

public class Salary_slip {

	public static void main(String[] args) {
		
		Ass_prof obj1 = new Ass_prof();
		Asso_prof obj2 = new Asso_prof();
		Prof obj3 = new Prof();
		
		int choice;
		Scanner a = new Scanner(System.in);
		do {
			
			System.out.println("1.Associate Professor.");
			System.out.println("2.Assistant Professor.");
			System.out.println("3.Profesor.");
			System.out.println("4.Exit.");
			System.out.println("Enter your Post : ");
			choice = a.nextInt();
			
			switch(choice)
			{
			  case 1 :
				      obj2.getdata();
				      obj2.accept();
				      obj2.display();
				      obj2.output();
				      break;
				      
			  case 2 :
				     obj1.getdata();
				     obj1.accept();
				     obj1.display();
				     obj1.output();
				     break;
				     
			  case 3 :
				      obj3.getdata();
				      obj3.accept();
				      obj3.display();
				      obj3.output();
				      break;
				      
			default :
				     System.out.println("Invalid Choice !!!");
				     break;
				    
			
		    }//switch choice
			
		} while(choice != 4); //do - while loop

	}

}
