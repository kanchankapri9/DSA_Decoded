// package 3Patterns.Day1_Hashing.HashMap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Kanchan");
        map.put(102,"Rahul");
        map.put(103,"Amit");

        System.out.println(map);

        System.out.println(map.get(101));

        System.out.println(map.containsKey(102));

        map.remove(102);

        System.out.println(map);
    }
}
