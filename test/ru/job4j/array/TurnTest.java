package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
        public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray () {
            int[] input = new int[]{4, 1, 6, 2};
            int[] result = Turn.back(input);
            int[] expect = new int[]{2, 6, 1, 4};
            assertThat(result, is(expect));
        }
    @Test
    public void whenTurnArrayWithEvenAmount() {
        int[] input = new int[]{2, 8, 6, 3, 5, 9};
        int[] result = Turn.back(input);
        int[] expect = new int[]{9, 5, 3, 6, 8, 2};
        assertThat(result, is(expect));
    }
    }