package com.intranet.intranet.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Requisiciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;

    @OneToMany(mappedBy = "requisicion")
    private List<Odc> odc;

    @ManyToMany
    private List<Empresa> empresas;

    public Requisiciones() {
    }

    public Requisiciones(Long id, String codigo, String nombre, List<Odc> odc, List<Empresa> empresas) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.odc = odc;
        this.empresas = empresas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Odc> getOdc() {
        return odc;
    }

    public void setOdc(List<Odc> odc) {
        this.odc = odc;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

}
