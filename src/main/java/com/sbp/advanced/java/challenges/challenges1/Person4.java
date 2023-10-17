package com.sbp.advanced.java.challenges.challenges1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Person4 {
    private String firstName;
    private String lastName;
    private boolean hideAddress;
    private Address4 address;

    public Person4(String firstName, String lastName, boolean hideAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hideAddress = hideAddress;
        this.address = address;
    }

    public void setAddress(Address4 address) { this.address = address;}

//    public static class Address4 {
    public class Address4 {
        private String street;
        private String city;
        private int houseNumber;

        public Address4( ) {
        }

        public Address4(String street, String city, int houseNumber) {
            this.street = street;
            this.city = city;
            this.houseNumber = houseNumber;
        }

        public String getPublicAddress() {
            if (hideAddress) {
                return "Hidden";
            }
            return String.format("%d %s, %s", houseNumber, street, city);
        }
    }
}
