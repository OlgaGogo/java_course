package polymorphism;

public class Zoo {

    public static void main(String[] args){

        //Sasha will bark because the makeSound() method is overridden in the Dog class
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //Even though we declare sasha as part of an Animal class, because of the Dog class, sasha will still bark
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        //You can change Sasha from an instance of Dog to an instance of Cat
        sasha = new Cat();
        sasha.makeSound();

        //We can access specific methods from other classes this way:
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("The dog is getting a bone");
        }
        else if(animal instanceof Cat){
            System.out.println("The cat is getting some milk");
        }
        else {
            System.out.println("Unknown animal");
        }

    }
}
