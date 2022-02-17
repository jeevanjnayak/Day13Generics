package com.company.Day13Generics;

public class MaxRefactor2<T extends Comparable<T>> {
    T x,y,z;

    public MaxRefactor2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static <T extends Comparable<T>> void findMax(T x,T y,T z) {

        if (x.compareTo(y) > 0 && x.compareTo(z) > 0)
            System.out.println("Max : "+x+ "\n");

        else if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
            System.out.println("Max : "+y+ "\n");

        else
            System.out.println("Max : "+z+ "\n");
    }
    public void printMax(){

        System.out.println("Given Data are : ");
        System.out.print(x +" ");
        System.out.print(y +" ");
        System.out.println(z);

        MaxRefactor2.findMax(x, y, z);
    }
    public static void main(String[] args) {

        MaxRefactor2<Integer> maxInt = new MaxRefactor2<>(1, 2, 3);
        maxInt.printMax();

        MaxRefactor2<Float> maxFloat = new MaxRefactor2<>(1f, 2f, 3f);
        maxFloat.printMax();

        MaxRefactor2<String> maxString = new MaxRefactor2<>("Apple", "Peach", "Banana");
        maxString.printMax();
    }
}
