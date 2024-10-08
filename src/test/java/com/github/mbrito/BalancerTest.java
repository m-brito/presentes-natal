package com.github.mbrito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BalancerTest {

    @Test
    @DisplayName("Should be possible to balance the sleigh with gifts of weights 4, 6 and 2")
    public void shouldBePossibleToBalanceWithWeights462() {
        int[] weights = {4, 6, 2};
        assertEquals("S", Balancer.canBalance(weights));
    }

    @Test
    @DisplayName("Should be not possible to balance the sleigh with gifts of weights 6 and 6")
    public void shouldNotBePossibleToBalanceWithWeights66() {
        int[] weights = {6, 6};
        assertEquals("N", Balancer.canBalance(weights));
    }

    @Test
    @DisplayName("Should be possible to balance the sleigh with gifts of weight zero")
    public void shouldBePossibleToBalanceWithZeroWeight() {
        int[] weights = {0, 0, 0, 0, 0};
        assertEquals("S", Balancer.canBalance(weights));
    }

    @Test
    @DisplayName("Should be possible to balance the sleigh when no gifts are given")
    public void shouldBePossibleToBalanceWithNoGifts() {
        int[] weights = {};
        assertEquals("S", Balancer.canBalance(weights));
    }

    @Test
    @DisplayName("Should throw exception when input is null")
    public void shouldThrowExceptionForInvalidInput() {
        assertThrows(NullPointerException.class, () -> Balancer.canBalance(null));
    }

    @Test
    @DisplayName("Should throw exception when input contains negative weights")
    public void shouldThrowExceptionForNegativeWeights() {
        int[] weights = {4, -6, -2};
        assertThrows(IllegalArgumentException.class, () -> Balancer.canBalance(weights));
    }

    @Test
    @DisplayName("Should not be possible to balance with a single very heavy gift")
    public void shouldNotBePossibleToBalanceWidthSingleVeryHeavyGift() {
        int[] weights = {20};
        assertEquals("N", Balancer.canBalance(weights));
    }
}
