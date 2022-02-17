package com.company.Day13Generics;

public class MaxString {
    String a, b, c;

    public MaxString(String A, String B, String C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }
    public void print(){

        System.out.println("Given String are : ");
        System.out.print(a +", ");
        System.out.print(b +", ");
        System.out.println(c);
    }
    public void detMax() {

        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            System.out.println("Max String is : "+ a);

        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
            System.out.println("Max String is : "+ b);

        else
            System.out.println("Max String is : "+ c);

    }
    public static void main(String[] args) {
        MaxString max = new MaxString("Apple", "Peach", "Banana");
        max.print();
        max.detMax();
    }
}

