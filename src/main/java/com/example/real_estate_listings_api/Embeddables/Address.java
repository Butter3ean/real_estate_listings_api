package com.example.real_estate_listings_api.Embeddables;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    public Address() {}

    public Address(String streetAddress, String city, String state, String zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.streetAddress, this.city, this.state, this.zipCode);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Address)) {
            return false;
        }

        Address address = (Address) obj;

        return Objects.equals(this.streetAddress, address.streetAddress)
                && Objects.equals(this.city, address.city)
                && Objects.equals(this.state, address.state)
                && Objects.equals(this.zipCode, address.zipCode);
    }

    @Override
    public String toString() {
        return "Address{" + "streetAddress='" + this.streetAddress + '\'' +
                ", city='" + this.city + '\'' + ", state='" + this.state + '\'' +
                ", zipCode='" + this.zipCode +'\'' + '}';
    }
}
