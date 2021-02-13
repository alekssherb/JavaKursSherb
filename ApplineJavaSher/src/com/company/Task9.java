package com.company;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sred;
        double sum = 0;
        System.out.println("Введите размер создаваемого массива");
        int size = sc.nextInt();
        double[] array = new double[size];
        System.out.println("Введите элементы, числа массива по одному через enter: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        for (double id:array) {
            sum += id;
        }
        sred = sum / array.length;
        System.out.println("Среднее арифметическое получилось: " + sred);
        System.out.println("Элементы массива (Id элемента * Среднее арифметическое):");
        for (double id:array) {
            System.out.printf("%.2f ", id * sred);
        }
    }
}
