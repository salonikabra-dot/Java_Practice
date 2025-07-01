package Java_Practice.Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  
        myCat.makeSound(); 

        myDog.eat();       
    }
}



    

