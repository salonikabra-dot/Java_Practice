package Java_Practice.oopsConcept;

class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}
public class OverridingEx
{
    public static void main(String ar[])
    {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.speak();   
        myDog.speak();      
    }
}

