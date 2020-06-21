package com.academy;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 100;
        int userNumber;
        System.out.print("Введите число: ");
        userNumber = in.nextInt();
        if (Math.abs(userNumber - number) <= number * 0.1) {
            System.out.println("Близко");
        } else {
            System.out.println("Далеко");
        }
    }
}
