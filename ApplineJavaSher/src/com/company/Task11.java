package com.company;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число c клавиатуры: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число с клавиатуры: ");
        int b = sc.nextInt();
        int converteda = (int)a;
        if (b > converteda) {
            System.out.println("Большее число: " + b);
            System.out.println("Меньшее число: " + (double) converteda);
        } else if (b < converteda) {
            System.out.println("Большее число: " + converteda);
            System.out.println("Меньшее число: " + (double) b);
        } else {
            System.out.print("Числа равны = " + b);
        }

    }
}
