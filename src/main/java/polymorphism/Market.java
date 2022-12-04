package polymorphism;

public class Market {

    public static void main(String[] args){

        Apple greenApple = new Apple();
        greenApple.makeJuice();

        Fruit redApple = new Apple();
        redApple.makeJuice();

        redApple = new Orange();
        ((Orange)redApple).peel();
        redApple.makeJuice();

        Fruit banana = new Fruit(345);
        banana.makeJuice();

        squeeze(banana);
        squeeze(redApple);

    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
