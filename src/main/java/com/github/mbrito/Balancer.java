package com.github.mbrito;

public class Balancer {
    public static String canBalance(int[] weights) {
        if(weights == null) throw new NullPointerException();

        int sideA = 0;
        int sideB = 0;

        for (int weight: weights){
            if (weight < 0) throw new IllegalArgumentException();

            if((sideA + weight) - sideB <= 5) sideA += weight;
            else if ((sideB + weight) - sideA <= 5) sideB += weight;
            else return("N");
        }
        return "S";
    }
}
