
package com.Cinelitas.cinelitas.Service;

import com.Cinelitas.cinelitas.Entity.Pelicula;
import java.util.List;


public interface Ipelicula {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById(long idPelicula);
    public void savePelicula (Pelicula pelicula);    
    public void delete (long idPelicula);       
    public List<Pelicula> listpelicula();
    
    
}
