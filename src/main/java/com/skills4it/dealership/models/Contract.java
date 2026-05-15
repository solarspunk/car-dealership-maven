package com.skills4it.dealership.models;

public class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private boolean isVehicleSold;
    private double totalPrice;
    private double monthlyPayment;


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
