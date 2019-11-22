import java.util.Scanner;

public class Vtoroe5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();
        double d;
        d = Math.sqrt(b*b - 4*a*c);
        double x1 = ((-b + d)/2);
        double x2 = ((-b - d)/2);
        read.close();
        System.out.println(x1);
        System.out.println(x2);
    }
}