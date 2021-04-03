package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void when50by21() {
        int money = 50;
        int price = 21;
        int[] result = ru.job4j.sort.Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        Assert.assertArrayEquals(expected, result);
    }
}