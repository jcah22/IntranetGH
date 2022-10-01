package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Directivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToOne
    private Odc odc;

    public Directivo() {
    }

    public Directivo(Long id, String nombre, Odc odc) {
        this.id = id;
        this.nombre = nombre;
        this.odc = odc;
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

    public Odc getOdc() {
        return odc;
    }

    public void setOdc(Odc odc) {
        this.odc = odc;
    }

    

    

    


    
}
