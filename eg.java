import java.util.Scanner;
public class eg {
public static void main(String[] args) {
    Scanner num=new Scanner(System.in);
    System.out.print("enter a number:");
    int a=num.nextInt();
    if (a<0) {
        System.out.println(a+" :negative");
    }else if (a>0) {
        System.out.println(a+ " : positive");
    }else{
        System.out.println(a+ " : zero");
    }
    num.close();
}
}
