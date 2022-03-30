package com.Singleton.BookStore;

import java.lang.reflect.Array;
import java.util.ArrayList;

interface LoggingIn
{
    void addToLog(String s, ArrayList<String> Log);
}
interface Printer
{
    void print(ArrayList<String> Log);
}

public class Logger {
    private static Logger instance;

    ArrayList<String> Log = new ArrayList<>();

    private Logger()
    {
    }

    public static Logger getInstance()
    {
        if(instance == null)
        {
            synchronized (Logger.class)
            {
                if(instance == null)
                    instance = new Logger();
            }
        }
        return instance;
    }

    public void printLog()
    {
       PrintLog printObject =  PrintLog.getInstance();
       printObject.print(Log);
    }

    public void addToLog(String s) {
        LogIn LogInObject = LogIn.getInstance();
        LogInObject.addToLog(s,Log);
    }
}
