package com.Singleton.BookStore;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Logger LoggerInstance = Logger.getInstance();

        int choice = 1;

        while(choice >= 0 )
        {
            choice = getChoice(keyboard);

            switch(choice)
            {
                case 1 :
                    addLogString("Hindi",keyboard,LoggerInstance);
                    break;

                case 2:
                    addLogString("English",keyboard,LoggerInstance);
                    break;

                case 3:
                    addLogString("Mathematics",keyboard,LoggerInstance);
                    break;

                case 4:
                    LoggerInstance.printLog();
                    break;

                default:
                    break;
            }
        }
    }

    private static int getChoice(Scanner keyboard) {
        int choice;
        System.out.println("\n\n1-Hindi\n2-English\n3-Mathematics\n4-PrintLog\n\nEnter negative number to exit");
        choice = keyboard.nextInt();
        return choice;
    }

    private static void addLogString(String book ,Scanner keyboard , Logger LoggerInstance)
    {
        int quantity;
        System.out.println("Enter sold Quantity ");
        quantity = keyboard.nextInt();
        LoggerInstance.addToLog(book + ", quantity = " + quantity);
    }
}
