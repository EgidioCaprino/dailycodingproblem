package com.egidiocaprino.staircase;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertSame;

public class StaircaseTest {
  @Test public void twoSteps() {
    final Set<Integer> steps = ImmutableSet.of(1, 2);
    final int n = 4;
    final Staircase staircase = new Staircase(steps);
    final int expected = 5;
    final int actual = staircase.calculate(n);
    assertSame(expected, actual);
  }
}
