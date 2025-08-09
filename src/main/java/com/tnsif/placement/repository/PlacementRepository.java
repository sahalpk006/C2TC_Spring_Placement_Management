package com.tnsif.placement.repository;

import com.tnsif.placement.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
}