package Java_Practice.oopsConcept;

class Calculator {
    // Overloaded add methods

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main
{
    public static void main(String ar[])
    {
          Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));        
        System.out.println(calc.add(2.5, 3.5));     
        System.out.println(calc.add(1, 2, 3));      

    }
}

