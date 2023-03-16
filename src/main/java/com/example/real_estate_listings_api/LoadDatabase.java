package com.example.real_estate_listings_api;

//import com.example.real_estate_listings_api.Embeddables.Coordinates;
//import com.example.real_estate_listings_api.Embeddables.Address;
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
//            log.info("Preloading" + repository.save(
//                new RealEstateListing(
//                        1637262,
//                        new Coordinates(32.02707873184191, -81.24459080105757),
//                        new Address("170 Laurelwood Dr", "Savannah", "GA", "31419"),
//                        279999,
//                        new URI("https://photos.zillowstatic.com/fp/7e92200076961b21fb5915ac62dd71db-cc_ft_768.webp"),
//                        new URI("https://www.zillow.com/homedetails/170-Laurelwood-Dr-Savannah-GA-31419/14149139_zpid/")
//                )
//            ));
//        };
//    }
//}
