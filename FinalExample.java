public class FinalExample {
    // final variable
    final int NUMBER = 100;

    public void display() {
        // NUMBER = 200; // Error: Cannot assign a value to final variable
        System.out.println("Final Variable: " + NUMBER);
    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.display();
    }
}