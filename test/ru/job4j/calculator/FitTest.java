package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void WhenMan180than92() {
        short in = 180;
        double expected = 92;
        double rsl = Fit.manWeight(in);
        Assert.assertEquals(rsl, expected, 0.01);
    }

    @Test
    public void WhenWoman170then69() {
        short in = 170;
        double expected1 = 69;
        double rsl1 = Fit.womanWeight(in);
        Assert.assertEquals(rsl1, expected1, 0.01);
    }
}