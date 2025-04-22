package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateCityHashMap {

    public static void main(String[] args) {
        Map<String, List<String>> stateCityMap = new HashMap<>();
        addCityToMap(stateCityMap,"State1","City1");
        addCityToMap(stateCityMap,"State1","City2");
        addCityToMap(stateCityMap,"State2","City1");
        for(String state:stateCityMap.keySet()) {
            System.out.println("State :"+stateCityMap.get(state));
        }
    }

    public static void addCityToMap(Map<String,List<String>> map,String state,String city)
    {
        if(!map.containsKey(state)) {
            map.put(state,new ArrayList<>());
        }
        map.get(state).add(city);
    }
}
