package chapter6;

public class Bill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public Bill(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }

    public Bill(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }

    public Bill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(double baseCost){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int minutes){
        this.allottedMinutes = minutes;
    }

    public int getUsedMinutes(){
        return  usedMinutes;
    }

    public void setUsedMinutes(int minutes){
        usedMinutes = minutes;
    }

    public double calculateOverage(){
        if(usedMinutes <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.25;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateTax() + calculateOverage();
    }

    public void printItemizedBill(){
        System.out.println("Bill ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }

}
