package chapterOLGA;

public class TaxCalculator {
    public static void main(String[] args){
        System.out.println("Your tax is " + getTax(1));
    }

    public static int getTax(int tax){
        switch (tax){
            case 1: return 10;
            case 2: return 20;
            case 3: return 30;
            default: return 0;
        }

    }


}
