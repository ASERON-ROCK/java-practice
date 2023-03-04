//. Write a java program to calculate and display the area of a rectangle taking user input.
import java.util.Scanner;
public class area_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of a rectangle =");
        int l=sc.nextInt();
        System.out.println("enter the width of a rectangle =");
        int w=sc.nextInt();
        int area=l*w;
        System.out.println("area ="+area);

    }
}
