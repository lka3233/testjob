package ru.himerovich.onlinenotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.himerovich.onlinenotes.services.DBOperations;

import java.util.List;

@Controller
public class MainPageController {
    @RequestMapping("/")
    public String newFormMapping(Model model){
        model.addAttribute("noteList",DBOperations.getAll());
        return "index";
    }
}
