package org.example.miniprojet1renforcement.Controllers;


import org.example.miniprojet1renforcement.Entitys.Author;
import org.example.miniprojet1renforcement.Services.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/author")
@RestController
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @GetMapping("/getallAuthor")
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthors();
    }
}
