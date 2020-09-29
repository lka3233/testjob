package ru.himerovich.onlinenotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.himerovich.onlinenotes.services.DBOperations;

@Controller
public class ViewController {
    @GetMapping("/view")
    public String viewPage(@RequestParam("id") int id, Model model){
        model.addAttribute("note", DBOperations.getById(id));
        return "view";
    }
}
