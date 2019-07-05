package com.egidiocaprino.messagedecoding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageDecoderTest {

  private final MessageDecoder messageDecoder = new MessageDecoder();

  @Test public void theExample() {
    final String input = "111";
    final int expected = 3;
    final int actual = messageDecoder.countPossibilities(input);
    assertEquals(expected, actual);
  }

  @Test public void aMessageWith2s() {
    final String input = "112223";
    final int expected = 3;
    final int actual = messageDecoder.countPossibilities(input);
    assertEquals(expected, actual);
  }

}
