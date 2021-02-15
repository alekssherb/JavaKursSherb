package com.company;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        String x = "10";
        String y = "20";
        String z = "30";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер создаваемого массива");
        int size = sc.nextInt();
        String[] array = new String[size];
        System.out.println("Введите элементы массива через enter: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        for (String elem : array) {
            if (elem.equals(x) || elem.equals(y) || elem.equals(z)) {
                System.out.println(elem + " Данное значение имеется в константах");
            } else {
                System.out.println(elem);
            }
        }
    }
}
