package Java_Practice.JVM;
public class JVMExample {
    public static void main(String[] args) {
        System.out.println("Step 1: Program is loaded by ClassLoader");
        System.out.println("Step 2: Bytecode is verified by Bytecode Verifier");
        System.out.println("Step 3: JVM executes the bytecode using the Interpreter or JIT Compiler");
        
        int a = 10, b = 20;
        int result = add(a, b);
        System.out.println("Addition result: " + result);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
