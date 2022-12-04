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
        squeeze(greenApple);

    }

    public static void squeeze(Fruit fruit){

        if(fruit instanceof Orange){
            System.out.println("Squeezing an orange");
            fruit.makeJuice();
        }
        else if(fruit instanceof Apple){
            System.out.println("Squeezing an apple");
            fruit.makeJuice();
        }
        else {
            System.out.println("Squeezing unknown fruit");
        }

    }
}
