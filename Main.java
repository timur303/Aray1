package com.company1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("���� �����");
        UchBurch uchBurch = new UchBurch();
        System.out.println("�� ������ ��� ������");
        Scanner scanner = new Scanner(System.in);
        uchBurch.a = scanner.nextDouble();
        System.out.println("��� ������ ��� ������");
        uchBurch.b = scanner.nextDouble();
        System.out.println("���������� ��� ������");
        uchBurch.c = scanner.nextDouble();
        System.out.print("����� =");
        uchBurch.Area();

    }
}
