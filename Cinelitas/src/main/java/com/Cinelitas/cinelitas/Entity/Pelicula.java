
package com.Cinelitas.cinelitas.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;  
    private float costo_entrada;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
    
    @ManyToOne
     @JoinColumn(name ="idsala")
    private Sala idSala;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto_entrada() {
        return costo_entrada;
    }

    public void setCosto_entrada(float costo_entrada) {
        this.costo_entrada = costo_entrada;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }
    
    
    
    
}
