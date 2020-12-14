package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromSixToElevenThenTwentyFour() {
        int rsl = Counter.sumByEven(6, 11);
        int expected = 24;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromZeroToFiveThenSix() {
        int rsl = Counter.sumByEven(0, 5);
        int expected = 6;
        assertThat(rsl, is(expected));
    }
}