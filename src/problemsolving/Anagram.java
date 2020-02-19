package problemsolving;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Anagram {

  static Map<Character, Integer> countLetters(String s) {
    Map<Character, Integer> result = new HashMap<>();
    for (char c : s.toLowerCase().toCharArray()) {
      result.put(c, result.getOrDefault(c, 0) + 1);
    }
    return result;
  }

  static boolean isAnagram(String a, String b) {
    if (a.equals(b)) {
      return true;
    }

    return countLetters(a).equals(countLetters(b));
  }


  public static void main(String[] args) {

    System.out.println(isAnagram("ana","aan"));

  }

}
