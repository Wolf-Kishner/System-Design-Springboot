package com.food.koala.Service;

import com.food.koala.Entity.Notification;
import com.food.koala.Entity.NotificationFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {
    //This class would be using those objects to actually send out email/text notifications to client
    NotificationFactory notificationFactory = new NotificationFactory();

     public void sendNotification(String type) throws IllegalAccessException {
         if(type.equalsIgnoreCase("Email")){
             Notification notification = notificationFactory.getNotification(type);
             notification.sendNotification();
         }else if (type.equalsIgnoreCase("Text")) {
             Notification notification = notificationFactory.getNotification(type);
             notification.sendNotification();
         }
     }


}
