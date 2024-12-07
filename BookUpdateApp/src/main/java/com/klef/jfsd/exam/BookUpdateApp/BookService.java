package com.klef.jfsd.exam.BookUpdateApp;

import com.klef.jfsd.exam.BookUpdateApp.Book;

public interface BookService {
    Book updateBook(Long id, Book updatedBook);
}
