package org.example.Les4Tsk1;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 1; i < 5; i++) {
            System.out.println("Введите число:"+i+"- ");
            deq.addFirst(sc.nextInt());
        }
        System.out.println(deq);
    }
}

