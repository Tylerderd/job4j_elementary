package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when002And006then4() {
        int expected = 4;
        Point m = new Point(0, 0, 2);
        Point n = new Point(0, 0, 6);
        double out = m.distance3d(n);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when340And000then5() {
        int expected = 5;
        Point m = new Point(3, 4, 0);
        Point n = new Point(0, 0, 0);
        double out = m.distance3d(n);
        Assert.assertEquals(expected, out, 0.01);
    }
}