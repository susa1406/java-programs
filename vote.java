import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if (age < 0) {
            System.out.println("invalid age");
        } else if (age >= 18) {
            System.out.println("your elidgable to vote");
        } else {
            System.out.println("your not elidgable");
        }
        sc.close();
    }
}
