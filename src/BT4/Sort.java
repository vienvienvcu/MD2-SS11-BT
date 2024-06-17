package BT4;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(30);
        list.add(10);
        list.add(5);
        list.add(6);

        System.out.println(list);
        System.out.println(list.size()-1);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
