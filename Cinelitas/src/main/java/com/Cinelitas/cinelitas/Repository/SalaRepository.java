
package com.Cinelitas.cinelitas.Repository;

import com.Cinelitas.cinelitas.Entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalaRepository extends CrudRepository<Sala,Long> {
    
}
