package ru.himerovich.onlinenotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.himerovich.onlinenotes.models.Note;
import ru.himerovich.onlinenotes.services.DBOperations;

@Controller
public class EditController{
    @GetMapping("/edit")
    public String editNote(@RequestParam("id") int id, Model model){
        model.addAttribute("note",DBOperations.getById(id));
        model.addAttribute("id",id);
        return "/edit";
    }
    @PostMapping("/edit")
    public String saveNote(@ModelAttribute("note") Note note, @ModelAttribute("id") int id) {
        DBOperations.update(note,id);
        return "redirect:/";
    }
}
