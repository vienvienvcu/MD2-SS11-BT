package BT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        String str = "Rikkei Academy";
        String[] strs = str.split("");
        List <String> list = new ArrayList<>(Arrays.asList(strs));
        System.out.println(list);
    }
}
