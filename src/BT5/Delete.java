package BT5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Delete {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(7);
        list.add(20);
        List <Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++ ){
            if (list.get(i) % 2 != 0){
               list1.add(list.get(i));
            }
        }
        System.out.println(list1);

    }
}
