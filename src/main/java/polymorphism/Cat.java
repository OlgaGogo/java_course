package polymorphism;

public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("The cat is meowing");
    }

    public void scratch(){
        System.out.println("Scratch me!");
    }
}
