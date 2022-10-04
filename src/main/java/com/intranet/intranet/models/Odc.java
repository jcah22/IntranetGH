package com.intranet.intranet.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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


    @ManyToOne
    @JoinColumn(name = "requisicion_id")
    private Requisiciones requisicion;

    @OneToOne(mappedBy = "odc")
    private Directivo directivo;

   @ManyToOne
   @JoinColumn(name = "usuario")
   private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    public Odc() {
    }

    public Odc(Long id, String descripcion, String factura, Date fecha, boolean flete, double total, String usoCfdi,
            Requisiciones requisicion, Directivo directivo, Usuario usuario, Status status) {
        this.id = id;
        this.descripcion = descripcion;
        this.factura = factura;
        this.fecha = fecha;
        this.flete = flete;
        this.total = total;
        this.usoCfdi = usoCfdi;
        this.requisicion = requisicion;
        this.directivo = directivo;
        this.usuario = usuario;
        this.status = status;
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

    

    

    

   

   

 

  

    



   

   

    

    

    

   


}
