// Declaring Parent class 'Animal'
class Animal{
    String name;
    int age;
    public void makeSound(){
    System.out.println("Kinds of Animal Sound : ");
    }
}
// Declaring 'Dog' sub-class inherit Animal class
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog Sound \"Bark~woof\"");
    }
}
// Declaring 'Cat' sub-class inherit Animal class
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat Sound \"Meow Meow\"");
    }
}
// Declaring 'Bird' sub-class inherit Animal class
class Bird extends Animal{
    public void makeSound(){
        System.out.println("Cat Sound \"Chirping\"");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        // Making Objects of classes
        Animal a= new Animal();
        a.makeSound();
        
        Dog dog=new Dog();
        dog.makeSound();

        Cat cat=new Cat();
        cat.makeSound();

        Bird bird=new Bird();
        bird.makeSound();
    }
}