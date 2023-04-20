package org.example.Les3Tsk1;
import java.util.ArrayList;
import java.util.List;
public class Task1 {
    public static void main(String[] args) {
        List<Goods> product = getGoots();
        float maxPrice = 0.0f;
        for (Goods prod : product) {
            String[] splitArr = prod.name.split(" ");
            for (int i = 0; i < splitArr.length; i++) {
                if(splitArr[i].startsWith("высший")){
                    if (prod.grade.equals(1)&&prod.price>maxPrice){
                        maxPrice = prod.price;
                    }
                }
            }
        }
        System.out.println(maxPrice);
    }
    public static ArrayList<Goods> getGoots() {
        ArrayList<Goods> product = new ArrayList<Goods>();
        product.add(new Goods(" Персик высший сорт", 15.0f, 1));
        product.add(new Goods("Урюк низший ", 50.0f, 2));
        product.add(new Goods("Бананы высший сорт", 11.0f, 2));
        product.add(new Goods("Персик высший", 14.0f, 1));
        product.add(new Goods("Арбуз высший", 20.0f, 2));
        return product;
    }

}
