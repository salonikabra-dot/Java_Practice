package Java_Practice.Singleton;

 class SingletonDemo {

    public static SingletonDemo singleton;

    private SingletonDemo()
    {

    }
    public static SingletonDemo getSingleton()
    {
        if(singleton==null)
        {
            synchronized(SingletonDemo.class)
            {
             singleton=new SingletonDemo();
            }
    }
        return singleton;

    }
    
}
