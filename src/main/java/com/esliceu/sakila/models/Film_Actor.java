package com.esliceu.sakila.models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Film_Actor {
    @Id
    @Column(name = "actor_id")
    private int actor_id;
    @Column(name = "film_id")
    private int film_id;
    @Column(name = "last_update")
    private Date last_update;

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
