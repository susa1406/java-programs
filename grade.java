import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("enter your mark:");
        int mark = key.nextInt();
        if (0 <= mark && mark <= 100) {
            if (mark >= 90 && mark <= 100) {
                System.out.println("grade A");
            } else if (mark >= 80 && mark <= 89) {
                System.out.println("grade B");
            } else if (mark >= 70 && mark <= 79) {
                System.out.println("grade C");
            } else if (mark > 60 && mark <= 69) {
                System.out.println("grade D");
            } else if (mark >= 50 && mark <= 59) {
                System.out.println("grade E");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("invalid marks");
        }
        key.close();
    }
}
