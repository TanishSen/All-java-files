import java.util.*;
public class que4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = sc.nextInt();
        String str ;
        if(a==1)
        str = "Monday";

        else if(a==2)
        str = "Tuesday";

        else if(a==3)
        str = "Wednusday";

        else if(a==4)
        str = "Thursday";

        else if(a==5)
        str = "Friday";

        else if(a==6)
        str = "Saturday";

        else if(a==7)
        str = "Sunday";

        else str="Invalid Input";

        System.out.print(str);
    }
}
