package guru.springframework.norris.chuck.controller;

import guru.springframework.norris.chuck.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String sayJoke(Model model) {

        model.addAttribute("Joke", jokeService.sayJoke());

        return "Joke/index";
    }
}
