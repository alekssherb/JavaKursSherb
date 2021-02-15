package com.company;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива ");
        int strock = sc.nextInt();
        System.out.println("Введите кол-во столбцов массива ");
        int stolb = sc.nextInt();
        double[][] array = new double[strock][stolb];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Присвойте значение элементу [" + i + "][" + j +  "] ");
                array[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
            {if (i >= 1){
                break;
            }
                System.out.print(array[i][j]*3+" ");
            }
            System.out.println();
        }
    }
}