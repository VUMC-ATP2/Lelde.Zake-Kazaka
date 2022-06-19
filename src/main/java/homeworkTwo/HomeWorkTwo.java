package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int x = 6;
        boolean result = x > 5 && x <= 10;
        boolean result1 = !(x <= 5 && x < 10);
        boolean result2 = x == 0 && x == 10;
        System.out.println("1. piemērs: ");
        System.out.println(x > 0);
        System.out.println("2. Piemērs: ");
        System.out.println(x < 0);
        System.out.println("3. piemērs: ");
        System.out.println(result);
        System.out.println("4. piemērs: ");
        System.out.println(result1);
        System.out.println("5. piemērs: ");
        System.out.println(result2);
        System.out.println("6. piemērs: ");
        System.out.println(x * x > 10);

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the month number: ");
        int month  = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please try again, enter number 1 - 12. ");
        }
        {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter 3 whole number: ");
            int nr1 = scanner1.nextInt();
            int nr2 = scanner1.nextInt();
            int nr3 = scanner1.nextInt();

            if (nr1 >= nr2 && nr1 >= nr3)
                System.out.println(nr1 + "is the maximum number.");
            else if (nr2 >= nr1 && nr2 >= nr3)
                System.out.println(nr2 + "is the maximum number.");
            else if (nr3 >= nr1 && nr3 >= nr2)
                System.out.println(nr3 + "is the maximum number.");
        }
        {

            Scanner scanner2  = new Scanner(System.in);
            System.out.println("Please enter the color: ");
            String color = scanner2.next();

            if (color.equals("Green"))
                System.out.println("go");
            else if (color.equals("Yellow"))
                System.out.println("wait");
            else if (color.equals("Red"))
                System.out.println("stop");
            else
                System.out.println("dont know ");
        }
        }
    }



