
package com.Cinelitas.cinelitas.Service;

import com.Cinelitas.cinelitas.Entity.Sala;
import java.util.List;


public interface Isala {
    
    public List<Sala> getAllSala();
    public Sala getSalaById(long id);
    public void saveSala (Sala sala);    
    public void delete (long id);       
    public List<Sala> listSala();    
}
