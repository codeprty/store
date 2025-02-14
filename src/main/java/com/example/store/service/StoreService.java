package com.example.store.service;

import com.example.store.dao.StoreDAO;
import com.example.store.model.Store;
import org.springframework.stereotype.Service;
import java.util.List;

// Marks this class as a service component for business logic.
@Service
public class StoreService {

	// Dependency on StoreDAO for data operations.
    private final StoreDAO storeDAO;

    // Constructor-based dependency injection for StoreDAO.
    public StoreService(StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }

    // Adds a store by delegating to the DAO layer.
    public void addStore(Store store) {
        storeDAO.addStore(store);
    }

    // Retrieves all stores from the DAO layer.
    public List<Store> getAllStores() {
        return storeDAO.getAllStores();
    }
}
