package ru.job4j.condition;



import org.junit.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void pointTest1() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point rsl = new Point(first, second);
        double dist = first.distance(second);
        assertThat(dist, rsl);

    }

    }
