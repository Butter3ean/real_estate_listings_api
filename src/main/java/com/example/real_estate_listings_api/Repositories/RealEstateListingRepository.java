package com.example.real_estate_listings_api.Repositories;

import com.example.real_estate_listings_api.Entities.RealEstateListing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RealEstateListingRepository extends JpaRepository<RealEstateListing, Long> {

    RealEstateListing findByMlsNum(Integer mlsNum);

    List<RealEstateListing> findByAddress_City(String city);
}
