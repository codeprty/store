package com.example.store.model;

import jakarta.persistence.*;
import java.util.Arrays;

// Marks this class as a JPA entity and maps it to the "stores" table.
@Entity
@Table(name = "stores")
public class Store {

	// Primary key with auto-incremented ID.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Store name
    @Column(name = "name")
    private String name;

    // Store phone number
    @Column(name = "phone_number")
    private String phoneNumber;

    // Localities stored as comma-separated string.
    @Column(name = "localities")
    private String localities;

    // Default constructor.
    public Store() {
    }

    // Constructor to initialize all fields, converting localities array to a CSV string.
    public Store(Long id, String name, String phoneNumber, String[] localities) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.localities = String.join(",", localities);
    }

    // Getter and setter methods for all fields.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Converts the stored CSV localities string back to an array.
    public String[] getLocalities() {
        return localities != null ? localities.split(",") : new String[]{};
    }

    // Converts an array of localities to a CSV string for storage.
    public void setLocalities(String[] localities) {
        this.localities = String.join(",", localities);
    }

    // Returns a string representation of the Store object.
    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", localities=" + Arrays.toString(getLocalities()) +
                '}';
    }
}