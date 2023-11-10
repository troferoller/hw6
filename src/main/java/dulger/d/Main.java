package dulger.d;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 19;
        int e = 20;
        int g = Integer.MAX_VALUE;

        double f = 2.64;
        boolean c = true;
        boolean d = false;

        System.out.println("Математические операции:");
        System.out.println("          A + B = "+(a+b));
        System.out.println("          A - B = "+(a-b));
        System.out.println("          A * B = "+(a*b)+"\n");

        System.out.println("Логические операции:");
        System.out.println("          A > B   "+(a>b));
        System.out.println("          A < B   "+(a<b));
        System.out.println("          A = B   "+(a==b));
        System.out.println("          A != B   "+(a!=b));
        System.out.println("          A >= B   "+(a>=b));
        System.out.println("          A <= B   "+(a<=b)+"\n");

        System.out.println("Логические операции:");
        System.out.println("          C || D   "+(c||d));
        System.out.println("          C && D   "+(c&&d));
        System.out.println("          !(C && D)   "+(!(c&&d))+"\n");


        System.out.println("If Else операции");
        if (a>b)
            System.out.println("          If A > B");
        else
            System.out.println("          Else A < B\n");

        System.out.println("Buffer overflow: ");
        System.out.println("G равно Максимальному занчению  Integer плюс 2: "+(g+2)+"\n");

        System.out.println("Операциис разными типами чисел: ");
        System.out.println("          E + F = "+(e+f));
        System.out.println("          E * F = "+(e*f));
        System.out.println("          E - F = "+(e-f));

    }
}