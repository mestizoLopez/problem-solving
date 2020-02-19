package problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flights {

  private static Map<String, List<String>> flights = new HashMap();

  static void addFlights(String origin, String destination){
    flights.putIfAbsent(origin,new ArrayList<>());
    flights.get(origin).add(destination);
  }

  static boolean isConnected(String origin, String destination){

    List<String> list = flights.get(origin);

    if(list!=null){
      if(list.contains(destination)){
        return true;
      }else{
        return list.stream().anyMatch(newOrigin -> isConnected(newOrigin, destination));
      }
    }

    return false;
  }

  public static void main(String[] args) {

    addFlights("Seattle", "New York City");
    addFlights("Portland", "Chicago");
    addFlights("Miami", "Los Angeles");
    addFlights("New York City", "Los Angeles");
    addFlights("Seattle", "Washington D.C.");
    addFlights("Los Angeles", "Mexico City");
    addFlights("Mexico City", "Guadalajara");

    System.out.println(isConnected("Seattle", "Los Angeles")); //true
    System.out.println(isConnected("Seattle", "Washington D.C.")); //true
    System.out.println(isConnected("Seattle", "Chicago") ); //false
    System.out.println(isConnected("Seattle", "Guadalajara") ); //true

  }

}
