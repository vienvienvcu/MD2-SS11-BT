package BT6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Delete {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(8);
        Set <Integer> newList = new HashSet<>();
        newList.addAll(list);
        System.out.println(newList);
    }
}
