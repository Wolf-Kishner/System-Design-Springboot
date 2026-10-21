package com.food.koala.Entity;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(){
        // Logic to send the Noticiations
        System.out.println("This is an email Notification");
    }
}
