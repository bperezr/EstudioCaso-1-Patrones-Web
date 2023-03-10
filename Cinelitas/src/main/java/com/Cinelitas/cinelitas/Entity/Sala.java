
package com.Cinelitas.cinelitas.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sala")
public class Sala implements  Serializable {
    
  @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;   
    private int capacidad_max;

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

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }
       
         
}
