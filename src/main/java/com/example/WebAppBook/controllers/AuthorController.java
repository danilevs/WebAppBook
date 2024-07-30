package com.example.WebAppBook.controllers;

import com.example.WebAppBook.models.BookModel;
import com.example.WebAppBook.models.BookModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {


    @Autowired
    private BookModelRepository bookModelRepository;

    @GetMapping("/author")
    public String bookMain(Model model){
        Iterable<String> authors= bookModelRepository.findAuthors();
        model.addAttribute("authors", authors);
        return "author";
    }
}
