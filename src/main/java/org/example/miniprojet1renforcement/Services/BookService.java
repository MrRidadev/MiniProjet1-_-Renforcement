package org.example.miniprojet1renforcement.Services;

import org.example.miniprojet1renforcement.Entitys.Book;
import org.example.miniprojet1renforcement.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);

    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }


}
