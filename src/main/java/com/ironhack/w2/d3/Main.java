package com.ironhack.w2.d3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        ENUMS

        User user = new User("Adrián");
        System.out.println(user);


//        HASHMAPS

        Map<String, String> nationalLeaders = new HashMap<>();

        nationalLeaders.put("Ecuador", "Lenin Moreno");
        nationalLeaders.put("India", "Ram Nath Kovind");
        nationalLeaders.put("Japan", "Shinzo Abe");
        nationalLeaders.put("Botswana", "Mokgweetsi Masisi");

        System.out.println(nationalLeaders);
        System.out.println(nationalLeaders.get("Japan"));

        nationalLeaders.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });


        Country india = new Country("India", "New Delhi", 1387297452, "Ram Nath Kovind");
        Country botswana = new Country("Botswana", "Gaborone", 2351627, "Mokgweetsi Masisi");
        Country japan = new Country("Japan", "Tokio", 126476461, "Shinzo Abe");

        Map<String, Country> countryMap = new HashMap<>();

        countryMap.put("India", india);
        countryMap.put("Botswana", botswana);
        countryMap.put("Japan", japan);

        System.out.println(countryMap);
        System.out.println(countryMap.get("Japan"));
        System.out.println(countryMap.get("Japan").getCapital());

    }
}
