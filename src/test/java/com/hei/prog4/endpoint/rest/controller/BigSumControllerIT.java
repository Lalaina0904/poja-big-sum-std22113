package com.hei.prog4.endpoint.rest.controller;

import com.hei.prog4.endpoint.rest.controller.bigSum.BigSumController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class BigSumControllerIT {
    @Test
    public void testBigSum() {
        BigSumController bigSumController = new BigSumController();
        BigInteger a = new BigInteger("123456789");
        BigInteger b = new BigInteger("987654321");
        BigInteger result = bigSumController.bigSum(a, b);
        Assertions.assertEquals(new BigInteger("1111111110"), result);
    }

    @Test
    public void testBigSumWithZeroValues() {
        BigSumController bigSumController = new BigSumController();
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = bigSumController.bigSum(a, b);
        Assertions.assertEquals(BigInteger.ZERO, result);
    }
}
