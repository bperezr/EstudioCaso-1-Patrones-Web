
package com.Cinelitas.cinelitas.Controller;

import com.Cinelitas.cinelitas.Entity.Sala;
import com.Cinelitas.cinelitas.Service.Isala;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SalaController {
    
   @Autowired
    private Isala salaService;   
   
    @GetMapping("/sala")
    public String index(Model model) {
        List<Sala> listaSala = salaService.getAllSala();
        model.addAttribute("sala", listaSala);
        return "Sala";
    }
    
    
    @PostMapping("/save")
    public String agregarSala(@ModelAttribute("sala") Sala sala) {
        salaService.saveSala(sala);
        return "redirect:/sala";
    }
    
}
