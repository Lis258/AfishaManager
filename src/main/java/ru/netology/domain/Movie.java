package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
    private int id;
    private String imageUrl;
    private String movieName;
    private String genre;
    private boolean premierTomorrow;
}
