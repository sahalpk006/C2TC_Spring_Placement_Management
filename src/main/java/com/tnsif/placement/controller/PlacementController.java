package com.tnsif.placement.controller;

import com.tnsif.placement.entity.Placement;
import com.tnsif.placement.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return placementService.savePlacement(placement);
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return placementService.getPlacementById(id);
    }
}

//
