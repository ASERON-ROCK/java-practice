import java.util.Scanner;
public class Ak_03_switch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String month = obj.next();
        switch (month){
            case "january":
                System.out.println("1");
                break;
            case "february":
                System.out.println("2");
                break;
            case "march":
                System.out.println("3");
                break;
            case "april":
                System.out.println("4");
                break;
            case "may":
                System.out.println("5");
            case "jun":
                System.out.println("6");
                break;
            case "july":
                System.out.println("7");
                break;
            case "august":
                System.out.println("8");
                break;
            case "september":
                System.out.println("9");
                break;
            case "october":
                System.out.println("10");
                break;
            case "november":
                System.out.println("11");
                break;
            case "december":
                System.out.println("12");
                break;
            default:
                System.out.println("you enter wrong month");

//            // new type
//                switch (month){
//                    case "january":
//                        System.out.println("1");
//                        break;
//                    case "february":
//                        System.out.println("2");
//                        break;
//                    case "march":
//                        System.out.println("3");
//                        break;
//                    case "april":
//                        System.out.println("4");
//                        break;
//                    case "may":
//                        System.out.println("5");
//                    case "jun":
//                        System.out.println("6");
//                        break;
//                    case "july":
//                        System.out.println("7");
//                        break;
//                    case "august":
//                        System.out.println("8");
//                        break;
//                    case "september":
//                        System.out.println("9");
//                        break;
//                    case "october":
//                        System.out.println("10");
//                        break;
//                    case "november":
//                        System.out.println("11");
//                        break;
//                    case "december":
//                        System.out.println("12");
//                        break;
//                    default:
//                        System.out.println("you enter wrong month");


        }
    }
}
