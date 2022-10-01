package com.intranet.intranet.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String telefono;
    private boolean status;
    private String username;

    @ManyToOne
    @JoinColumn(name = "departamento")
    private Area area;

    @ManyToMany
    private List<Odc> odcu;

    public Usuario() {
    }

    public Usuario(Long id, String apellidoPaterno, String apellidoMaterno, String nombres, String telefono,
            boolean status, String username, Area area, List<Odc> odcu) {
        this.id = id;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.telefono = telefono;
        this.status = status;
        this.username = username;
        this.area = area;
        this.odcu = odcu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Odc> getOdcu() {
        return odcu;
    }

    public void setOdcu(List<Odc> odcu) {
        this.odcu = odcu;
    }

    

    

    

 






    
}
