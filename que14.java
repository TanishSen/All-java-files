import java.util.*;
public class que14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		int marks = sc.nextInt();
		 switch (marks / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D");
                break;
            case 3:
            case 2:
                System.out.println("Grade: E");
                break;
            default:
                System.out.println("Grade: F");
		 }
	}
}
