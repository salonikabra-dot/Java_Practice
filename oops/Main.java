package Java_Practice.oops;

class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    public String speak() {
        return "Some sound";
    }
}

// Derived class Dog inherits Animal
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}

// Derived class Cat inherits Animal
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println(dog.name + " says " + dog.speak());  // Buddy says Woof!
        System.out.println(cat.name + " says " + cat.speak());  // Whiskers says Meow!
    }
}
