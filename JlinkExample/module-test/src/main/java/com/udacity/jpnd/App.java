package com.udacity.jpnd;

import java.math.BigInteger;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Set<Integer> numSet = Set.of(1,2,3,4);
        int complexSum = numSet.stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ZERO,BigInteger::add)
                .intValue();
        System.out.println("Hello "+complexSum);

    }
}
