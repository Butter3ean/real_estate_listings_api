package com.example.real_estate_listings_api;

//import com.example.real_estate_listings_api.Entities.RealEstateListing;
//import com.example.real_estate_listings_api.Repositories.RealEstateListingRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.net.URI;
//
//@Configuration
//public class LoadDatabase {
//
//    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//    @Bean
//    CommandLineRunner initDatabase(RealEstateListingRepository repository) {
//        return args -> {
//            log.info("Preloading " + repository.save(
//                    new RealEstateListing(
//                            new Coordinates(45.0, 45.0),
//                            "Savannah",
//                            "GA",
//                            new URI("https://photos.zillowstatic.com/fp/90cf5e67d5b9dadcffbdadbd677dc801-cc_ft_768.webp"),
//                            new URI("https://www.zillow.com/homedetails/105-Wild-Heron-Villas-Rd-Savannah-GA-31419/65259100_zpid/"))));
//        };
//    }
//}
