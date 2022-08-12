package com.example.discountratesystem;

public class DiscountRate {

    /**
     *
     * You are asked to write a discount system for a beauty saloon, which provides services and sells beauty products.
     * It offers 3 types of memberships: Premium, Gold and Silver.
     * Premium, gold and silver members receive a discount of 20%, 15%, and 10%, respectively, for all services provided.
     * Customers without membership receive no discount. // its important idea
     * All members receive a flat 10% discount on products purchased (this might change in future).
     * Your system shall consist of three classes: Customer, Discount and Visit, as shown in the class diagram.
     * It shall compute the total bill
     * if a customer purchases $x of products
     *                     and $y of services, for a visit.
     * Also write a test program to exercise all the classes.
     */

        private static double serviceDiscountPremium = 0.2; // as its required form the question
        private static double serviceDiscountGold = 0.15;
        private static double serviceDiscountSilver = 0.1;
        private static double productDiscountPremium = 0.1;
        private static double productDiscountGold = 0.1;
        private static double productDiscountSilver = 0.1;  // why we ddint make them from setter and getter by contractor

        public static double getServiceDiscountRate(String type) {  // why we didnt name this function above
            switch (type) {
                case "Premium":
                    return serviceDiscountPremium;
                case "Gold":
                    return serviceDiscountGold;
                case "Silver":
                    return serviceDiscountSilver;
                default:
                    throw new IllegalArgumentException("wrong service type specified , you should pay attention");
            }
        }

        public static double getProductDiscountRate(String type) {
            switch (type) {
                case "Premium":
                    return productDiscountPremium;
                case "Gold":
                    return productDiscountGold;
                case "Silver":
                    return productDiscountSilver;
                default:
                    throw new IllegalArgumentException("wrong service type specified");
            }
        }

    }

