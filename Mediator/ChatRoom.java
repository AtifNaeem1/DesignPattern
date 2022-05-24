package com.Mediator;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class ChatRoom {
    public static void  showMessage(@NotNull User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
