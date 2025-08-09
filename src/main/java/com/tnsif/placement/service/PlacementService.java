package com.tnsif.placement.service;

import com.tnsif.placement.entity.Placement;
import com.tnsif.placement.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    public Placement savePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}