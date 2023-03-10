
package com.Cinelitas.cinelitas.Repository;

import com.Cinelitas.cinelitas.Entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {
    
}
