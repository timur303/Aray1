package com.company1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Аянт табуу");
        UchBurch uchBurch = new UchBurch();
        System.out.println("Он жагына сан киргиз");
        Scanner scanner = new Scanner(System.in);
        uchBurch.a = scanner.nextDouble();
        System.out.println("Сол жагына сан киргиз");
        uchBurch.b = scanner.nextDouble();
        System.out.println("Узундугуна сан киргиз");
        uchBurch.c = scanner.nextDouble();
        System.out.print("Аянты =");
        uchBurch.Area();

    }
}
