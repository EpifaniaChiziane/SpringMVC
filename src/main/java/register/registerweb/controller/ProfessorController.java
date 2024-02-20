package register.registerweb.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import register.registerweb.model.Professor;
import register.registerweb.model.StatusProfesor;

@Controller
public class ProfessorController {
   
    @GetMapping("/professores")
    public ModelAndView index()
    {
        professor jose=new Professor("Jose", new BigDecimal(500), StatusProfesor.ATIVO);
        professore maria=new Professor("Maria", new BigDecimal(600), StatusProfesor.APOSENTADO);
        professors Moises=new Professor( "Moises", new BigDecimal(700), StatusProfesor.INATIVO);

        List<Professor> professores=Arrys.AsList(jose, maria, Moises);
        return "professores/index";

        ModelAndView mv =new ModelAndView("professores/index");
        //mv.addObject("nome","Joao");
       // mv.addObject("valor",new BigDecimal(123));
       mv.addObject("professores,", professores);

       return mv;
    }
}
