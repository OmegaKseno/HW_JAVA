package org.example.Les3Tsk3;

public class Books {
    public String name;
    public  String surname;
    public float price;
    public Integer year;

    public Integer pages;


    public Books(String name,String surname,float price ,  Integer year, Integer pages){
        this.name = name;
        this.surname = surname;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }
    public boolean checkPrimeNumbers (int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true ;

    }


}
