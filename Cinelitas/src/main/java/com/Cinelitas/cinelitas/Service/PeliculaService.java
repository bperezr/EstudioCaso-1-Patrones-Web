
package com.Cinelitas.cinelitas.Service;

import com.Cinelitas.cinelitas.Entity.Pelicula;
import com.Cinelitas.cinelitas.Repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService implements Ipelicula {
    
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>)peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaById(long idPelicula) {
         return peliculaRepository.findById(idPelicula).orElse(null);
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
         peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long idPelicula) {
           peliculaRepository.deleteById(idPelicula);
    }

    @Override
    public List<Pelicula> listpelicula() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }
    
}
