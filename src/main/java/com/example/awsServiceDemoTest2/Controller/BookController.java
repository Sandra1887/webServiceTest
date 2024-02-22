package com.example.awsServiceDemoTest2.Controller;

import com.example.awsServiceDemoTest2.models.Book;
import com.example.awsServiceDemoTest2.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    private final MongoRepository mongoRepository;

    public BookController(MongoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @PostMapping("")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book respBook = mongoRepository.save(book);
        return ResponseEntity.status(200).body(respBook);
    }
}
