package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Gatavs");
        while (i <= 100) {
            i++;
        }
        int num = 4;
        boolean isPrimeNumber = false;
        for (int n = 2; n <= num / 2; ++i) {
            if (num % n == 0) {
                isPrimeNumber = true;
                break;
            }
        }

        if (isPrimeNumber)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        int number = 0;
        while (number < dayOfTheWeek.length) {
            System.out.println("Number of the weekday is " + dayOfTheWeek[number]);
            number++;
        }
        do {
            System.out.println(dayOfTheWeek.length);
            number++;
        }
        while (number < dayOfTheWeek.length);

        char[] characters = {'A', 'S', 'D', 'F', 'G', 'H'};
        for (int r = 0; r < 6; r++) {
            System.out.println(characters[r]);
        }

        {
            String[] nameOfThePerson = {"Jānis", "Pēteris", "Linda", "Inga", "Līga"};
            for (String personName5 : nameOfThePerson) {
                System.out.println(personName5);
            }
        }
        int[] evenNumbers = {100};
        int number1 = 1;
        do {
            if (number1 % 2 == 0) {
                System.out.print(number1 + ", ");
            }
            number1++;
        }
        while (number1 <= 100);

        {
            System.out.println("Uzdevums Nr.5");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadiet skaitli: ");
        int factoralNumb = sc.nextInt();
        {

            factoralNumb = factoralNumb*1*2*3;
        }
        System.out.println("Faktorālais skaitlis ir: " + factoralNumb);

        Scanner scanner = new Scanner (System.in);
        int pin = 12345;
        int trys=0;
        System.out.println("Lūdzu ievadiet PIN kodu: ");
        int enter = scanner.nextInt();
        trys++;
        while (enter!= pin && trys < 3) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz. \n");
            System.out.println("Lūdzu ievadiet PIN kodu: ");
            enter = scanner.nextInt();
            trys++;
        }
        if (enter==pin)
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ. \n");
            else if (trys >= 3);
        System.out.println("Atvainojiet, bet jūs esat bloķēts");

        }
    }







