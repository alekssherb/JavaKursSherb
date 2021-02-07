package com.company;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        double x = sc.nextDouble();
        System.out.print("Введите 2 число: ");
        double y = sc.nextDouble();
        System.out.print("Выберите математическую операцию из представленных '+','-','*','/': ");
        String in = sc.next();
        char oper = in.charAt(0);
        switch (oper) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            default:
                System.out.println("Нет такой операции");
                break;
        }
    }
}
