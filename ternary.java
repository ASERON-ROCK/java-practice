//  Write a java program to check whether a number is even or odd using ternary operators.
import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =");
        int a= sc.nextInt();
       String msg= (a%2==0) ?" number is even  " :"number is odd";
        System.out.println(msg);
    }
}
