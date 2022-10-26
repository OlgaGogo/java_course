package chapter6;

public class BillCalculator {

    public static void main(String args[]){
        Bill bill = new Bill(12, 79.8, 800, 1000);
        bill.printItemizedBill();
    }
}
