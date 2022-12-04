package polymorphism;

public class Orange extends Fruit {

    @Override
    public void makeJuice(){
        System.out.println("Orange juice is made");
    }

    public Orange(){
        super(278);
    }

    public void peel(){
        System.out.println("The orange is peeled");
    }
}
