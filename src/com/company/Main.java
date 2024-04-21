package com.company;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] s = {"1", "sss", "2", "sss", "3", "3", "s"};

        Map<String, Integer> map = arrayToMap(s);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key: " + key + ", Value count: " + value);
        }
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks){
        Map<K, Integer> map = new HashMap<K, Integer>();

        for (K k: ks){
            if(map.get(k) != null){
                map.put(k, map.get(k).intValue()+1);
            }else {
                map.put(k, 1);
            }
        }

        return map;
    }
}
