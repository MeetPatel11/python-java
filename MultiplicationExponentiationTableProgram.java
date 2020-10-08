package five;

import java.util.Scanner;

public class MultiplicationExponentiationTableProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = sc.next();
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        sc.close();

        System.out.println("\nMultiplication Table for " + number + " : ");
        System.out.println("\t 1.0   *   " + number + "  =  " + number);
        System.out.println("\t 2.0   *   " + number + "  =  " + number * 2);
        System.out.println("\t 3.0   *   " + number + "  =  " + number * 3);
        System.out.println("\t 4.0   *   " + number + "  =  " + number * 4);
        System.out.println("\t 5.0   *   " + number + "  =  " + number * 5);
        System.out.println("\t 6.0   *   " + number + "  =  " + number * 6);
        System.out.println("\t 7.0   *   " + number + "  =  " + number * 7);
        System.out.println("\t 8.0   *   " + number + "  =  " + number * 8);
        System.out.println("\t 9.0   *   " + number + "  =  " + number * 9);
        System.out.println("\t 10.0  *   " + number + "  =  " + number * 10);

        System.out.println("\nExponent Table for " + number + " : ");
        System.out.println("\t " + number + "  ^  " + "1   =  " + Math.pow(number, 1));
        System.out.println("\t " + number + "  ^  " + "2   =  " + Math.pow(number, 2));
        System.out.println("\t " + number + "  ^  " + "3   =  " + Math.pow(number, 3));
        System.out.println("\t " + number + "  ^  " + "4   =  " + Math.pow(number, 4));
        System.out.println("\t " + number + "  ^  " + "5   =  " + Math.pow(number, 5));
        System.out.println("\t " + number + "  ^  " + "6   =  " + Math.pow(number, 6));
        System.out.println("\t " + number + "  ^  " + "7   =  " + Math.pow(number, 7));
        System.out.println("\t " + number + "  ^  " + "8   =  " + Math.pow(number, 8));
        System.out.println("\t " + number + "  ^  " + "9   =  " + Math.pow(number, 9));
        System.out.println("\t " + number + "  ^  " + "10  =  " + Math.pow(number, 10));

    }
}
