package com.pradiph31.reviewservice.services;

import com.pradiph31.reviewservice.entities.Review;
import com.pradiph31.reviewservice.repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService{

    private ReviewRepository reviewRepository;

    @Override
    public Flux<Review> findByBookId(Long id) {
        return reviewRepository.findByBookId(id);
    }
}
