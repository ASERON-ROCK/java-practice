//Write a java program to check whether a number is positive or negative (The number should be taken as
//user input).
import java.util.Scanner;
public class positiveORnegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number =");
        int n= sc.nextInt();
        if(n>0)
        {
            System.out.println("number is positive");
        }
        else if (n==0)
        {
            System.out.println("number is 0");
        }
        else
        {
            System.out.println("number is negative");
        }
    }
}
