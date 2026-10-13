
package com.mediaccess.backend.controller;

import com.mediaccess.backend.model.Medicine;
import com.mediaccess.backend.repository.MedicineRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    private final MedicineRepository repository;

    public MedicineController(MedicineRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Medicine> getMedicines(
            @RequestParam(required = false) String search) {

        if (search == null || search.isBlank()) {
            return repository.findAll();
        }

        return repository.findByNameContainingIgnoreCase(search);
    }

    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Medicine not found"));
    }
}





