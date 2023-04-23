package org.example.Les3Tsk3;
import org.example.Les3Tsk3.Books;
import java.util.ArrayList;
import java.util.List;
public class Task3 {
    public static void main(String[] args) {
        List<Books> product = getBooks();

        for (Books prod : product) {
            if(prod.checkPrimeNumbers(prod.pages)&& prod.surname.startsWith("А")){
                if(prod.year<=2010){
                    System.out.println(prod.name);
                }
            }

        }
    }
    public static ArrayList<Books> getBooks() {
        ArrayList<Books> product = new ArrayList<Books>();
        product.add(new Books("Книга1", "Антогов", 1.0f,2009, 79));
        product.add(new Books("Книга2", "Пушкин", 2.0f,2006,89));
        product.add(new Books("Книга3", "Андропов", 3.0f,2009,78));
        product.add(new Books("Книга4", "Анисимов", 4.0f,2010,67));
        product.add(new Books("Книга5", "Гоголь", 2.0f,1890,97));
        return product;
    }


}




