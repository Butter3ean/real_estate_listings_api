package com.example.real_estate_listings_api.Repositories;

import com.example.real_estate_listings_api.Entities.RealEstateListing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RealEstateListingRepository extends JpaRepository<RealEstateListing, Long> {

    Optional<RealEstateListing> findByMlsNum(Integer mlsNum);

    List<RealEstateListing> findByAddress_city(String city);

    List<RealEstateListing> findByAddress_zipCode(String zipCode);
}
