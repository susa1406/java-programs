class method {
    int area(int l, int b) {
        return l * b;
    }

    double area(double b, double h) {
        return 0.5 * b * h;
    }

    int area(int a) {
        return a * a;
    }

    double area(double r) {
        return Math.PI * r * r;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        method m = new method();
        System.out.println("the area of rectangle:" + m.area(2, 3));
        System.out.println("the area of triangle:" + m.area(4.0, 4.0));
        System.out.println("the area of square:" + m.area(5));
        System.out.println("the area of circle:" + m.area(7.0));

    }

}
