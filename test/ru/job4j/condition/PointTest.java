package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when34to23then1p41() {
        double expected = 1.41;
        int x1 = 3;
        int y1 = 4;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3040to2030then14p14() {
        double expected = 14.142;
        int x1 = 30;
        int y1 = 40;
        int x2 = 20;
        int y2 = 30;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when33p544p5to22p533p5then15p55() {
        double expected = 15.55;
        double x1 = 33.5;
        double y1 = 44.5;
        double x2 = 22.5;
        double y2 = 33.5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}