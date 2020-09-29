package ru.himerovich.onlinenotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.himerovich.onlinenotes.services.DBOperations;

@Controller
public class DeleteController {
    @RequestMapping("/delete")
    public String deleteNote(@RequestParam int id) {
        DBOperations.delete(id);
        return "redirect:/";
    }
}
