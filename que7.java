import java.util.*;
public class que7 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str;

        if(a==1) str= "Jan";
        else if(a==2) str="Feb";
        else if(a==3) str="Mar";
        else if(a==4) str="Apr";
        else if(a==5) str="May";
        else if(a==6) str="June";
        else if(a==7) str="July";
        else if(a==8) str="Aug";
        else if(a==9) str="Sep";
        else if(a==10) str="Oct";
        else if(a==11) str="Nov";
        else if(a==12) str="Dec";
        else str="Invalid Month";

        System.out.println(str);
    }
}
