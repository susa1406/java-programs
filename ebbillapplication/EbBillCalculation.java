package ebbillapplication;

public class EbBillCalculation {
    double calculate(double unit) {
        double amount;
        if (unit <= 100) {
            amount = unit * 1.50;
        } else if (unit <= 200) {
            amount = (100 * 1.50) + (unit - 100) * 2.50;
        } else {
            amount = (100 * 1.50) + (100 * 2.50) + (unit - 200) * 4.00;
        }
        return amount;
    }
}
