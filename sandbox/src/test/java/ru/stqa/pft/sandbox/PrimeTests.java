package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {
    @Test
    public void testPrime() {
        Assert.assertTrue(Prime.isPrime(Integer.MAX_VALUE));
    }
    public void testNonPrime() {
        Assert.assertFalse(Prime.isPrime(Integer.MAX_VALUE - 2));
    }
}
