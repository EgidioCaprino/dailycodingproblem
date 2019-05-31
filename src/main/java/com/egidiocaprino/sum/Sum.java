package com.egidiocaprino.sum;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Sum {
  private final ImmutableList<Integer> sortedList;

  Sum(final List<Integer> list) {
    this.sortedList = ImmutableList.sortedCopyOf(list);
  }

  boolean canSumTo(final int k) {
    final int leftIndex = 0;
    final int rightIndex = sortedList.size() - 1;
    return canSumTo(k, leftIndex, rightIndex);
  }

  private boolean canSumTo(final int k, final int leftIndex, final int rightIndex) {
    if (leftIndex >= rightIndex) {
      return false;
    }
    final int left = sortedList.get(leftIndex);
    final int right = sortedList.get(rightIndex);
    final int sum = left + right;
    if (sum > k) {
      return canSumTo(k, leftIndex, rightIndex - 1);
    } else if (sum < k) {
      return canSumTo(k, leftIndex + 1, rightIndex);
    } else {
      return true;
    }
  }
}
