import java.util.Scanner;

public class charactercount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a sentance:");
        String sentance = sc.nextLine();
        int upp = 0;
        int lwo = 0;
        int spc = 0;
        int dig = 0;
        for (int i = 0; i < sentance.length(); i++) {
            char ch = sentance.charAt(i);
            if (Character.isUpperCase(ch)) {
                upp++;
            } else if (Character.isLowerCase(ch)) {
                lwo++;
            } else if (Character.isWhitespace(ch)) {
                spc++;
            } else if (Character.isDigit(ch)) {
                dig++;
            }
        }
        System.out.println("Uppercase count:" + upp);
        System.out.println("Lowercase count:" + lwo);
        System.out.println("Whitespace count:" + spc);
        System.out.println("Digit count:" + dig);
        sc.close();
    }
}