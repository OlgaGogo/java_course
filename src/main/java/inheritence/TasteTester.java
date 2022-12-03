package inheritence;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake("lemon");
        cake.setPrice(400);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(49.95);
        System.out.println("Birthday cake flavor is: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price is: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        System.out.println("Wedding cake flavor is: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price is: " + weddingCake.getPrice());

     }
}
