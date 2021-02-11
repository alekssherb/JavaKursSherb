package com.company;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер создаваемого массива");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы (целые числа) массива через enter: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
            for (int elem : array) {
                if (elem == x || elem == y || elem == z) {
                    System.out.println(elem + " Данное значение имеется в константах");
                }
            }
        }
    }
