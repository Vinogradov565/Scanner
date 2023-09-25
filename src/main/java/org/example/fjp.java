package org.example;

import java.util.Random;

class pfpf {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();


        System.out.print("Массив до замены: ");
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(12) + 1;
            System.out.print(array[i] + " ");
        }


        for (int i = 1; i < 10; i += 2) {
            array[i] = 0;
        }


        System.out.print("\nМассив после замены: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
