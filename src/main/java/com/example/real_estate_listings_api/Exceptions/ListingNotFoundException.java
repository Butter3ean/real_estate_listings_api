package com.example.real_estate_listings_api.Exceptions;

public class ListingNotFoundException extends RuntimeException{

    public ListingNotFoundException(Long id) {
        super("Could not find listing " + id);
    }
}
