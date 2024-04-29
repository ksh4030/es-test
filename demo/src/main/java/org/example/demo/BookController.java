package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // 책 데이터를 저장하는 엔드포인트
    @PostMapping
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    // 특정 제목의 책을 검색하는 엔드포인트
    @GetMapping
    public List<Book> findBooksByTitle(@RequestParam String title) {
        List<Book> list = bookService.findAllByTitleContainingCustomQuery(title);
        for (Book b : list) {
            System.out.println(b.getId());
            System.out.println(b.getTitle());
        }
        return list;
    }
}

