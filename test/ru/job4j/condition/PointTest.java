package ru.job4j.condition;



import org.junit.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void pointTest1() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double rsl = 2;
        double dist = first.distance(second);
        Assert.assertEquals(dist, rsl, 0.01);

    }

    }
