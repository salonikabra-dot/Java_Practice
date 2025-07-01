package Java_Practice.JavaBasics;

class Animal {

    void sound()
    {
        System.out.println("ANimal makes a sound");
    }
    
}
class Dog extends Animal{

    void sound()
    {
        super.sound();
        System.out.println("dog barks");
    }
} 
public class SuperEx
{
    public static void main(String ar[])
    {
        Dog d=new Dog();
        d.sound();
    }
}

