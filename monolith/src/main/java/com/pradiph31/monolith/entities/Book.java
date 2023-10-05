package com.pradiph31.monolith.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "books_with_reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private String id;
    @Indexed(unique = true)
    private Long bookId;
    private String title;
    private String author;
    private String genre;
    private double price;
    private List<Reviews> reviews;
}
