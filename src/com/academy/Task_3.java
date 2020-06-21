package com.academy;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        System.out.print("Введите первое число: ");
        firstNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = in.nextInt();
        System.out.print("Введите третье число: ");
        thirdNumber = in.nextInt();
        System.out.println("Максимальное число: " + Math.max(firstNumber, Math.max(secondNumber, thirdNumber)));
        System.out.println("Минимальное число: " + Math.min(firstNumber, Math.min(secondNumber, thirdNumber)));
        System.out.println("Среднее арифметическое: " + (firstNumber + secondNumber + thirdNumber)/3);
    }
}
