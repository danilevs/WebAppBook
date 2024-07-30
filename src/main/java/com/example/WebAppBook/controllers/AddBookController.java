package com.example.WebAppBook.controllers;

import com.example.WebAppBook.models.BookModel;
import com.example.WebAppBook.models.BookModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddBookController {

    @Autowired
    private BookModelRepository bookModelRepository;

    @GetMapping("/add-book")
    public String addBookPage(Model model){
        return "add-book";
    }

    @PostMapping("/add-book")
    public String addBook(@RequestParam String name,@RequestParam String author, Model model){
        BookModel bookModel=new BookModel(name, author);
        bookModelRepository.save(bookModel);
        return "redirect:/book";
    }

}
