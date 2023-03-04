//Write a java program to find the greater of two numbers (taking user input).
import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("enter the first number =");
        int a=obj.nextInt();
        System.out.print("enter the second number =");
        int b=obj.nextInt();
        if(a>b)
        {
            System.out.println("a is greater");
        }
        else
        {
            System.out.println("b is grater");
        }
    }
}
