package ebbillapplication;

import java.util.Scanner;

public class mainEb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EbBillCalculation eb = new EbBillCalculation();
        System.out.print("Enter Name:");
        String name = sc.next();
        System.out.print("Enter eb.no:");
        int ebno = sc.nextInt();
        System.out.print("Enter total units consumed:");
        double unt = sc.nextDouble();

        // now print the details
        System.out.println("--- Eb Bill Calculation & User details ---");
        System.out.println("Name:" + name);
        System.out.println("Eb.No:" + ebno);
        System.out.println("Eb Bill: Rs." + eb.calculate(unt));
        sc.close();

    }

}
