package com.pradiph31.bookservice.repositories;

import com.pradiph31.bookservice.entities.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface BookRepository extends ReactiveCrudRepository<Book,String> {

    Mono<Book> findByBookId(Long bookId);

}
