package com.example.WebAppBook.core.book.web;


import com.example.WebAppBook.core.book.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
public class BookController {

    private final BookService bookService;


    public BookController( final BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/home")
    public String homeMain(Model model){
        return bookService.home(model);

    }

    @GetMapping("/book")
    public String bookMainPage(@RequestParam(value = "name", required = false) String name,@RequestParam(value = "author", required = false) String author, Model model){
        return bookService.bookMainPage(name, author, model);
    }

    @GetMapping("/book/{id}")
    public String bookPage(@PathVariable(value="id") long idBook, Model model){
        return bookService.bookPage(idBook, model);
    }

    @GetMapping("/add-book")
    public String addBookPage(Model model){
        return bookService.addBookPage(model);
    }

    @PostMapping("/add-book")
    public String addBookToBase1(@RequestParam String name,@RequestParam String author, Model model){
        return bookService.addBookToBase(name, author, model);
    }

    @GetMapping("/author")
    public String authorPage(Model model){
        return bookService.author(model);
    }


}
