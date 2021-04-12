package com.bose.server.controller;

import static net.logstash.logback.argument.StructuredArguments.kv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

/**
 * Catalog controller
 *
 * @author ms1050964
 * @since 12/04/2021
 */
@RestController
public class CatalogController implements ProductCatalogApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloGDSController.class);

    @Autowired
    private ControllerProperties controllerProperties;

    // protected helps to keep tests in sync more easily; not recommended practice
    protected static final String SAY_HELLO = "Hello Backend GDS";

    public ResponseEntity<String> helloGDS() {
        // as "name" is marked for privacy masking, your log should show "name":"****"
        LOGGER.info("Received request to say hello", kv("name", controllerProperties.getName()));

        return ResponseEntity.ok().body(SAY_HELLO);
    }

}