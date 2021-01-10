package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void When62then2() {
        int p = 6;
        int k = 2;
        int exp = 2;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(rsl, exp, 0.01);

    }
}