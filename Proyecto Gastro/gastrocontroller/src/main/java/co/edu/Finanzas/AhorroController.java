package co.edu.Finanzas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AhorroController {

    @Autowired
    private AhorroRepository ahorroRepository;

    // Método para mostrar el formulario, ahora mapea a "/ahorro"
    @GetMapping("/ahorro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("ahorro", new Ahorro());  // Agrega el modelo de ahorro a la vista
        return "index";  // Devuelve la vista "index.html"
    }

    // Método para guardar el ahorro en la base de datos
    @PostMapping("/guardarAhorro")
    public String guardarAhorro(@ModelAttribute Ahorro ahorro) {
        ahorroRepository.save(ahorro);  // Guarda el objeto Ahorro en la base de datos
        return "redirect:/ahorro";  // Redirige a la vista de formulario después de guardar
    }
}
