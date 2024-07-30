package com.example.WebAppBook.controllers;

import com.example.WebAppBook.models.BookModel;
import com.example.WebAppBook.models.BookModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private BookModelRepository bookModelRepository;

    @GetMapping("/")
    public String home(Model model){
        Iterable<BookModel> bookModels= bookModelRepository.findLast10Books();
        model.addAttribute("bookModels", bookModels);
        return "home";
    }
}
