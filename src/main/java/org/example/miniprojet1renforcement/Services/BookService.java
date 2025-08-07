package org.example.miniprojet1renforcement.Services;

import org.example.miniprojet1renforcement.Entitys.Author;
import org.example.miniprojet1renforcement.Entitys.Book;
import org.example.miniprojet1renforcement.Repository.AuthorRepository;
import org.example.miniprojet1renforcement.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
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

    public Book updateBook(Long id, Book updatedBook) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        book.setTitle(updatedBook.getTitle());
        book.setIsbn(updatedBook.getIsbn());

        if (updatedBook.getAuthor() != null && updatedBook.getAuthor().getId() != null) {
            Author author = authorRepository.findById(updatedBook.getAuthor().getId())
                    .orElseThrow(() -> new RuntimeException("Author not found"));
            book.setAuthor(author);
        }

        return bookRepository.save(book);
    }


}
