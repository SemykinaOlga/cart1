package ru.netology.manager;


import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager manager = new MovieManager();
    Movie first = new Movie(1, "www.1.ru", "Человек-Паук", "приключения");
    Movie second = new Movie(2, "www.2.ru", "Человек-Муравей", "приключения");
    Movie third = new Movie(3, "www.3.ru", "Железный человек", "приключения");
    Movie fourth = new Movie(4, "www.4.ru", "Стражи галактики", "приключения");
    Movie fifth = new Movie(5, "www.4.ru", "Тор", "приключения");
    Movie sixth = new Movie(6, "www.4.ru", "Первый мститель", "приключения");
    Movie seventh = new Movie(7, "www.4.ru", "Невероятный Халк", "приключения");
    Movie eighth = new Movie(8, "www.4.ru", "Мстители", "приключения");
    Movie ninth = new Movie(9, "www.4.ru", "Эра Альтрона", "приключения");
    Movie tenth = new Movie(10, "www.4.ru", "Капитан Марвелл", "приключения");
    Movie eleventh = new Movie(11, "www.4.ru", "Доктор Стрендж", "приключения");

    @Test
    void shouldGetLastLessTen() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        Movie[] actual = manager.getLastFilm();
        Movie[] expected = new Movie[]{fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldGetLastTen() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.getLastFilm();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLastMoreTen() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.getLastFilm();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }


    @Test
    void add() {
        manager.add(first);
        Movie[] actual = manager.getLastFilm();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }
}