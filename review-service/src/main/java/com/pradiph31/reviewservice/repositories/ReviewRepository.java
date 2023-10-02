package com.pradiph31.reviewservice.repositories;

import com.pradiph31.reviewservice.entities.Review;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ReviewRepository  extends ReactiveCrudRepository<Review,String> {
    Flux<Review> findByBookId(Long bookId);
}
