import java.util.Scanner;

public class wordupandlow {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter some words:");
        String a=sc.nextLine();
        String word[]=a.split(" ");
        for(int i=0;i<word.length;i++){
            if(word.length==1){
                System.out.println("Error: word not sufficient");
            }else if (i%2==0){
                System.out.print(" "+word[i].toUpperCase());
            }else{
                System.out.print(" "+word[i].toLowerCase());
            }
        }
        sc.close();
        System.out.println();
    }
}
