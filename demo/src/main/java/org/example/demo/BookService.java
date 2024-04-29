package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> findAllByTitleContainingCustomQuery(String title) {
        return bookRepository.findAllByTitleContainingCustomQuery(title);
    }
}
