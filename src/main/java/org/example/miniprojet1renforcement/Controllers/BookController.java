package org.example.miniprojet1renforcement.Controllers;


import org.example.miniprojet1renforcement.Entitys.Book;
import org.example.miniprojet1renforcement.Services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping("/book")
@RestController
public class BookController {

    private BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getAllBook")
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }
    @GetMapping("/getById")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }
    @GetMapping("addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
}
