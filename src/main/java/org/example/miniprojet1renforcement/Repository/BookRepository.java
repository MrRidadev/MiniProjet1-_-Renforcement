package org.example.miniprojet1renforcement.Repository;

import org.example.miniprojet1renforcement.Entitys.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
