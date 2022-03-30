package com.Singleton.BookStore;

import java.util.ArrayList;

public class LogIn implements LoggingIn {
    private static LogIn instance;

    private LogIn()
    {

    }

    public static LogIn getInstance()
    {
        if(instance ==  null)
        {
            synchronized (LogIn.class)
            {
                if(instance ==  null)
                {
                    instance  = new LogIn();
                }
            }
        }
        return instance;
    }

    @Override
    public void addToLog(String s, ArrayList<String> Log) {
        Log.add(s);
    }


}
