// . Write a java program to check whether a number is even or odd (taking user input).
import java.util.Scanner;
public class odd_even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number =");
        int n= sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the number is even ");
        }
        else
        {
            System.out.println("the number is odd");
        }
    }

}
