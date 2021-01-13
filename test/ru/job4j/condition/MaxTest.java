package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax3To3Then3() {
            int result = Max.max(3, 3);  //метод главный который надо проверить
            int exp = 3;  // что должно получиться на выходе
            Assert.assertEquals(result, exp);  // результат сравнения (метод + результат)
    }
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int exp = 2;
        Assert.assertEquals(result, exp);
    }
    @Test
    public void whenMax5To4Then5() {
        int result = Max.max(5, 4);
        int exp = 5;
        Assert.assertEquals(result, exp);
    }
}
