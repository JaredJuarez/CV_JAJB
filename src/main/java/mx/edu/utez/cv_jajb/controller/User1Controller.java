package mx.edu.utez.cv_jajb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class User1Controller {
    @GetMapping("")
    public String getMessage() {
        return "hola desde user1";
    }
}
