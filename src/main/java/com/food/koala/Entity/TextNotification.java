package com.food.koala.Entity;

public class TextNotification implements Notification {

    @Override
    public void sendNotification(){
        System.out.println("This is a Text Notification");
    }
}
