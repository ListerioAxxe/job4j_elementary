package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.array;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MiniDiapasonTest {

    @Test
    public void whenMin5() {
        int rst = MiniDiapason.findMin(new int[]{3, 9, 6, 7, 8}, 1, 4);
        assertThat(rst, is(6));

    }
}