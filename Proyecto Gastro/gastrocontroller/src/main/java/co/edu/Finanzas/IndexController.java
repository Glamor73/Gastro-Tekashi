package co.edu.Finanzas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Mapeo para la ruta raíz "/"
    @GetMapping("/")
    public String mostrarInicio() {
        // Retorna la vista "index.html" ubicada en src/main/resources/templates
        return "index";
    }
}
