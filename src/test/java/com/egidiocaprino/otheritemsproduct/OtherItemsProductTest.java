package com.egidiocaprino.otheritemsproduct;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OtherItemsProductTest {
  private final OtherItemsProduct otherItemsProduct = new OtherItemsProduct();

  @Test public void firstFiveNaturals() {
    final List<Integer> list = ImmutableList.of(1, 2, 3, 4, 5);
    final List<Integer> expected = ImmutableList.of(120, 60, 40, 30, 24);
    final List<Integer> actual = otherItemsProduct.calculate(list);
    assertEquals(expected, actual);
  }
}
