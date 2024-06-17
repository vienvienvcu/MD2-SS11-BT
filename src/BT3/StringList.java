package BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        String str ="Tìm chuỗi ngắn nhất trong đoạn văn bản";
        String [] strS = str.split(" ");
        List <String> list = new ArrayList<>();
        for (String s : strS) {
            list.add(s);

        }
        System.out.println(list);

        int strMin = list.get(0).length();
        int indexMIn = 0;
        for (int i = 0; i < list.size(); i++) {
            if (strMin > list.get(i).length()) {
                strMin = list.get(i).length();
                indexMIn = i;
                break;
            }
        }
        System.out.println(strMin + " " + list.get(indexMIn));
        System.out.println(Collections.min(list));

    }
}
