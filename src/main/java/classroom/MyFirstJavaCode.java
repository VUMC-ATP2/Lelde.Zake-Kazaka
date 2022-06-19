package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        //one line comment
        /*
        Multi line comment
         */
        //byte data type
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors\n", floorCount);
        //%d - numbers
        //%s - text/string
        //%b - boolean
        // /n new row
        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1200);
        System.out.printf("Average salary for Junior QA Engeneer is: %d\n", salaryInEur);
        System.out.printf("Average salary for Junior QA Engeneer is: %d\n", 1234);
        int chinaPopulation = 1435267;
        long currentWorldPopulation = 123456789;
        System.out.printf("Current world population: %d. In meanwhile China population: %d\n", currentWorldPopulation, chinaPopulation);
        //Flooting numbers
        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);
        double gasPriceEur = 1.845;
        System.out.println(gasPriceEur);
        //Primitive text (char)
        char firstLetterOfMyName = 'L';

        //Non-primitive string
        String mySentence = "Hello, my name is Lelde";
        String mySecondSentence = "I live un Riga.";
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + "" + mySecondSentence);
        System.out.println("%s  %s \n");
        /*
        %d – for signed decimal integer

%f – for the floating point

%o – octal number

%c – for a character

%s – a string

%i – use for integer base 10

%u – for unsigned decimal number

%x – hexadecimal number

%% – for writing % (percentage)

%n – for new line = \n
         */
//booleon is vai has isSummer vai hasItems
        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);
        if (isSummer){
            System.out.println("Yes, it is summer");}
        else {
            System.out.println("No, it is not summer");
        }
//Aritmetic operators + -/*
        int a =10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

    }
}
