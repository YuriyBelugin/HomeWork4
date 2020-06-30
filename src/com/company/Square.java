package com.company;

public class Square {
    int a1=15;

    public Square(int a1) {
        this.a1 = a1;
    }

    public int perimeter(){
        int P=a1+a1+a1+a1;
        return P;
    }

    public int area(){
        int P=a1+a1+a1+a1;
        int S=(P/4)*(P/4);
        return S;
    }
}
