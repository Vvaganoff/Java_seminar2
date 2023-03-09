package org.example;

public class Ex0 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,1.0,1.0);
        Vector vector2 = new Vector(1.0,2.0,1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("длинна вектора = " +vector1.lenghtVector());
        System.out.println("скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("косинус угла между векторами = " + vector1.cosVector(vector2));
        System.out.println("сумма векторов = " + vector1.summaVektor(vector2));
        System.out.println("разность векторов = " + vector1.raznostVektor(vector2));

    }
}
