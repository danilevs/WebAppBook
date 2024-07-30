package com.example.WebAppBook.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookModelRepository extends CrudRepository<BookModel, Long> {
    @Query("SELECT b FROM BookModel b order by b.name")
    List<BookModel> findAllBooks();

    @Query("SELECT b FROM BookModel b ORDER BY b.id DESC LIMIT 10")
    List<BookModel> findLast10Books();

    List<BookModel> findByNameIgnoreCase(String name);

    List<BookModel> findByAuthorIgnoreCase(String name);

    @Query("SELECT DISTINCT b.author FROM BookModel b")
    List<String> findAuthors();



}
