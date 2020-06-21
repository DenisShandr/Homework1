package com.academy;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int userNumber;
        System.out.print("Введите левую границу диапазона: ");
        firstNumber = in.nextInt();
        System.out.print("Введите правую границу диапазона: ");
        secondNumber = in.nextInt();
        System.out.print("Введите число: ");
        userNumber = in.nextInt();
        if (userNumber <= firstNumber){
            System.out.println("Число принадлежит первому диапазону.");
        }
        if (userNumber > firstNumber && userNumber <=secondNumber){
            System.out.println("Число принадлежит второму диапазону.");
        }
        if (userNumber > secondNumber){
            System.out.println("Число принадлежит третьему диапазону.");
        }
    }
}
