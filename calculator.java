import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int a = sc.nextInt();
        System.out.print("enter a operator:");
        String operator = sc.next();
        System.out.print("enter second number:");
        int b = sc.nextInt();
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("can't divide by 0");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();
    }
}
