class statademo {

    static {
        System.out.println("hello static");
    }

    void display() {
        System.out.println("hi ");
        test();
    }

    static void test() {
        System.out.println("welcome");
    }
}

public class staticdemo {
    public static void main(String[] args) {
        statademo s = new statademo();
        s.display();
        statademo.test();
    }

}