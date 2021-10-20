package com.ma.idea;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double x,y,a,b,c;
        System.out.println("The size of brick:");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side а:");
        a = in.nextDouble();
        System.out.print("Enter the side b:");
        b = in.nextDouble();
        System.out.print("Enter the side c:");
        c = in.nextDouble();

        System.out.println("The size of hole");
        System.out.print("Enter the side х:");
        x = in.nextDouble();
        System.out.print("Enter the side y:");
        y = in.nextDouble();

        if (x >= a && y>=b ) {
            System.out.print("The brick will fit into the hole");
        } else if ( x >= b && y>=a ) {
            System.out.print("The brick will fit into the hole");
        } else if ( x >= a && y>=c) {
            System.out.print("The brick will fit into the hole");
        } else if ( x >= c && y>=a) {
            System.out.print("The brick will fit into the hole");
        }else if ( x >= c && y>=b) {
            System.out.print("The brick will fit into the hole");
        }else if ( x >= b && y>=c) {
            System.out.print("The brick will fit into the hole");
        } else {
            System.out.println("The brick will NOT fit into the hole");
        }
    }
}
