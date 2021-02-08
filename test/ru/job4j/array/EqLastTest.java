package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.array.EqLast.check;

public class EqLastTest {

    @Test
    public void checkLast() {
        int[] left = {1, 2, 4};
        int[] right = {1, 2, 4};
        assertThat(check(left, right), is(true));
    }
}