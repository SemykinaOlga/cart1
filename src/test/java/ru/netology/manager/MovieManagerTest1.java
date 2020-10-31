package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest1 {
    MovieManager manager = new MovieManager(new Movie[10], 5);
    Movie first = new Movie(1, "www.1.ru", "Человек-Паук", "приключения");
    Movie second = new Movie(2, "www.2.ru", "Человек-Муравей", "приключения");
    Movie third = new Movie(3, "www.3.ru", "Железный человек", "приключения");
    Movie fourth = new Movie(4, "www.4.ru", "Стражи галактики", "приключения");
    Movie fifth = new Movie(5, "www.4.ru", "Тор", "приключения");
    Movie sixth = new Movie(6, "www.4.ru", "Первый мститель", "приключения");
    Movie seventh = new Movie(7, "www.4.ru", "Невероятный Халк", "приключения");

    @Test
    void shouldGetLastFiveFilm() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        Movie[] actual = manager.getLastFilm();
        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }
}