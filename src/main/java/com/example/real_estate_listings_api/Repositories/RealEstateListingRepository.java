package com.example.real_estate_listings_api.Repositories;

import com.example.real_estate_listings_api.Entities.RealEstateListing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealEstateListingRepository extends JpaRepository<RealEstateListing, Long> {
}
