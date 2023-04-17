package org.example.Les2Task1;
//1) Дана последовательность N целых чисел. Найти сумму простых чисел.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите колличество чисел в последовательности");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Cумма простых чисел от 1 до "+ n +" = "+sumPrimeNumbers ( n));
    }
    /**
     *
     * @param -Kолличество чисел в последовательности.
     * @return -Cумма простых чисел от 1 до N.
     */
    public static int sumPrimeNumbers (int num){
        int count = 0 ;
        int sum =0;

        for (int i = 2; i <=num; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if(i%j==0&&i!=j){
                    count +=1;
                }
            }
            if(count == 0){
                sum+=i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
