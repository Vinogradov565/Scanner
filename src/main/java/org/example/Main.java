package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        do {
            System.out.print("Введите число N (от 1 до 100): ");
            N = scanner.nextInt();
        } while (N < 1 || N > 100);

        int[] array1 = new int[N];
        Random random = new Random();

        System.out.print("Массив из N случайных чисел из [0;N]: ");
        for (int i = 0; i < N; i++) {
            array1[i] = random.nextInt(N + 1);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.print("Массив из четных элементов первого массива: ");
        for (int i = 0; i < N; i++) {
            if (array1[i] % 2 == 0) {
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println();
    }
}
