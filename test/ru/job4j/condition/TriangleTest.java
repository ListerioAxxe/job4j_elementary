package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {   //метод со своим названием
        boolean result = Triangle.exist(2.0, 2.0, 3.0);  // исходные данные , вызываем метод
        boolean is = true; // данная с чем сравнить//
        Assert.assertEquals(result, is); // результат теста

    }
}