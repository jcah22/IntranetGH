package com.intranet.intranet.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "status")
    private List<Odc> odcs;

    public Status() {
    }

    public Status(Long id, String nombre, List<Odc> odcs) {
        this.id = id;
        this.nombre = nombre;
        this.odcs = odcs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Odc> getOdcs() {
        return odcs;
    }

    public void setOdcs(List<Odc> odcs) {
        this.odcs = odcs;
    }

}
