import java.util.Scanner;

public class Vtoroe1 {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println("after exchange");

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}

