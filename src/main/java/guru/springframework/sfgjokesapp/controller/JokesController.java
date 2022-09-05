package guru.springframework.sfgjokesapp.controller;

import guru.springframework.sfgjokesapp.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final QuoteService quoteService;

    public JokesController(QuoteService quoteService){
        this.quoteService=quoteService;
    }


    @RequestMapping({"/",""})
    public String performAction(Model model){
        model.addAttribute("joke",quoteService.getJoke());
        return "index";
    }

}
