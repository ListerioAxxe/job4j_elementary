package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenRoundMax() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenFirstdMax() {
        int result = MultiMax.max(5, 4, 3);
        assertThat(result, is(5));
    }
    @Test
    public void whenThirdmax() {
        int result = MultiMax.max(2, 4, 5);
        assertThat(result, is(5));
    }
}