package com.pradiph31.bookservice.services;

import com.pradiph31.bookservice.entities.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
    Flux<Book> findAll();
    Mono<Book> findById(Long id);
}
