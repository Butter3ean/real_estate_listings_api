package com.example.real_estate_listings_api.Controllers;

import com.example.real_estate_listings_api.Entities.RealEstateListing;
import com.example.real_estate_listings_api.Exceptions.ListingNotFoundException;
import com.example.real_estate_listings_api.Repositories.RealEstateListingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RealEstateListingsController {

    private final RealEstateListingRepository repository;

    RealEstateListingsController(RealEstateListingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/realestatelistings")
    List<RealEstateListing> getAll() {
        return repository.findAll();
    }

    @GetMapping("/realestatelistings/{id}")
    RealEstateListing getSingleListing(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ListingNotFoundException(id));
    }

    @PostMapping("/realestatelistings")
    RealEstateListing newRealEstateListing(@RequestBody RealEstateListing newRealEstateListing) {
        return repository.save(newRealEstateListing);
    }

    @DeleteMapping("/realestatelistings/{id}")
    void deleteListing(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
