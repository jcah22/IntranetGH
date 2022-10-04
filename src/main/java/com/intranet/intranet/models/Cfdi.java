package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cfdi")
public class Cfdi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;

    @OneToOne(mappedBy = "cfdi")
    private Odc odc;

    public Cfdi() {
    }

    public Cfdi(Long id, String codigo, String nombre, Odc odc) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.odc = odc;
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

    public Odc getOdc() {
        return odc;
    }

    public void setOdc(Odc odc) {
        this.odc = odc;
    }

}
