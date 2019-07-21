package com.andrei.exercises.map.operationswithmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> cars = initializeMapWithCars();
        System.out.println("Size before removal: "+cars.size());
        printMap(cars);

        int maxSpeedLamborghini = cars.get("Lamborghini");
        System.out.println(maxSpeedLamborghini);

        cars.remove("Lamborghini");
        System.out.println("Size after removal: "+cars.size());
        printMap(cars);

        System.out.println(cars.values());

        System.out.println(cars.keySet());

        compareMaps();
    }

    private static void compareMaps() {
        Map<String, Integer> hashMap = new TreeMap<>();
        hashMap.put("Lamborghini", 350);
        hashMap.put("Ferrari", 450);
        printMap(hashMap);

        System.out.println("-----------");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Lamborghini", 350);
        treeMap.put("Ferrari", 450);
        printMap(treeMap);
    }

    private static Map<String, Integer> initializeMapWithCars() {
        Map<String, Integer> cars = new HashMap<>();
        cars.put("Lamborghini", 320);
        cars.put("Aston Martin", 450);
        cars.put("Bugatti Veiron", 550);
        return cars;
    }
    private static void printMap(Map<String, Integer> map) {

        // iterate map ( for each entry in the set of entries)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String carName = entry.getKey();
            int maxSpeed = entry.getValue();
            System.out.printf("%s : %s\n", carName, maxSpeed);
        }


    }



}
