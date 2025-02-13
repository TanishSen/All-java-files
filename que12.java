import java.util.*;
public class que12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of purchases : ");
        int purQuantity = sc.nextInt();
        double cp = 100;
        double discountedPrice=0;
        if(purQuantity >1000)
           discountedPrice = (cp - 0.1 * cp) * purQuantity;

           else 
              discountedPrice = cp * purQuantity;
              System.out.println("final price is : " + discountedPrice);
    }
}
