package splitfunction;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int t = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks:");
        String input = sc.nextLine();
        String marks[] = input.split(" ");
        for (int i = 0; i < marks.length; i++) {
            int mark = Integer.parseInt(marks[i]);
            t = t + mark;
        }
        System.out.println("total marks:" + t);
        double a = (double) t / marks.length;
        System.out.println("average:" + String.format("%.2f",a));
        if (a >= 90) {
            System.out.println("Grade A");
        } else if (a >= 75) {
            System.out.println("Grade B");
        } else if (a >= 50) {
            System.out.println("Grade C");
        } else if (a >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
