package com.pradiph31.compositeservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private String id;
    private Long reviewId;
    private Long bookId;
    private String username;
    private String rating;
    private String comment;
}
