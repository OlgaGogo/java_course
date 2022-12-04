package polymorphism;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("The dog is barking");
    }

    public void fetch(){
        System.out.println("fetch is fun!");
    }

}
