package com.crisite.factory;

import com.crisite.dao.Car;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private static Map<Integer, Car> carMap;

    public InstanceCarFactory() {
        carMap = new HashMap<>();
        carMap.put(1,new Car(1,"奥迪"));
        carMap.put(1,new Car(1,"奥拓"));

    }

    public Car getCar(int num){
        return carMap.get(num);
    }
}
