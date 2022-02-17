package com.company.Day13Generics;

public class Max4Data<E extends Comparable<E>> {
    E a, b, c, d;

    public Max4Data(E A, E B, E C,E D) {
        this.a = A;
        this.b = B;
        this.c = C;
        this.d = D;
    }
    public static <E extends Comparable<E>> void findMax(E A, E B, E C, E D) {

        if (A.compareTo(B) > 0 && A.compareTo(C) > 0 && A.compareTo(D) > 0)
            System.out.println("Max : "+A+ "\n");

        else if (B.compareTo(A) > 0 && B.compareTo(C) > 0 && B.compareTo(D) > 0)
            System.out.println("Max : "+B+ "\n");

        else if (C.compareTo(A) > 0 && C.compareTo(B) > 0 && C.compareTo(D) > 0)
            System.out.println("Max : "+C+ "\n");

        else
            System.out.println("Max : "+D+ "\n");
    }
    public void printMax(){

        System.out.println("Given Data are : ");
        System.out.print(a +", ");
        System.out.print(b +", ");
        System.out.print(c +", ");
        System.out.println(d);

        Max4Data.findMax(a, b, c, d);
    }
    public static void main(String[] args) {

        Max4Data<Integer> maxInt = new Max4Data<>(1, 2, 3, 4);
        maxInt.printMax();

        Max4Data<Float> maxFloat = new Max4Data<>(1f, 2f, 3f, 4F);
        maxFloat.printMax();

        Max4Data<String> maxString = new Max4Data<>("Apple", "Peach", "Banana", "Mango");
        maxString.printMax();
    }
}
