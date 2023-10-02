package com.pradiph31.bookservice.services;

import com.pradiph31.bookservice.entities.Book;
import com.pradiph31.bookservice.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Mono<Book> findById(Long id) {
        return bookRepository.findByBookId(id);
    }
}
