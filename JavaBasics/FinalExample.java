package Java_Practice.JavaBasics;

class Animal1 {

    final void makeSound()
    {
        System.out.println("Animal sound");
    }
}
class Dog1 extends Animal1
{

}
public class FinalExample
{
    public static void main(String ar[])
    {
        Dog1 d1=new Dog1();
        d1.makeSound();

    }
}
