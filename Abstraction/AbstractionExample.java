package Java_Practice.Abstraction;


abstract class Animal {
    
    abstract void makeSound();

    
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



    

