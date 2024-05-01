package org.example;

import java.util.Scanner;
import org.slf4j.LoggerFactory;

public class Calculator {

  private static final org.slf4j.Logger log = LoggerFactory.getLogger(Calculator.class);

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    log.info("Entered first num " + i);
    int j = scan.nextInt();
    log.info("Entered second num " + j);
    scan.nextLine();
    String s = scan.nextLine();
    log.info("Entered char " + s.charAt(0));
    operation(s.charAt(0), i, j);
  }

  public static int operation(char operand, int a, int b) {
    int i = 0;
    switch (operand) {
      case '+':
        log.info("folded of " + a + " and " + b);
        i = sum(a, b);
        break;
      case '*':
        i = multiplication(a, b);
        break;
      case '-':
        i = subtraction(a, b);
        break;
      case '/':

        i = division(a, b);
        break;
    }
    log.info("result " + i);
    return i;
  }


  public static int sum(int i, int j) {
    return i + j;
  }

  public static int subtraction(int i, int j) {
    return i - j;
  }

  public static int multiplication(int i, int j) {
    return i * j;
  }

  public static int division(int i, int j) {
    if (j == 0) {
      throw new ArithmeticException();
    }
    return i / j;
  }
}
