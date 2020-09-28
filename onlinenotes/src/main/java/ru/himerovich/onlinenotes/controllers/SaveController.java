package ru.himerovich.onlinenotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.himerovich.onlinenotes.models.Note;
import ru.himerovich.onlinenotes.services.DBOperations;

@Controller
public class SaveController {
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("customer") Note note) {
        DBOperations.save(note);
        return "redirect:/";
    }
}
