package register.registerweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView hello(Model modelo) 
    {
        ModelAndView mv = new ModelAndView("hello"); //nome da pagina html que vai ser carregada
        modelo.addAttribute("mensagem", "Olá, Mundo!");//adicion
        modelo.addAttribute("nome", "Zezinho ");
        return mv;
    }

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request)
    {
        request.setAttribute("Jose", "Samuka");
        return "ola";
    }
}