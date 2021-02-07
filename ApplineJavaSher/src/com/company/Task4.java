package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double sred=((x+y+z)/3);
        System.out.println("Среднее арифметическое получилось" + " "+ sred);
        double result = (sred/2);
        System.out.println("result = " + Math.floor(result));
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Числа нам не подошли");
        }
    }
}