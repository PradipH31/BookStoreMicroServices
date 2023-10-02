package com.pradiph31.reviewservice.controllers;

import com.pradiph31.reviewservice.entities.Review;
import com.pradiph31.reviewservice.services.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ReviewController {
    private ReviewService reviewService;
    @GetMapping("/{id}")
    public Mono<ResponseEntity<Flux<Review>>>  getReviewsByBookId(@PathVariable("id") Long id) {
        return Mono.just(ResponseEntity.ok().body(reviewService.findByBookId(id)));
    }


}
