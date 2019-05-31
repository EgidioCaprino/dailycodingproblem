package com.egidiocaprino.staircase;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Staircase {
  private final ImmutableSet<Integer> steps;

  Staircase(final Set<Integer> steps) {
    this.steps = ImmutableSet.copyOf(steps);
  }

  int calculate(final int n) {
    if (n == 0) {
      return 1;
    }
    return steps.stream()
      .map(step -> n >= step ? calculate(n - step) : 0)
      .mapToInt(Integer::intValue)
      .sum();
  }
}
