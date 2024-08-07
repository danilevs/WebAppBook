package com.example.WebAppBook.core.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BookRepo extends JpaRepository<Book, Long> {

    @Query(value = "SELECT b.id, b.name, b.author FROM book b order by b.name", nativeQuery = true)
    List<Book> findAllBooks();

    @Query(value = "SELECT b.id,b.name, b.author FROM book b order by b.id LIMIT 10", nativeQuery = true)
    List<Book> findLast10Books();

    List<Book> findByNameIgnoreCase(String name);

    List<Book> findByAuthorIgnoreCase(String name);

    @Query(value = "SELECT DISTINCT b.author FROM book b", nativeQuery = true)
    List<String> findAuthors();

}
