package com.bose.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Product catalog microservice
 *
 * @author ms1050964
 * @since 12/04/2021
 */
@SpringBootApplication
@EnableConfigurationProperties
public class ProductCatalogServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelloGDSBackendApplication.class, args);
    }
}