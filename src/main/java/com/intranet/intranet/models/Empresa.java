package com.intranet.intranet.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String correo;
    private String  direccion;
    private String nombre;
    private String rfc;
    private  String telefono;
    private String imagen;

    @ManyToMany(mappedBy = "empresas")
    private List<Requisiciones> reqs;

    public Empresa() {
    }

    public Empresa(Long id, String correo, String direccion, String nombre, String rfc, String telefono, String imagen,
            List<Requisiciones> reqs) {
        this.id = id;
        this.correo = correo;
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.imagen = imagen;
        this.reqs = reqs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Requisiciones> getReqs() {
        return reqs;
    }

    public void setReqs(List<Requisiciones> reqs) {
        this.reqs = reqs;
    }

    

    

    

    
}
