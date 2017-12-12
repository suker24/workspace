/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.suker24.idea.test;

/**
 * Hello world!
 *
 */

class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String word = "mmaven";
        App.sayHi(word);
    }

  private static void sayHi(String word) {
    String message = "hi:" + word;
    System.out.println(message);
    int i = 0;
    System.out.println(i);
    for (int j = 0; j < message.length(); j++) {
      System.out.print(message.charAt(j));
    }
    System.out.println();
  }
}
/*
--注释掉检查 START (2017-12-07 0:27)://    public App() {
}
--注释掉检查 STOP (2017-12-07 0:27)}
*/
