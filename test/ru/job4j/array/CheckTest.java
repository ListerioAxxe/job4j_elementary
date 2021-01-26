package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[]{true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }
}