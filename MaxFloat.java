package com.company.Day13Generics;

public class MaxFloat {
    Float a, b, c;

    public MaxFloat(Float A, Float B, Float C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }
    public void print(){

        System.out.println("Given Numbers are : ");
        System.out.print(a +" ");
        System.out.print(b +" ");
        System.out.println(c);
    }
    public void detMax() {

        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            System.out.println("Max Number is : "+ a);

        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
            System.out.println("Max Number is : "+ b);

        else
            System.out.println("Max Number is : "+ c);

    }
    public static void main(String[] args) {
        MaxFloat max = new MaxFloat(1F, 2F, 3F);
        max.print();
        max.detMax();
    }
}
