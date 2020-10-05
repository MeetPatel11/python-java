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
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t " + i + "   *   " + number + "  =  " + number * i);
        }
        
        System.out.println("\nExponent Table for " + number + " : ");
        for (int i = 0; i <= 10; i++) {
            System.out.println("\t " + number + "  ^  " + i +"  =  " + Math.pow(number, i));    
        }
    }
}
