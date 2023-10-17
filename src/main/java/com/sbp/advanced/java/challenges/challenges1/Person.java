package com.sbp.advanced.java.challenges.challenges1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
//    private static boolean hideAddress;
    private boolean hideAddress;
    private Address address;

    public Person(String firstName, String lastName, boolean hideAddress, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hideAddress = hideAddress;
        this.address = address;
    }

    public static class Address {
//    private static class Address {
//    private class Address {
        private String street;
        private String city;
        private int houseNumber;

        public String getPublicAddress() {

//            if (hideAddress) {
//                return "Hidden";
//            }
            return String.format("%d %s, %s", houseNumber, street, city);
        }
    }
}