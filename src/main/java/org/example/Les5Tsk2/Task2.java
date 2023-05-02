package org.example.Les5Tsk2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String empList = "Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов,Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов";
        Map<String, String> employees = new HashMap<>();
        employees = listInHashmap(empList);

        Map<String,Integer> tempEmp = new HashMap<>();
        for (Map.Entry<String,String> item :employees.entrySet()) {
            tempEmp.putIfAbsent(item.getValue(),0);
            if(tempEmp.containsKey(item.getValue())){
                tempEmp.put(item.getValue(),tempEmp.get(item.getValue())+1);
            }
        }
        int array[] = new int[tempEmp.size()];
        int counter = 0;
        for(String count: tempEmp.keySet()){
            array[counter]= tempEmp.get(count);
            counter+=1;
        }
        Arrays.sort(array);
        Map<String,Integer> result = new LinkedHashMap<>();
        for (int i = array.length-1; i >=0; i--) {
            for(String count: tempEmp.keySet()){
                if(array[i]==tempEmp.get(count)){
                    result.putIfAbsent(count,tempEmp.get(count));
                }
            }

        }
        result.forEach((key,value)-> System.out.println(key+":"+value));
    }
    static Map listInHashmap(String str) {
        String[] empArr = str.split(",");
        Map<String, String> employeesTemp = new HashMap<>();
        for (String s : empArr) {
            String[] tempArr = s.split(" ");
            for (int j = 0; j < tempArr.length - 1; j++) {
                employeesTemp.put(tempArr[j + 1], tempArr[j]);
            }
        }
        return employeesTemp;
    }
}

