class demo{
    demo(int a){
        System.out.println("Hi"+a);
    }
    static{
        System.out.println("static");
    }
    static void display(int b){
        System.out.println("hello"+b);
    }
}

public class constructor {
    public static void main(String[] args) {
        // demo d= new demo(1);
        demo.display(5);
    }
}
