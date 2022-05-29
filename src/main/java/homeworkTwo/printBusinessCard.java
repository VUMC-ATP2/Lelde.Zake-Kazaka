package homeworkTwo;

import static java.lang.System.*;

public class printBusinessCard {

    private static String name;
    private static String surname;

    public static void printBusinessCard() {
        out.println("Vizītkarte");
        out.println("#########");
        out.println("Vārds: Lelde");
      out.println("Uzvārds: Zake-Kazaka");
      out.println("Telefons: +371 12345678");
      out.println("Dzimšanas gads: 1111");
    }

    public static void printBusinessCardTwo(String name,String surname, String telephone, String dateOfBirth) {
        printBusinessCard.name = name;
        printBusinessCard.surname = surname;
        out.println("Vizītkarte");
        out.println("#########");
        out.println("Vārds: " + name + "\nUzvārds: " + surname + "\nTelefons: " + telephone + "\nDzimšanas gads: " + dateOfBirth);

    }
    public static int sumOfTwoNumbers (int x, int y){
        return x + y;
    }
    public static double average (double a, double b, double c){
        return a + b + c;
    }

    public static void main (String[]args){
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        printBusinessCardTwo("Lelde", "Zaķe - Kazaka","+371 12345678","1234");
        printBusinessCardTwo("Jānis", "Bērziņš", "+371 87654321", "4321");
        int z = sumOfTwoNumbers(10, 20);
        out.println(z);
        double r = average(7.2, 2.51, 4.89);
        out.println(r);

    }
}











