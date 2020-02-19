package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class Maps {

  public static void main(String[] args) {

    Map<String,Integer> map = new HashMap();

    map.put("a",2);
    map.put("n",1);

    Map<String,Integer> map1 = new HashMap();

    map1.put("a",2);
    map1.put("n",2);

    System.out.println(map.equals(map1));

  }

}
