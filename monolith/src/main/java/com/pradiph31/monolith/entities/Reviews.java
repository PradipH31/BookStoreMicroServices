package com.pradiph31.monolith.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {
    private Long reviewId;
    private String username;
    private String rating;
    private String comment;
}
