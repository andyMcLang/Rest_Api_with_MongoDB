package com.andylang.restapi;

public class Address {
    private String country;
    private String city;
    private String postCode;

    // Parametriton konstruktori
    public Address() {
    }

    // Parametrillinen konstruktori
    public Address(String country, String city, String postCode) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
    }

    // Getterit ja setterit
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postCode + '\'' +
                '}';
    }
}
