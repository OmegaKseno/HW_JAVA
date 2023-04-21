package org.example.Les3Tsk2;

//1.2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.

public class Goods {
    public String name;
    public  String country;
    public float weight;
    public float price;
    public Integer grade;


    public Goods(String name,String country, float weight, float price, Integer grade){
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }


}
