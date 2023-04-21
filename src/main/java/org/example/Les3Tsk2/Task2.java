package org.example.Les3Tsk2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Goods> product = getGoots();
        String result = "";
        int checkGrade = 1;
        float minPrise = 0.0f;

        for (Goods prod : product) {
            if(!result.contains(prod.name)&&prod.grade==checkGrade){
                minPrise = prod.price;
                result+= prod.name;
                for(Goods prodCheck : product){
                    if(prod.name==prodCheck.name&&minPrise>prodCheck.price){
                        if(prodCheck.grade==checkGrade){
                            minPrise = prodCheck.price;
                        }

                    }

                }
                result+=" price-"+minPrise+" ";
            }

        }
        System.out.println(result);
    }
    public static ArrayList<Goods> getGoots() {
        ArrayList<Goods> product = new ArrayList<Goods>();
        product.add(new Goods("Персик", "Россия", 1.0f,10.0f, 1));
        product.add(new Goods("Яблоко", "Узбекистан", 2.0f,11.0f,1));
        product.add(new Goods("Персик", "Эквадор", 3.0f,3.0f,3));
        product.add(new Goods("Манго", "Непал", 4.0f,2.0f,2));
        product.add(new Goods("Манго", "Россия", 2.0f,4.0f,1));
        return product;
    }


}

