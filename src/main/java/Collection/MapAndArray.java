package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class MapAndArray {
    public static void main(String[] args) {
        new ConcurrentHashMap<>();
        new ArrayList<>();

        HashSet<Integer> integers = new HashSet<>();
        System.out.println(integers.add(1));
        System.out.println(integers.add(1));

    }
}
