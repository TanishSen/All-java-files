import java.util.*;
public class que16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classes held : ");
		int classNum = sc.nextInt();

		System.out.println("Enter the number of classes attended : ");
		int classAtt = sc.nextInt();
		
        float st = ((float) classAtt / classNum) * 100;
		
		System.out.println(st);
		
		if(st>75)
		System.out.println("Allowed");
		else 
		System.out.println("Not Allowed");
		 
	}
}
