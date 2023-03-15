package com.example.real_estate_listings_api.Controllers;

import com.example.real_estate_listings_api.Entities.RealEstateListing;
import com.example.real_estate_listings_api.Repositories.RealEstateListingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/realestatelistings")
    RealEstateListing newRealEstateListing(@RequestBody RealEstateListing newRealEstateListing) {
        return repository.save(newRealEstateListing);
    }

}
