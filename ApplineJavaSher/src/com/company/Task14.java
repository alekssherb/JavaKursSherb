package com.company;
import java.util.Arrays;
import java.util.Random;
public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        System.out.print("Массив чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40) - 20;
            System.out.print(array[i] + " ");
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("\nМаксимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Наибольшее по модулю: " + (Integer.max(Math.abs(max), Math.abs(min))));
    }
}
