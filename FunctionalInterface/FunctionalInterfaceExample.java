package Java_Practice.FunctionalInterface;
// Define a functional interface
@FunctionalInterface
interface MyFunction {
    void sayHello();  // Only one abstract method
}

// Class with main method
public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        // Using a lambda expression to implement the interface
        MyFunction greeting = () -> System.out.println("Hello from a functional interface!");

        // Call the method
        greeting.sayHello();  // Output: Hello from a functional interface!
    }
}
