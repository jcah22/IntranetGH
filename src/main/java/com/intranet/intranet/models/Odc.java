package com.intranet.intranet.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "odc")
public class Odc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String factura;
    private Date fecha;
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_req")
    private Requisiciones requisicion;
    

    @OneToOne
    private Directivo directivo;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @OneToOne
    private Cfdi cfdi;

    public Odc() {
    }

    public Odc(Long id, String descripcion, String factura, Date fecha, double total, Requisiciones requisicion,
            Directivo directivo, Usuario usuario, Status status, Cfdi cfdi) {
        this.id = id;
        this.descripcion = descripcion;
        this.factura = factura;
        this.fecha = fecha;
        this.total = total;
        this.requisicion = requisicion;
        this.directivo = directivo;
        this.usuario = usuario;
        this.status = status;
        this.cfdi = cfdi;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Requisiciones getRequisicion() {
        return requisicion;
    }

    public void setRequisicion(Requisiciones requisicion) {
        this.requisicion = requisicion;
    }

    public Directivo getDirectivo() {
        return directivo;
    }

    public void setDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cfdi getCfdi() {
        return cfdi;
    }

    public void setCfdi(Cfdi cfdi) {
        this.cfdi = cfdi;
    }

    

    

  


    
  

   

   

 

    

}
