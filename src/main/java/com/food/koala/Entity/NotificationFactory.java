package com.food.koala.Entity;

public class NotificationFactory {

    // This class would be creating Objects for other services
    public Notification getNotification(String notification) throws IllegalAccessException {
        if(notification.equalsIgnoreCase("Email")){
            return new EmailNotification();
        }else if(notification.equalsIgnoreCase("Text")){
            return new TextNotification();
        }
        throw new IllegalAccessException();
    }
}
