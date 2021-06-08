package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width:");
        double width = input.nextDouble();
        System.out.println("Enter Height");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle is : " + rectangle.display());
        System.out.println("Perimeter is : " + rectangle.getPerimeter());
        System.out.println("Area is: " + rectangle.getArea());
    }
}
