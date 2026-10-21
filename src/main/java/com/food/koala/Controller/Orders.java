package com.food.koala.Controller;


import com.food.koala.Entity.FinancialTransaction;
import com.food.koala.Service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
@RequestMapping("/orders")
public class Orders {
    NotificationService notificationService = new NotificationService();

    @GetMapping("/create")
    public ResponseEntity<String> createOrders(){
        log.info("Calling the API for order creation");
        //Logic for Order Creation
        try{
            //Trying to send a email notification when someone hits the orders endpoint
            notificationService.sendNotification("Email");
            log.info("Now Creating a FTR for this notification fired");
            //Directly we will create FTR using Builder pattern now
            FinancialTransaction ftr = new FinancialTransaction.FinancialTransactionBuilder(28156L,"Accepted")
                    .setType("NOTIFICATION_FTR")
                    .build();


        }catch (Exception ex) {
            log.error("e: ", ex);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error Creating the order");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("Order has been placed successfully");
    }
}
