package Java_Practice.oops;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    public String speak() {
        return "Some sound";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println(dog.name + " says " + dog.speak());  
        System.out.println(cat.name + " says " + cat.speak());  
    }
}
