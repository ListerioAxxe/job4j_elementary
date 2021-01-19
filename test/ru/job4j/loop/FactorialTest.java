package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void calcFact5() {
        int rsl = Factorial.calc(1);
        int exp = 1;
        Assert.assertEquals(rsl, exp);
    }
}