import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Indica que esta clase es un controlador MVC
public class HomeController {

    // Maneja las peticiones GET para la ruta raíz "/"
    @GetMapping({"/", "/index", "/home"})
    public String index() {
        // Devuelve el nombre de la vista (index.html o index.jsp)
        // que debe estar en src/main/resources/templates
        return "index"; 
    }
}