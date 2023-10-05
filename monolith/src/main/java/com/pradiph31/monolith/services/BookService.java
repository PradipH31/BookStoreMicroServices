package com.pradiph31.monolith.services;

import com.pradiph31.monolith.entities.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
    Flux<Book> findAll();
    Mono<Book> findById(Long id);
}
