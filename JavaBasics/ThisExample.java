package Java_Practice.JavaBasics;

class Example {
    String name;
    Example(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(this.name);
    }

}
public class ThisExample
{
    public static void main(String ar[])
    {
        Example ex=new Example("saloni");
        ex.display();
    }
}
