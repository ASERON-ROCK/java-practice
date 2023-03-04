//1. Write a java program to add, subtract, multiply and divide 2 integers taking user input.
import java .util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number =");
        int a=sc.nextInt();
        System.out.print("Enter the second number=");
        int b=sc.nextInt();
        int add= a+b;
        int subtract=a-b;
        int multiply=a*b;
        float divide= (float) a/(float) b;
        System.out.println("add="+add);
        System.out.println("Subtract="+subtract);
        System.out.println("Multiply="+multiply);
        System.out.println("Divide="+divide);
    }
}
