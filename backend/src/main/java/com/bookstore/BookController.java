package com.bookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Map<String, String>> getBooks() {
        return List.of(
            Map.of("id", "1", "title", "Spring Boot Basics", "author", "Venkat"),
            Map.of("id", "2", "title", "DevOps for Beginners", "author", "Prasad")
        );
    }
}
