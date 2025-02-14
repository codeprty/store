package com.example.store.dao;

import com.example.store.model.Store;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

// Marks this class as a repository component for dependency injection.
@Repository
public class StoreDAO {

	// In-memory list to store store objects.
    private final List<Store> storeList = new ArrayList<>();

    // Adds a store to the in-memory list.
    public void addStore(Store store) {
        storeList.add(store);
    }

    // Returns a copy of the list containing all stores.
    public List<Store> getAllStores() {
        return new ArrayList<>(storeList);
    }
}
