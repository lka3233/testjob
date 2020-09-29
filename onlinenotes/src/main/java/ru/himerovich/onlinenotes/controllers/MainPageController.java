package ru.himerovich.onlinenotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.himerovich.onlinenotes.models.Note;
import ru.himerovich.onlinenotes.models.SearchRequest;
import ru.himerovich.onlinenotes.services.DBOperations;

import java.util.List;

@Controller
public class MainPageController {
    @RequestMapping("/")
    public String newFormMapping(Model model){
        model.addAttribute("noteList",DBOperations.getAll());
        model.addAttribute("searchrequest",new SearchRequest());
        return "index";
    }
    @PostMapping("/")
    public String find (@ModelAttribute("searchrequest") SearchRequest searchRequest, Model model) {
        if(searchRequest.getSearchparam() ==0) {
            model.addAttribute("noteList",DBOperations.searhByTitle(searchRequest.getSearchstring()));
        } else {
            model.addAttribute("noteList",DBOperations.searhByBody(searchRequest.getSearchstring()));
        }
        return "index";
    }
}
