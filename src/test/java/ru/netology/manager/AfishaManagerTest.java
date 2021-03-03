package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    private AfishaManager AfishaManager = new AfishaManager();
    Movie one = new Movie (1,"img1.jpg","Name1","Comedy",false);
    Movie two = new Movie (2,"img2.jpg","Name2","Historical",false);
    Movie three = new Movie (3,"img3.jpg","Name3","Comedy",false);
    Movie four = new Movie (4,"img4.jpg","Name4","Drama",false);
    Movie five = new Movie (5,"img5.jpg","Name5","Comedy",false);
    Movie six = new Movie (6,"img6.jpg","Name6","Cartoon",false);
    Movie seven = new Movie (7,"img7.jpg","Name7","Comedy",false);
    Movie eight = new Movie (8,"img8.jpg","Name8","Thriller",false);
    Movie nine = new Movie (9,"img9.jpg","Name9","Cartoon",true);
    Movie ten = new Movie (10,"img10.jpg","Name10","Comedy",true);
    Movie eleven = new Movie (11,"img11.jpg","Name11","Horror",true);

    @BeforeEach
    public void setUp (){
        AfishaManager.add(one);
        AfishaManager.add(two);
        AfishaManager.add(three);
        AfishaManager.add(four);
        AfishaManager.add(five);
        AfishaManager.add(six);
        AfishaManager.add(seven);
        AfishaManager.add(eight);
        AfishaManager.add(nine);
        AfishaManager.add(ten);
    }

    @Test
    public void shouldShowsIfNoMovies(){
        AfishaManager AfishaManager = new AfishaManager();
        Movie[] actual = AfishaManager.getAll();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldShowsIfOneMovies(){
        AfishaManager AfishaManager = new AfishaManager();
        AfishaManager.add(one);
        Movie[] actual = AfishaManager.getAll();
        Movie[] expected = new Movie[]{one};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldShowsIfMoreOneLessTen(){
        AfishaManager AfishaManager = new AfishaManager();
        AfishaManager.add(one);
        AfishaManager.add(two);
        Movie[] actual = AfishaManager.getAll();
        Movie[] expected = new Movie[] {two,one};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldShowsIfTen(){
        Movie[] actual = AfishaManager.getAll();
        Movie[] expected = new Movie[] {ten,nine,eight,seven,six,five,four,three,two,one};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldShowsIfMoreTen(){
        AfishaManager.add(eleven);
        Movie[] actual = AfishaManager.getAll();
        Movie[] expected = new Movie[] {eleven,ten,nine,eight,seven,six,five,four,three,two};
        assertArrayEquals(expected,actual);
    }



}