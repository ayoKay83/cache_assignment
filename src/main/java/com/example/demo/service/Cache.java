package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    Map<Integer, String> cacheMap = new HashMap<>();


    public String get(int key){
        return cacheMap.get(key);
    }

    public void set(int key, String value){
        cacheMap.put(key, value);
    }
    // Should return a Boolean indicating if there is data for the key
    public boolean has(int key){
        return cacheMap.containsKey(key);
    }
    // Should delete the value and the key
    public void remove(int key){
        cacheMap.remove(key);
    }

}
