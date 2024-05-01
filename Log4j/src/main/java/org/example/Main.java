package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

  private static final Logger log = LogManager.getLogger(Main.class);

  public static void main(String[] args) {
    log.info("Это информационное сообщение");
    log.error("Это сообщение ошибки");


  }
}