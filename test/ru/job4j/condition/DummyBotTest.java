package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void answer() {
        String x = DummyBot.answer("Пока");
        String exp = "До скорой встречи";
        Assert.assertEquals(exp, x);
    }
    @Test
    public void answer1() {
        String x = DummyBot.answer("Привет, Бот");
        String exp = "Привет, умник";
        Assert.assertEquals(exp, x);
    }
    @Test
    public void answer2() {
        String x = DummyBot.answer("вася?");
        String exp = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(exp, x);
    }
}