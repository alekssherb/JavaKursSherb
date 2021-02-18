package com.company;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = sc.nextLine();
        boolean contains = x.contains("Java");
        System.out.println(x.contains("Java"));
        boolean startsWith = x.startsWith("I like");
        System.out.println(x.startsWith("I like"));
        boolean endsWith = x.endsWith("!!!");
        System.out.println(x.endsWith("!!!"));
        if (contains & startsWith & endsWith) {
            System.out.println(x.toUpperCase());
        }
       System.out.println(x.replaceAll("a", "o").substring(7, 11));
    }
}
