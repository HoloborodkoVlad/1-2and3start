package kpi.ua.exhibition.controller;

import kpi.ua.exhibition.model.Author;
import kpi.ua.exhibition.service.AuthorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAll() {
        return authorService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Author author) {
        authorService.save(author);
    }

    @GetMapping("/id")
    public Author getById(@RequestParam(name = "id") Long id) {
        return authorService.getById(id);
    }
}
