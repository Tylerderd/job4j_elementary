package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax6To2Then6() {
        int result = Max.max(6, 2);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax0With34With7When34() {
        int result = Max.max(0, 34, 7);
        assertThat(result, is(34));
    }

    @Test
    public void whenMax6With6With1With55When55() {
        int result = Max.max(6, 6, 1, 55);
        assertThat(result, is(55));
    }
}