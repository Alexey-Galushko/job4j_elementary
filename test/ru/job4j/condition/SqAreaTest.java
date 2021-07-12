package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void whenP7K3Square2() {
        double expected = 2.29;
        int p = 7;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void whenP12K20p23Square2() {
        double expected = 1.6158;
        int p = 12;
        double k = 20.23;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.0001);
        }
    }
