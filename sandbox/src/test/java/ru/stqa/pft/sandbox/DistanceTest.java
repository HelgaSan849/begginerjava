package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import own.HW1_2point3.Point;

public class DistanceTest {
    @Test
    public void testArea() {
        Point p1 = new Point(6,8);
        Point p2 = new Point(7,9);
        Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
    }
}
