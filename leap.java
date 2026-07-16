import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("enter a number:");
        int year = num.nextInt();
        if (year % 400 == 0) {

            System.out.println(year + " : is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " : is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " : is leap year");

        } else {
            System.out.println(year + " : is not a leap year");
        }
        num.close();
    }
}
