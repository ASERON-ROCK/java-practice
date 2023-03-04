// . Write a java program to swap 2 numbers taking user input.
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number =");
        int a= obj.nextInt();
        System.out.println("Enter second number =");
        int b= obj.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
