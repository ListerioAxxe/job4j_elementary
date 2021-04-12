package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.max;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class MaxTest {

    @Test
    public void testMax() {
        int left = 2;
        int middle = 3;
        int right = 4;
        int exp = 4;
        int rsl = max(left, max(middle, right));
        assertEquals(exp, rsl);
    }
}
