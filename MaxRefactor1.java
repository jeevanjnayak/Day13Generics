package com.company.Day13Generics;

public class MaxRefactor1<E extends Comparable<E>> {
    E x,y,z;

    public MaxRefactor1(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void print() {

        System.out.println("Given data are : ");
        System.out.print(x +", ");
        System.out.print(y +", ");
        System.out.println(z);

    }
    public void DetMax() {

        if (x.compareTo(y) > 0 && x.compareTo(z) > 0)
            System.out.println("Max : " +x+ "\n");

        else if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
            System.out.println("Max : " +y+ "\n");

        else
            System.out.println("Max : " +z+ "\n");
    }
    public static void main(String[] args) {

        MaxRefactor1<Integer> maxInt = new MaxRefactor1<>(1, 2, 3);
        maxInt.print();
        maxInt.DetMax();

        MaxRefactor1<Float> maxFloat = new MaxRefactor1<>(1f, 2f, 3f);
        maxFloat.print();
        maxFloat.DetMax();
        
        MaxRefactor1<String> maxString = new MaxRefactor1<>("Apple", "Peach", "Banana");
        maxString.print();
        maxString.DetMax();
    }
}
