package com.Singleton;

public class SingletonThreadsafeBlock {
    private static SingletonThreadsafeBlock instance;

    SingletonThreadsafeBlock()
    {

    }
    public static SingletonThreadsafeBlock getInstance()
    {
        if(instance == null)
        {
            synchronized (SingletonThreadsafeBlock.class)
            {
                if(instance ==  null)
                {
                    instance =  new SingletonThreadsafeBlock();
                }
            }
        }
        return instance;
    }
}
