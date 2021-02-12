package com.company;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите любое целое положительное число: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Cумма = " + sum);
    }
}

