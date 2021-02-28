package com.company;
import java.util.Scanner;
public class Final1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс доллара:");
        double kd = sc.nextDouble();
        System.out.println("Введите кол-во рублей для обмена:");
        double sumr  = sc.nextDouble();
        double result = sumr/kd;
        System.out.println("Курс доллара: " + kd + "\nКоличество рублей: " + sumr);
        System.out.printf("%s %.2f %s", "Итого:", result, "долларов");
    }
}

