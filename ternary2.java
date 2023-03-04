//  Write a java program to find the greater of 2 numbers using ternary operators.
import java.util.Scanner;
public class ternary2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n= obj.nextInt();
        int n2= obj.nextInt();
        String y=(n>n2)?"first is greater":" second in greater ";
        System.out.println(y);

    }
}
