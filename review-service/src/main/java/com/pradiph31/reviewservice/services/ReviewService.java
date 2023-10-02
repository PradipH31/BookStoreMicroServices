package com.pradiph31.reviewservice.services;

import com.pradiph31.reviewservice.entities.Review;
import reactor.core.publisher.Flux;

public interface ReviewService {
    Flux<Review> findByBookId(Long id);
}
