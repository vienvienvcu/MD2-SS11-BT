package BT1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.floor(Math.random()*100));
        }
        System.out.println("after :" +list);
        System.out.println("so lon nhat trong mang: " +Collections.max(list));
        Collections.reverse(list);
        System.out.println("after :" +list);
        Collections.sort(list);
        System.out.println("after sort: " +list);

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add((int) Math.floor(Math.random()*100));
        }
        list.addAll(list2);
        System.out.println("after :" +list);

    }

}
