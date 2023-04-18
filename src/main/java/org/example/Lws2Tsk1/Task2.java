package org.example.Lws2Tsk1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число 1");
        int a = scanner.nextInt();
        System.out.println("введите число 2");
        int b = scanner.nextInt();
        System.out.println(ascendingСheck(a, b));
    }

    /**
     *
     * @param num1 - целое число
     * @param num2 - целое число
     * @return - является ли последовательность возрастающей
     */

    public static boolean ascendingСheck(int num1, int num2) {
        if (num1 < num2) {
            return true;
        }else
            return false;
    }

}

