package org.example.Les5Tsk1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String tas = "Россия";
        Map<String,Integer > result = new HashMap<>();
        String task = "россия идет вперед всей. всей планеты. Планета — это не Россия.";
        String[] arr = task.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().contains(tas.toLowerCase())){
                arr[i]=tas;
                result.putIfAbsent( arr[i], 0);
                result.put(arr[i], (result.get(arr[i])) +1);
            }

        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }


}
