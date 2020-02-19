package problemsolving.java8examples;


import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Arrays.stream(new int[] { 1, 2, 3 }).map(i -> { System.out.println("doubling " + i);
      return i * 2;
    });

    Integer in =Arrays.stream(new int[] { 4, 5, 6 }).map(i -> { System.out.println("doubling " + i); return i * 2;

    }).sum();

    System.out.println(in);

  }





}
