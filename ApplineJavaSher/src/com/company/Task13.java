package com.company;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = sc.nextLine();
        String[] mas = x.split(" ");
        int slov = 0;
        System.out.print("Слова из латиницы: ");
        for (String St : mas) {
            if (St.matches("[a-zA-Z]+")) {
                System.out.print(St + " ");
                slov++;
            }
        }
        System.out.println("\nКоличество подходящих слов: " + slov);
    }
}
