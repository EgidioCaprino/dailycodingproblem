package com.egidiocaprino.messagedecoding;

public class MessageDecoder {

  public int countPossibilities(final String message) {
    return 1 + countAmbiguities(message);
  }

  private int countAmbiguities(final String message) {
    if (message.length() < 2) {
      return 0;
    } else if (message.startsWith("1")) {
      return 1 + countAmbiguities(message.substring(1)) + countAmbiguities(message.substring(2));
    } else if (message.startsWith("2") && message.charAt(1) <= '6') {
      return 1 + countAmbiguities(message.substring(1)) + countAmbiguities(message.substring(2));
    }
    return countAmbiguities(message.substring(1));
  }

}
