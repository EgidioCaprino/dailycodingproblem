package com.egidiocaprino.firstmissingpositiveinteger;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMissingPositiveIntegerTest {

  @Test public void withNonSequentialIntegers() {
    final ImmutableList<Integer> list = ImmutableList.of(3, 4, -1, 1);
    final FirstMissingPositiveInteger firstMissingPositiveInteger = new FirstMissingPositiveInteger(list);
    assertEquals(Integer.valueOf(2), firstMissingPositiveInteger.find());
  }

  @Test public void withSequentialIntegers() {
    final ImmutableList<Integer> list = ImmutableList.of(1, 2, 0);
    final FirstMissingPositiveInteger firstMissingPositiveInteger = new FirstMissingPositiveInteger(list);
    assertEquals(Integer.valueOf(3), firstMissingPositiveInteger.find());
  }

}
