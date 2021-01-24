package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Than0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int exp = 0;
        assertThat(exp, is(result));
    }

    @Test
    public void whenArrayHas3Than2() {
        int[] input = {5, 4, 3, 2};
        int value = 3;
        int result = FindLoop.indexOf(input, value);
        int exp = 2;
        assertThat(exp, is(result));
    }

    @Test
    public void whenArrayHas8ThanError() {
        int[] input = {5, 4, 3, 2};
        int value = 8;
        int result = FindLoop.indexOf(input, value);
        int exp = 2;
        assertThat(exp, is(result));
    }
}