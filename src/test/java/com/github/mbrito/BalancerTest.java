package com.github.mbrito;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class BalancerTest {

    @Test
    @DisplayName("Should be possible to balance the sleigh with gifts of weights 4, 6 and 2")
    public void shouldBePossibleToBalanceWithWeights462() {
        int[] weights = {4, 6, 2};
        assertEquals("S", Balancer.canBalance(weights));
    }
}
