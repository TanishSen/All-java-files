import java.util.*;
public class que13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current salary and year of service: ");
		
		int salary = sc.nextInt();
		int year = sc.nextInt();
		double bonus = 0;
		if(year>5)
		  bonus = salary+salary*0.05;
		  
		else 
		  bonus = salary ;
		  
		  System.out.println(bonus);
	}
}
