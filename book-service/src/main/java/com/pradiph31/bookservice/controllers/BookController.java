package com.pradiph31.bookservice.controllers;

import com.pradiph31.bookservice.entities.Book;
import com.pradiph31.bookservice.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Mono<ResponseEntity<Flux<Book>>> getAllBooks() {
        return Mono.just(ResponseEntity.ok().body(bookService.findAll()));
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Book>> getBookById(@PathVariable("id") Long id) {
        return bookService.findById(id).map(ResponseEntity::ok).defaultIfEmpty(ResponseEntity.notFound().build());
    }



}
