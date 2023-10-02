package com.pradiph31.reviewservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    private String id;
    @Indexed(unique = true)
    private Long reviewId;
    private Long bookId;
    private String username;
    private String rating;
    private String comment;
}
