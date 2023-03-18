package com.example.real_estate_listings_api.Controllers;

import com.example.real_estate_listings_api.Entities.RealEstateListing;
import com.example.real_estate_listings_api.Exceptions.ListingNotFoundException;
import com.example.real_estate_listings_api.Repositories.RealEstateListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/realestatelistings")
public class RealEstateListingsController {

    @Autowired
    private RealEstateListingRepository repository;

    //Returns all listings
    @GetMapping()
    List<RealEstateListing> getAll() {
        return repository.findAll();
    }

    //Returns all listings that match a certain city
    @GetMapping(params = {"city"})
    List<RealEstateListing> getByCity(@RequestParam String city) {
        return repository.findByAddress_city(city);
    }

    //Returns a single listing with that mls number
    @GetMapping(params = {"mlsNum"})
    Optional<RealEstateListing> getListingByMls(Integer mlsNum) {
        Optional<RealEstateListing> listing = repository.findByMlsNum(mlsNum);
        if(listing.isEmpty()) {
            throw new ListingNotFoundException(mlsNum.longValue());
        }
        return repository.findByMlsNum(mlsNum);
    }

    //returns all listings with that zipcode
    @GetMapping(params = {"zipCode"})
    List<RealEstateListing> getListingByZipCode(String zipCode) {
        return repository.findByAddress_zipCode(zipCode);
    }

    //returns a single listing with that id
    @GetMapping("/{id}")
    RealEstateListing getSingleListing(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ListingNotFoundException(id));
    }

    //allows a user to add a new listing to the db
    @PostMapping()
    RealEstateListing newRealEstateListing(@RequestBody RealEstateListing newRealEstateListing) {
        return repository.save(newRealEstateListing);
    }

    @PutMapping("/{id}")
    RealEstateListing replaceListing(@RequestBody RealEstateListing newRealEstateListing, @PathVariable Long id) {
        return repository.findById(id)
                .map(listing -> {
                    listing.setListingUrl(newRealEstateListing.getListingUrl());
                    listing.setAddress(newRealEstateListing.getAddress());
                    listing.setCoordinates(newRealEstateListing.getCoordinates());
                    listing.setPrice(newRealEstateListing.getPrice());
                    listing.setImgUrl(newRealEstateListing.getImgUrl());
                    listing.setMlsNum(newRealEstateListing.getMlsNum());
                    return repository.save(listing);
                })
                .orElseGet(() -> {
                    newRealEstateListing.setId(id);
                    return repository.save(newRealEstateListing);
                });
    }

    //deletes a listing with that id from the database
    @DeleteMapping("/{id}")
    void deleteListing(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
