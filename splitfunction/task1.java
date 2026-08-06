package splitfunction;

public class task1 {
    public static void main(String[] args) {
        String data = "Java Python C++ Java Python Java";
        String words[]= data.split(" ");
        for( int i =0 ;i<words.length;i++){
            System.out.println(words[i]);
        }
        System.out.println("Total words:"+words.length);

    }
}
