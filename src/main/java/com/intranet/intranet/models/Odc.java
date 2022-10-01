package com.intranet.intranet.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Odc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String factura;
    private Date fecha;
    private boolean flete;
    private double total;
    private String usoCfdi;


    @ManyToMany(mappedBy = "odcr")
    private List<Requisiciones> reqs;

    @OneToOne(mappedBy = "odc")
    private Directivo directivo;

    @ManyToMany(mappedBy = "odcu")
    private List<Usuario> usuarios;

    public Odc() {
    }

    public Odc(Long id, String descripcion, String factura, Date fecha, boolean flete, double total, String usoCfdi,
            List<Requisiciones> reqs, Directivo directivo, List<Usuario> usuarios) {
        this.id = id;
        this.descripcion = descripcion;
        this.factura = factura;
        this.fecha = fecha;
        this.flete = flete;
        this.total = total;
        this.usoCfdi = usoCfdi;
        this.reqs = reqs;
        this.directivo = directivo;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isFlete() {
        return flete;
    }

    public void setFlete(boolean flete) {
        this.flete = flete;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getUsoCfdi() {
        return usoCfdi;
    }

    public void setUsoCfdi(String usoCfdi) {
        this.usoCfdi = usoCfdi;
    }

    public List<Requisiciones> getReqs() {
        return reqs;
    }

    public void setReqs(List<Requisiciones> reqs) {
        this.reqs = reqs;
    }

    public Directivo getDirectivo() {
        return directivo;
    }

    public void setDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    

    

    

    
}
