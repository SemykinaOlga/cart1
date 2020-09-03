package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerRepositoryTest {
        ManagerRepository manager = new ManagerRepository();
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
        void shouldSave() {
            manager.save(first);
            Movie[] actual = manager.findAll();
            Movie[] expected = new Movie[] {first};
            assertArrayEquals(expected, actual);
        }

        @Test
        void shouldFindAll() {
            manager.save(first);
            manager.save(second);
            manager.save(third);
            manager.save(fourth);
            Movie[] actual = manager.findAll();
            Movie[] expected = new Movie[] {first, second, third, fourth};
            assertArrayEquals(expected, actual);
        }

        @Test
        void shouldFindById() {
            manager.save(first);
            manager.save(second);
            manager.save(third);
            Movie[] actual = manager.findById(2);
            Movie[] expected = new Movie[] {second};
            assertArrayEquals(expected, actual);
        }

        @Test
        void shouldRemoveById() {
        }

        @Test
        void shouldRemoveAll() {
        }
    }
}