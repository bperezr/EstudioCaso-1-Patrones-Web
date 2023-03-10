
package com.Cinelitas.cinelitas.Service;

import com.Cinelitas.cinelitas.Entity.Sala;
import com.Cinelitas.cinelitas.Repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService implements Isala {
    
   @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> getAllSala() {
           return (List<Sala>)salaRepository.findAll();
    }

    @Override
    public Sala getSalaById(long id) {
         return salaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveSala(Sala sala) {
        salaRepository.save(sala);
    }

    @Override
    public void delete(long id) {
         salaRepository.deleteById(id);
    }

    @Override
    public List<Sala> listSala() {
        return (List<Sala>) salaRepository.findAll();
    }
    
}
