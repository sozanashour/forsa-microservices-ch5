package com.forsa.craftsman_directory_service.controller;

import com.forsa.craftsman_directory_service.dto.CraftsmanContactSummaryResponse;
import com.forsa.craftsman_directory_service.entity.Craftsman;
import com.forsa.craftsman_directory_service.repository.CraftsmanRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/craftsmen")
public class CraftsmanController {

    private final CraftsmanRepository craftsmanRepository;

    public CraftsmanController(CraftsmanRepository craftsmanRepository) {
        this.craftsmanRepository = craftsmanRepository;
    }

    @PostMapping
    public ResponseEntity<Craftsman> createCraftsman(@RequestBody Craftsman craftsman) {
        Craftsman savedCraftsman = craftsmanRepository.save(craftsman);
        return ResponseEntity.ok(savedCraftsman);
    }

    @GetMapping("/{id}/contact-summary")
    public ResponseEntity<CraftsmanContactSummaryResponse> getCraftsmanContactSummary(@PathVariable Long id) {
        Optional<Craftsman> craftsmanOptional = craftsmanRepository.findById(id);

        if (craftsmanOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Craftsman craftsman = craftsmanOptional.get();

        CraftsmanContactSummaryResponse response = new CraftsmanContactSummaryResponse(
                craftsman.getId(),
                craftsman.getFullName(),
                craftsman.getPhone(),
                craftsman.getProfession(),
                craftsman.getCity()
        );

        return ResponseEntity.ok(response);
    }
}
