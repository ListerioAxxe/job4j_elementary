package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void When00to20then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        int exp = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, rsl, 0.01);
    }
    @Test
    public void When11to11then0 () {
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        int exp = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(rsl, exp,0.01);
    }
    @Test
    public void When12to12then1 () {
        int x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 2;
        double exp = 1.4;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(rsl, exp,0.02);
    }
}