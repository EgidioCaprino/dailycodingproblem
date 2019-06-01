package com.egidiocaprino.com.egidiocaprino;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OtherItemsProduct {
  List<Integer> calculate(final List<Integer> list) {
    final List<Integer> progressiveLeft = progressiveLeft(list);
    final List<Integer> progressiveRight = progressiveRight(list);
    return IntStream.range(0, list.size())
      .map(index -> {
        final int left = index > 0 ? progressiveLeft.get(index - 1) : 1;
        final int right = index < (list.size() - 1) ? progressiveRight.get(index + 1) : 1;
        return left * right;
      })
      .boxed()
      .collect(Collectors.toList());
  }

  private List<Integer> progressiveLeft(final List<Integer> list) {
    final List<Integer> result = new ArrayList<>(list.size());
    IntStream.range(0, list.size()).forEach(index -> {
      final int value = list.get(index);
      final int product = result.isEmpty() ? value : result.get(result.size() - 1) * value;
      result.add(product);
    });
    return result;
  }

  private List<Integer> progressiveRight(final List<Integer> list) {
    final List<Integer> result = new ArrayList<>(list.size());
    IntStream.range(0, list.size())
      .forEach(index -> {
        final int value = list.get(list.size() - index - 1);
        final int product = result.isEmpty() ? value : result.get(result.size() - 1) * value;
        result.add(product);
      });
    return Lists.reverse(result);
  }
}
