package com.company1;

public class UchBurch {
    double a, b, c, s;

    void Area() {
        s = (a + b + c) / 2;
        System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}
