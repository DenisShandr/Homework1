package com.academy;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayNumber;
        System.out.print("Введите день недели: ");
        dayNumber = in.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Нет такого дня недели!");
        }
    }
}
