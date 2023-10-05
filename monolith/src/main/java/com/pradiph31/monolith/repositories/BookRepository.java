package com.pradiph31.monolith.repositories;

import com.pradiph31.monolith.entities.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface BookRepository extends ReactiveCrudRepository<Book,String> {

    Mono<Book> findByBookId(Long bookId);

}
