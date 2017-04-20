package com.theironyard;

/**
 * Created by Keith on 4/20/17.
 */
public class Order {
    String payingCustomer;

    public Order(String payingCustomer) {
        this.payingCustomer= payingCustomer;
    }

    public String getPayingCustomer() {
        return payingCustomer;
    }

    public void setPayingCustomer(String payingCustomer) {
        this.payingCustomer = payingCustomer;
    }
}
