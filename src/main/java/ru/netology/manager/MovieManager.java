package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor
@AllArgsConstructor

public class MovieManager {
    private Movie[] items = new Movie[0];
    int amountOfFilms = 10;

    public void add(Movie item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Movie[] getLastFilm() {
        int howManyFilmsToShow = amountOfFilms;
        if (items.length <= amountOfFilms) {
            howManyFilmsToShow = items.length;
        }
        Movie[] result = new Movie[howManyFilmsToShow];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}

