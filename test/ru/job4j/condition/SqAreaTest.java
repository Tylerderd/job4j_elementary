package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 64;
        int p = 32;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        double expected = 24.80;
        int p = 23;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}