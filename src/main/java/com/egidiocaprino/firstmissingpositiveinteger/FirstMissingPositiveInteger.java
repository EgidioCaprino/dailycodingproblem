package com.egidiocaprino.firstmissingpositiveinteger;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class FirstMissingPositiveInteger {

  private final ImmutableList<Integer> list;

  FirstMissingPositiveInteger(final List<Integer> list) {
    this.list = ImmutableList.copyOf(list);
  }

  Integer find() {
    return list
      .stream()
      .filter(item -> item > 0)
      .reduce(1, (Integer min, Integer item) -> item <= min ? item + 1 : min);
  }

}
