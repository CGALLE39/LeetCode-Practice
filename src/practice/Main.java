package practice;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//        car.make = "Porsche";
//        car.color ="Red";
//        car.describeCar();
//
//        Cat catOne = new Cat("orange");
//
//        System.out.println(catOne.getColor());

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);
    }
}
