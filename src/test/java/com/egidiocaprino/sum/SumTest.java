package com.egidiocaprino.sum;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertSame;

public class SumTest {

  @Test public void sumExists() {
    final List<Integer> list = ImmutableList.of(10, 15, 3, 7);
    final int k = 17;
    final Sum sum = new Sum(list);
    final boolean expected = true;
    final boolean actual = sum.canSumTo(k);
    assertSame(expected, actual);
  }

  @Test public void sumDoesNotExist() {
    final List<Integer> list = ImmutableList.of(10, 15, 3, 7);
    final int k = 19;
    final Sum sum = new Sum(list);
    final boolean expected = false;
    final boolean actual = sum.canSumTo(k);
    assertSame(expected, actual);
  }

}
