package com.company12;

public class UchBurch {
    double a;
    double b;
    double c;

    void Area() {
        double s = (a+b+c)/2;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
