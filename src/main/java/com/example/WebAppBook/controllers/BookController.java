package com.example.WebAppBook.controllers;


import com.example.WebAppBook.models.BookModel;
import com.example.WebAppBook.models.BookModelRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookModelRepository bookModelRepository;

    @GetMapping("/book")
    public String bookMain(@RequestParam(value = "name", required = false) String name,@RequestParam(value = "author", required = false) String author, Model model){

        if((name!=null)&&!name.isEmpty()){

            Iterable<BookModel> bookModels= bookModelRepository.findByNameIgnoreCase(name);
            model.addAttribute("bookModels", bookModels);
            model.addAttribute("labelListBook", "Книги с названием: "+name);
            return "book";
        }
        if((author!=null)&&!author.isEmpty()){
            Iterable<BookModel> bookModels= bookModelRepository.findByAuthorIgnoreCase(author);
            model.addAttribute("bookModels", bookModels);
            model.addAttribute("labelListBook", "Книги автора: "+author);
            return "book";
        }

        Iterable<BookModel> bookModels= bookModelRepository.findAllBooks();
        model.addAttribute("bookModels", bookModels);
        model.addAttribute("labelListBook", "Список книг:");
        return "book";
    }

    @GetMapping("/book/{id}")
    public String bookPage(@PathVariable(value="id") long idBook, Model model){
        if(!bookModelRepository.existsById(idBook)){
            return "redirect:/book";
        }
        Optional<BookModel> book=bookModelRepository.findById(idBook);
        ArrayList<BookModel> bookById=new ArrayList<>();
        book.ifPresent(bookById::add);
        model.addAttribute("bookById",bookById);
        return "book-page";
    }

}
