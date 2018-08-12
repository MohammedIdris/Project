package com.ensat.repositories;

import com.ensat.entities.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Integer> {

    @Query("SELECT b FROM Book b WHERE b.isbn = LOWER(:isbn)")
    public Book findByIsbn(@Param("isbn") String isbn);

    @Query("SELECT b FROM Book b WHERE b.author = LOWER(:author)")
    public Book findByAuthor(@Param("author") String author);
}
