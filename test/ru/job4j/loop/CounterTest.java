package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumByEven0to10() {
        int rsl = Counter.sumByEven(0, 10);
        int exp = 30;
        Assert.assertEquals(rsl, exp);
    }
}