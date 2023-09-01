package com.tsk.locationservice.controller;

import com.tsk.locationservice.model.Location;
import com.tsk.locationservice.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationRepository locationRepository;

    @Autowired
    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }



    @PutMapping("/{id}")
    public Location updateLocation(@PathVariable Long id, @RequestBody Location locationDetails) {

        return locationDetails;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLocation(@PathVariable Long id) {

        return null;
    }
}

