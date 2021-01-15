package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(10, 10, 1);
        assertThat(rsl, is(10));

    }
}