package com.example.store.controller;

import com.example.store.model.Store;
import com.example.store.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Marks this class as a REST controller with base URL of "/stores".
@RestController
@RequestMapping("/stores")
public class StoreController {

	// Dependency on StoreService for business logic.
    private final StoreService storeService;

    // Constructor-based dependency injection for StoreService.
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    // Handles HTTP POST requests to add a new store.
    // POST: Add a new store
    @PostMapping
    public ResponseEntity<String> addStore(@RequestBody Store store) {
        storeService.addStore(store);
        return ResponseEntity.ok("Store added successfully!");
    }

    // Handles HTTP GET requests to retrieve all stores.
    @GetMapping
    public ResponseEntity<List<Store>> getAllStores() {
        return ResponseEntity.ok(storeService.getAllStores());
    }
}
