package org.example.Les3Tsk4;

import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(17);
        arrayList.add(20);
        arrayList.add(33);
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            result+=arrayList.get(i);

        }
        System.out.println(Collections.min(arrayList));
        System.out.println(Collections.max(arrayList));
        System.out.println(result/arrayList.size());
    }
}


