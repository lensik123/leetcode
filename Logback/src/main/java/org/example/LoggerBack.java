package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerBack {

  private static final Logger logger = LoggerFactory.getLogger(LoggerBack.class);


  public static void main(String[] args) {
    logger.info("Test log from {}", LoggerBack.class.getSimpleName());
  }

}
