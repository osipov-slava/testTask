package com.space.service;

import com.space.model.Ship;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

public interface ShipService {
    Page findAll(Specification<Ship> specification, Pageable pageable);

    long count(Specification<Ship> specification);

    ResponseEntity<?> create(Ship ship);

    ResponseEntity<?> existsById(String id);

    ResponseEntity<?> findById(String id);

    ResponseEntity<?> deleteById(String id);

    ResponseEntity<?> update(String id, Ship ship);
}
