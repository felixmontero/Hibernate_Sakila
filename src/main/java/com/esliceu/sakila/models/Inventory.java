package com.esliceu.sakila.models;

import jakarta.persistence.*;
@Entity
public class Inventory {
    @Id
    @Column(name = "inventory_id")
    private int inventory_id;
    @Column(name = "film_id")
    private int film_id;
    @Column(name = "store_id")
    private int store_id;
    @Column(name = "last_update")
    private String last_update;

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}
