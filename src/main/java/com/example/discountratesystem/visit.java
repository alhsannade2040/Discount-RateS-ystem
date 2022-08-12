package com.example.discountratesystem;

import java.util.Date;

public class visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

//    public visit(Customer cus, Date date) {
//
//    }

    public visit(Customer name, Date date) {
        this.customer = name;
        this.date = date;
    }

    public String getCustomerName() {
        return customer.getName(); // it could be Null
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense +=  productExpense;
    }

    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType())));

    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer name=" + customer.getName() +
                ", customer member=" + customer.getMember() +
                ", customer member type=" + customer.getMemberType() +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
