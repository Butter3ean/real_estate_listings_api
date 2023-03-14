package com.example.real_estate_listings_api.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.net.URI;
import java.util.Objects;

//@Entity is a JPA annotation to make this object ready for storage in a JPA-based database
@Entity
public class RealEstateListings {

    private @Id @GeneratedValue Long id;
    private Coordinates coordinates;
    private String city;
    private String state;
    private URI imgUrl;
    private URI listingUrl;

    RealEstateListings() {}

    RealEstateListings(Coordinates coordinates, String city, String state, URI imgUrl, URI listingUrl) {
        this.coordinates = coordinates;
        this.city = city;
        this.state = state;
        this.imgUrl = imgUrl;
        this.listingUrl = listingUrl;
    }

    public Long getId() {
        return this.id;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public URI getImgUrl() {
        return this.imgUrl;
    }

    public URI getListingUrl() {
        return this.listingUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setImgUrl(URI imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setListingUrl(URI listingUrl) {
        this.listingUrl = listingUrl;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof RealEstateListings)) {
            return false;
        }

        RealEstateListings realEstateListings = (RealEstateListings) obj;

        return Objects.equals(this.id, realEstateListings.id)
                && Objects.equals(this.coordinates, realEstateListings.coordinates)
                && Objects.equals(this.city, realEstateListings.city)
                && Objects.equals(this.state, realEstateListings.state)
                && Objects.equals(this.imgUrl, realEstateListings.imgUrl)
                && Objects.equals(this.listingUrl, realEstateListings.listingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.coordinates, this.city, this.state, this.imgUrl, this.listingUrl);
    }

    @Override
    public String toString() {
        return "Listing{" + "id=" + this.id + ", coordinates=" + this.coordinates + ", city='"
                + this.city + '\'' + ", state='" + this.state + '\'' + ", imgUrl="
                + this.imgUrl + ", listingUrl=" + this.listingUrl + '}';
    }
}
