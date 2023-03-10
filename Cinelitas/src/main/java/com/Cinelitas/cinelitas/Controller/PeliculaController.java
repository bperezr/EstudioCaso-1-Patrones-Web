
package com.Cinelitas.cinelitas.Controller;

import com.Cinelitas.cinelitas.Entity.Pelicula;
import com.Cinelitas.cinelitas.Service.Ipelicula;
import com.Cinelitas.cinelitas.Service.Isala;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PeliculaController {
    
    
   @Autowired
    private Ipelicula peliculaService;
   
   @Autowired
   private Isala salaService;
   
     @GetMapping("/peliculas")
    public String index(Model model) {
        List<Pelicula> listaPelicula= peliculaService.getAllPelicula();
        model.addAttribute("Pelicula", listaPelicula);
        return "Peliculas";
    }
    
    
    @GetMapping("/peliculas/nuevo")
    public String crearPelicula(Model model) {
        Pelicula pelicula = new Pelicula();
        model.addAttribute("Pelicula", pelicula);
        return "CrearPelicula";
    }

    @GetMapping("/pelicula/editar/{id}")
    public String editarPelicula(@PathVariable Long id, Model model) {
        Pelicula peliculaId = peliculaService.getPeliculaById(id);
        model.addAttribute("Pelicula", peliculaId);
        return "EditarPelicula";
    }

    @GetMapping("/pelicula/{id}")
    public String elimitarPelicula(@PathVariable Long id) {
        peliculaService.delete(id);
        return "redirect:/peliculas";
    }
    
    
      @PostMapping("/pelicula/editar/{id}")
    public String actualizarPelicula(@PathVariable Long id, @ModelAttribute("Pelicula") Pelicula pelicula) {
       Pelicula peliculaEditar = peliculaService.getPeliculaById(id);
        peliculaEditar.setId(id);
        peliculaEditar.setNombre(pelicula.getNombre());
        peliculaService.savePelicula(peliculaEditar);
        return "redirect:/peliculas";
    }

    
}
