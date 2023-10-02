package com.pradiph31.compositeservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String id;
    private Long bookId;
    private String title;
    private String author;
    private String genre;
    private double price;
}