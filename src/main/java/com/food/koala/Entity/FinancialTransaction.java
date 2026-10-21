package com.food.koala.Entity;

import java.util.Date;

public class FinancialTransaction {

    private final Long paymentId;
    private final String state;

    private final Date createdAt;
    private final String type;

    // 1] Create a private Constrcutor with Builder as arg
    private FinancialTransaction(FinancialTransactionBuilder builder) {
        this.paymentId=builder.paymentId;
        this.state=builder.state;
        this.createdAt=builder.createdAt;
        this.type=builder.type;
    }

    // 2] Create the static nested builder class
    public static class FinancialTransactionBuilder {
        private final Long paymentId;
        private final String state;
        private Date createdAt;
        private  String type;

        //3] Create the Constructor for the Builder
        public FinancialTransactionBuilder(Long paymentId,String state){
            this.paymentId=paymentId;
            this.state=state;
        }

        public FinancialTransactionBuilder setDate(Date date) {
            this.createdAt=date;
            return this;
        }

        public FinancialTransactionBuilder setType(String type){
           this.type=type;
           return this;
        }
        // 4] Finally create a Build Method to reutnr the Obkect of the parent class
        public FinancialTransaction build(){
            return new FinancialTransaction(this);
        }
    }
}
