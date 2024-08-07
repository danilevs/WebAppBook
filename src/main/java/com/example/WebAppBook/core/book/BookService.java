package com.example.WebAppBook.core.book;


import com.example.WebAppBook.core.book.web.BookView;
import com.example.WebAppBook.error.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepo bookRepo;

    public BookService(final BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public String home(Model model){
        Iterable<Book> bookModels= bookRepo.findLast10Books();
        model.addAttribute("bookModels", bookModels);
        return "home_Page";
    }

    public String author(Model model){
        Iterable<String> authors= bookRepo.findAuthors();
        model.addAttribute("authors", authors);
        return "author_Page";
    }

    public String bookMainPage(String name,String author, Model model){
        if((name!=null)&&!name.isEmpty()){
            Iterable<Book> bookModels= bookRepo.findByNameIgnoreCase(name);
            model.addAttribute("bookModels", bookModels);
            model.addAttribute("labelListBook", "Книги с названием: "+name);
            return "bookMain_Page";
        }
        if((author!=null)&&!author.isEmpty()){
            Iterable<Book> bookModels= bookRepo.findByAuthorIgnoreCase(author);
            model.addAttribute("bookModels", bookModels);
            model.addAttribute("labelListBook", "Книги автора: "+author);
            return "bookMain_Page";
        }

        Iterable<Book> bookModels= bookRepo.findAllBooks();
        model.addAttribute("bookModels", bookModels);
        model.addAttribute("labelListBook", "Список книг:");
        return "bookMain_Page";
    }
    public String addBookPage(Model model){
        return "addBook_Page";
    }

    public String bookPage(long id, Model model){
        if(!bookRepo.existsById(id)){
            return "redirect:/book";
        }
        Optional<Book> book= bookRepo.findById(id);
        ArrayList<Book> bookById=new ArrayList<>();
        book.ifPresent(bookById::add);
        model.addAttribute("bookById",bookById);
        return "book_Page";
    }

    public String addBookToBase(String name,String author, Model model){
        Book book =new Book(name, author);
        bookRepo.save(book);
        BookView bookView=new BookView();
        return "redirect:/book";
    }


}
