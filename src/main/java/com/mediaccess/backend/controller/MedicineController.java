
package com.mediaccess.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://127.0.0.1:5173"
})
@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @GetMapping
    public List<Map<String, String>> getMedicines() {

        return List.of(
            Map.of(
                "name", "Paracetamol",
                "use", "Fever and pain relief"
            ),
            Map.of(
                "name", "Cetirizine",
                "use", "Allergy relief"
            ),
            Map.of(
                "name", "ORS",
                "use", "Helps replace lost fluids"
            )
        );
    }
}


