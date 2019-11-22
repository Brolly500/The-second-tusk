import java.util.Scanner;

public class Vtoroe3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n = read.nextDouble();
        double x1 = 0.0;
        double x2 = 1.0;
        if (n>=x2) {
            System.out.print(n-x2);
        }
        else if (n<=0) {
            System.out.print(n*-1);
        }
        else {
            if(x2-n >= n) {
                System.out.print(n);
            }
            else {
                System.out.print(x2-n);
            }
        }
        read.close();
    }
}

