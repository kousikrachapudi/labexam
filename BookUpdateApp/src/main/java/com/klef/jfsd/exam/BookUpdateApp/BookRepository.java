package com.klef.jfsd.exam.BookUpdateApp;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.jfsd.exam.BookUpdateApp.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    // No additional code required; JpaRepository provides CRUD operations.
}
