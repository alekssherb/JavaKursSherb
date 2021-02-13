package com.company;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        double x = 10;
        double y = 20;
        double z = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер создаваемого массива");
        int size = sc.nextInt();
        double[] array = new double[size];
        System.out.println("Введите числовые элементы массива через enter: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
            for (double elem : array) {
                if (elem == x || elem == y || elem == z) {
                    System.out.println(elem + " Данное значение имеется в константах");
                } else {
                    System.out.println(elem);
                }
            }
        }
    }
