package homework.classHomework;

public class trīsstūris {
    int a;
    int b;
    int c;
    int s=(a+b+c)/2;
    String triangleName;
    double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

    public trīsstūris() {
        System.out.println("This is triangle!");
    }

    public trīsstūris(int a, int b, int c, int s) {
        this.a = 5;
        this.b = 5;
        this.c = 5;
        this.s = (a+b+c)/2;

    }

    @Override
    public String toString() {
        return "trīsstūris{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", s=" + s +
                '}';
    }

    public trīsstūris(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        int s =(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
        if (a == b && a == c){
            System.out.println("Trīsstūris ir vienādmalu");}
            else{
                System.out.println("Trīsstūris ir vienādsānu");
            }


        }
    }

