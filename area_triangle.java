//Write a C program to calculate and display the area of a triangle taking user input.
import java.util.Scanner;
public class area_triangle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the base of a triangle =");
        int b= obj.nextInt();
        System.out.println("enter the height of a triangle =");
        int h=obj.nextInt();
        int area= b/2*h;
        System.out.println("area ="+area);
    }
}
