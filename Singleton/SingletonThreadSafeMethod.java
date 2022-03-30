package com.Singleton;

public class SingletonThreadSafeMethod {
    private static  SingletonThreadSafeMethod instance;

    SingletonThreadSafeMethod()
    {

    }
    public static synchronized SingletonThreadSafeMethod getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonThreadSafeMethod();
        }
        return instance;
    }
}
