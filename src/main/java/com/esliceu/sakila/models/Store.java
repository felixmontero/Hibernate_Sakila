package com.esliceu.sakila.models;

import jakarta.persistence.*;


@Entity
public class Store {
    @Id
    @Column(name = "store_id")
    private int store_id;
    @Column(name = "manager_staff_id")
    private int manager_staff_id;
    @Column(name = "address_id")
    private int address_id;
    @Column(name = "last_update")
    private String last_update;

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getManager_staff_id() {
        return manager_staff_id;
    }

    public void setManager_staff_id(int manager_staff_id) {
        this.manager_staff_id = manager_staff_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}
