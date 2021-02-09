package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLooppTest {

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 5;
        int start = 0;
        int finish = 1;
        int result = FindLoopp.indexOf(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
}