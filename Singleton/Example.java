package Java_Practice.Singleton;

import designpattern.Eager;

public class Example {

    public static void main(String[] var0) 
    {
      SingletonDemo var1 = SingletonDemo.getSingleton();
      System.out.println(var1.hashCode());
      SingletonDemo var2 = SingletonDemo.getSingleton();
      System.out.println(var2.hashCode());
      Eager var3 = Eager.getEager();
      System.out.println(var3.hashCode());
      Eager var4 = Eager.getEager();
      System.out.println(var4.hashCode());
 
    
}
}
