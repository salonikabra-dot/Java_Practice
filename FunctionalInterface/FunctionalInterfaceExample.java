package Java_Practice.FunctionalInterface;

@FunctionalInterface
interface MyFunction {
    void sayHello();  
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        
        MyFunction greeting = () -> System.out.println("Hello from a functional interface!");

    
        greeting.sayHello();  
    }
}
