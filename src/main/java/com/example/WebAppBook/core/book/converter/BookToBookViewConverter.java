package com.example.WebAppBook.core.book.converter;

import com.example.WebAppBook.core.book.Book;
import com.example.WebAppBook.core.book.web.BookView;
import org.springframework.lang.NonNull;
import org.springframework.core.convert.converter.Converter;


public class BookToBookViewConverter implements Converter<Book, BookView> {

    public BookToBookViewConverter(){}

    @Override
    public BookView convert(@NonNull Book book) {
        BookView view = new BookView();
        view.setId(book.getId());
        view.setName(book.getName());
        view.setAuthor(book.getAuthor());
        return view;
    }

}
