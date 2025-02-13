import java.util.Scanner;
class que9and10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius and the height and base of the triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double circleArea = 3.14 * a *  a;
        double triangleArea = 0.5 * b * c;

        System.out.println("area of circle is :" + circleArea);
        System.out.println("Area of the triangle is: " + triangleArea);
    }
}