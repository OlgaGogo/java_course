package polymorphism;

public class Apple extends Fruit {

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

    public Apple(){
        super(365);
    }

    public void removeSeeds(){
        System.out.println("The seed is moved from your apple");
    }
}
