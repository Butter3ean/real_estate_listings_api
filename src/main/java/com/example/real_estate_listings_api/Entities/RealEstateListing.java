package com.example.real_estate_listings_api.Entities;

import com.example.real_estate_listings_api.Embeddables.Address;
import com.example.real_estate_listings_api.Embeddables.Coordinates;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.net.URI;
import java.util.Objects;

//@Entity is a JPA annotation to make this object ready for storage in a JPA-based database
@Entity
public class RealEstateListing {

    private @Id @GeneratedValue Long id;
    private Integer mlsNum;
    private Coordinates coordinates;
    private Address address;
    private Integer price;
    private URI imgUrl;
    @Lob
    private URI listingUrl;

    public RealEstateListing() {}

    public RealEstateListing(Integer mlsNum, Coordinates coordinates, Address address, Integer price, URI imgUrl, URI listingUrl) {
        this.mlsNum = mlsNum;
        this.coordinates = coordinates;
        this.address = address;
        this.price = price;
        this.imgUrl = imgUrl;
        this.listingUrl = listingUrl;
    }

    public Integer getMlsNum() {
        return this.mlsNum;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public URI getImgUrl() {
        return this.imgUrl;
    }

    public URI getListingUrl() {
        return this.listingUrl;
    }

    public void setMlsNum(Integer mlsNum) {
        this.mlsNum = mlsNum;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setImgUrl(URI imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setListingUrl(URI listingUrl) {
        this.listingUrl = listingUrl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RealEstateListing)) {
            return false;
        }

        RealEstateListing realEstateListing = (RealEstateListing) obj;

        return Objects.equals(this.id, realEstateListing.id)
                && Objects.equals(this.mlsNum, realEstateListing.mlsNum)
                && Objects.equals(this.coordinates, realEstateListing.coordinates)
                && Objects.equals(this.address, realEstateListing.address)
                && Objects.equals(this.price, realEstateListing.price)
                && Objects.equals(this.imgUrl, realEstateListing.imgUrl)
                && Objects.equals(this.listingUrl, realEstateListing.listingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.mlsNum, this.coordinates, this.address, this.price, this.imgUrl, this.listingUrl);
    }

    @Override
    public String toString() {
        return "Listing{"+ "id=" + this.id + ", mlsNum=" + this.mlsNum + ", coordinates=" + this.coordinates +
                ", address=" + this.address + ", price=" + this.price + ", imgUrl='" + this.imgUrl + '\'' +
                ", listingUrl='" + this.listingUrl + '\'' + '}';
    }
}
