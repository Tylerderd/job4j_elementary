package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 4, 4};
        int[] expect = {4, 2, 4, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 8, 44};
        int[] expect = {1, 2, 8, 4, 3, 44};
        int[] rsl = SwitchArray.swap(input, 2, 4);
        assertThat(rsl, is(expect));
    }
}