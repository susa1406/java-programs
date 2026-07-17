/**
 * recursive function
 */
class factorial {
    int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

}

public class recursive {
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println("The Factorial of 5 is: " + f.fact(5));
    }

}