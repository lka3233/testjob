package ru.himerovich.onlinenotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.himerovich.onlinenotes.models.Note;
import ru.himerovich.onlinenotes.services.DBOperations;

@Controller
public class NewController {
    @GetMapping("/new")
    public String showNew(Model model){
        model.addAttribute("note",new Note());
        return "/new";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST, produces ="text/plain;charset=UTF-8")
    public String saveNote(@ModelAttribute("note") Note note) {
        DBOperations.save(note);
        return "redirect:/";
    }
}
