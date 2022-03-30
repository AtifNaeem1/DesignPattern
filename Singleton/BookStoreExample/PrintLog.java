package com.Singleton.BookStore;

import java.util.ArrayList;

public class PrintLog implements Printer {
    private static PrintLog instance;

    private PrintLog()
    {

    }

    public static PrintLog getInstance()
    {
        if(instance == null)
        {
            synchronized (PrintLog.class)
            {
                if(instance == null)
                    instance = new PrintLog();
            }
        }
        return instance;
    }

    @Override
    public void print(ArrayList<String> Log) {
        for(String currentLog : Log)
        {
            System.out.println(currentLog);
        }
    }
}
