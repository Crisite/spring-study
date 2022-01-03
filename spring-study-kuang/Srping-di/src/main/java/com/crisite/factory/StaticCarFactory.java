package com.crisite.factory;

import com.crisite.dao.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
    private static Map<Integer,Car> carMap;
    static{
        carMap = new HashMap<>();
        carMap.put(1,new Car(1,"奥迪"));
        carMap.put(2,new Car(2,"奥拓"));
    }
    public static Car getCar(int num){
        return carMap.get(num);
    }
}
