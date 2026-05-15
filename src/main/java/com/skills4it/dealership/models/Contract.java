package com.skills4it.dealership.models;

//todo: check if the methods need to be abstract

public class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private boolean isVehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    //   A SalesContract will include the following additional information:
//        • Sales Tax Amount (5%)
//• Recording Fee ($100)
//• Processing fee ($295 for vehicles under $10,000 and $495 for all others
//        • Whether they want to finance (yes/no)
//• Monthly payment (if financed) based on:
//        • All loans are at 4.25% for 48 months if the price is $10,000 or more
//
//     • Otherwise they are at 5.25% for 24 month
//  Methods will include a constructor and getters and setters for all fields except total
//  price and monthly payment.
//  You should provide overrides for getTotalPrice() and getMonthlyPayment() that will
//return computed values based on the rules above.  It is possible that
//  getMonthlyPayment() would return 0 if they chose the NO loan option.


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean isVehicleSold() {
        return isVehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        isVehicleSold = vehicleSold;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }



}
