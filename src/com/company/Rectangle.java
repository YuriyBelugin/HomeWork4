package com.company;

public class Rectangle {
    int a1=15;
    int a2=10;

    public Rectangle(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public int perimeter(){
        int P=a1*2+a2*2;
        return P;
    }

    public int area(){
        int S=a1*a2;
        return S;
    }
}
