package com.bose.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Endpoint to return a simple response
 *
 * @author ms1050964
 * @since 12/04/2021
 */
@RequestMapping(value = "/catalog")
public interface ProductCatalogApi {

    /**
     * Endpoint which returns a response with HttpStatus 200
     *
     * @return HttpStatus.OK
     */
    @GetMapping
    @ResponseBody
    ResponseEntity<String> helloGDS();
}