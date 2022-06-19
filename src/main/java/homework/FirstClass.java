package homework;

public class FirstClass {
    public static void main(String[] args) {
String countryName = "Denmark";
        System.out.println("Country name is " + countryName +".");
        int population = 5659715;
        System.out.printf ("Population in Denmark is people " + population + ".");
String area = "43 094 km2";
        System.out.println (" Denmark is a relatively small country. It covers an area of " + area + ".");
String capitalCity = "Copenhagen";
        System.out.printf("The country's territory is further subdivided into five regions. The capital of %s is %s, which is also the largest city in the country.\n",countryName, capitalCity);
String oafficialLanguage = "Danish";
        System.out.println( oafficialLanguage + " is the official language in the country.");
boolean isInEU = Boolean.parseBoolean("true");
boolean notInEU = Boolean.parseBoolean("False");
        System.out.printf("Is Denmark a member of the European Union? Yes, Denmark is in the European Union. ", isInEU);
        String curency = "DKK";
        System.out.printf("But the official currency in the country is the ("+ curency +") Danish krone.\n");
            System.out.println("Examples of  arithmetic operators:");

        int a = 10;
        int b = 20;
        int c = a+b;
        int d = 50;
        int sum1 = b+d;
        int sum2 = sum1+c;
            System.out.println ("a + b is " + c);
        System.out.println("Sum1 is b+d = " + sum1);
        System.out.println("Sum2 is b+d+c = "+ sum2);

            int e = 100;
            int r = 150;
            int t = e-r;
            int sum3 = r-e;
            int sum4  = r-sum3;
            System.out.println("If I subtract e - r the result will be " + t);
        System.out.println("Sum3 is e - r = " + sum3);
        System.out.println("Sum4 is r-e-r = " + sum4);
        int q = 5;
        int w = q*a;
        int sum5 = q*q;
        int sum6 = sum5*w;
        System.out.println("If I multiply two values q*a the result will be " +w);
        System.out.println("Sum5 is q*q = " + sum5);
        System.out.println("Sum6 is sum5*w = " +sum6);
        int sum7 = sum3/a;
        int sum8 = sum4/sum3;
        int sum9 = sum6/50;
        System.out.println("Sum7 is sum3/3 = " + sum7);
        System.out.println("Sum8 is sum4/sum3 = " + sum8);
        System.out.println("Sum9 is sum6/50 = "+ sum9);
        int sum10 = e%r;
        int sum11 = sum6%r;
        int sum12 = 5%2;
        System.out.println("Sum10 is 100%150 = " + sum10);
        System.out.println("Sum11 is sum6%r = " + sum11);
        System.out.println("Sum12 is 5%2 = " + sum12);






    }
}
