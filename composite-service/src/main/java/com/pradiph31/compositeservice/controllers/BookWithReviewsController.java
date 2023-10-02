package com.pradiph31.compositeservice.controllers;

import com.pradiph31.compositeservice.entities.Book;
import com.pradiph31.compositeservice.entities.BookWithReviews;
import com.pradiph31.compositeservice.entities.Review;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class BookWithReviewsController {

    private WebClient.Builder webClientBuilder;

    @GetMapping("/{id}")
    public Mono<BookWithReviews> getBookWithReviews(@PathVariable("id") Long id) {
        Mono<Book> bookMono =
                webClientBuilder.build()
                        .get()
                        .uri("http://book-service:8080/{id}", id)
                        .retrieve()
                        .bodyToMono(Book.class);
        Flux<Review> reviewsFlux = webClientBuilder.build()
                .get()
                .uri("http://review-service:8080/{id}", id)
                .retrieve()
                .bodyToFlux(Review.class);
        return bookMono
                .flatMap(book ->
                        reviewsFlux.collectList()
                                .map(reviews ->
                                        new BookWithReviews(book, reviews)
                                )
                );
    }

}
