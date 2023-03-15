package com.example.real_estate_listings_api;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Coordinates {

    private Double latitude;
    private Double longitude;

    public Coordinates() {
    }

    public Coordinates(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Coordinates)) {
            return false;
        }

        Coordinates coordinates = (Coordinates) obj;
        return Objects.equals(this.latitude, coordinates.latitude)
                && Objects.equals(this.longitude, coordinates.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.latitude, this.longitude);
    }

    @Override
    public String toString() {
        return "Coordinates{" + "Latitude=" + this.latitude + ", Longitude=" + this.longitude + '}';

    }


}
