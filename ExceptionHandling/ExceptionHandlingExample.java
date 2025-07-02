package Java_Practice.ExceptionHandling;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            
            int a = 10;
            int b = 0;
            int result = a / b;  
            System.out.println("Result: " + result);

            
            String number = "abc";
            int num = Integer.parseInt(number);  
            System.out.println("Parsed number: " + num);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Exception message: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
            System.out.println("Exception message: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Exception caught.");
            System.out.println("Exception message: " + e.getMessage());

        } finally {
            System.out.println("This block always runs (finally block).");
        }

        System.out.println("Program continues after exception handling.");
    }
}
