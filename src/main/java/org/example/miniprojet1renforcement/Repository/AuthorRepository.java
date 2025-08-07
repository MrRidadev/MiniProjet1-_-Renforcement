package org.example.miniprojet1renforcement.Repository;

import org.example.miniprojet1renforcement.Entitys.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
