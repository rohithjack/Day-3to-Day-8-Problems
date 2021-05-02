package com.Day3;


import java.util.Scanner;
import java.io.*;
import java.lang.Math;

class LineComparision {
    float x,y,x1, x2, y1, y2 ,x3,y3;
    float line;
    float diff;
    double num;


    public void disp() {
        System.out.println ( "Line comaprision problem " );
    }

    public void line() {
        Scanner input = new Scanner ( System.in );
        System.out.println ( "Enter line x1,y1 " );
        float x1 = input.nextFloat ();
        float y1 = input.nextFloat ();
        System.out.println ( "Enter line x2,y2 " );
        float x2 = input.nextFloat ();
        float y2 = input.nextFloat ();
        x=(x2-x1);
        y=(y2-y1 );

        x3=x*x;
        y3=y*y;


        line = x3+y3;

        System.out.println ( " x1is  "  +x1);
        System.out.println ( " x2 is  "  +x2);
        System.out.println ( " y1 is  "  +y1 );
        System.out.println ( " y2 is  "  +y2 );

        System.out.println ( " x2-x1 is  "  +x );
        System.out.println ( " y2-y1 is  "  +y );
        System.out.println ( "(x2-x1)^2 + (y2-y1)^2 is "  +line );
        System.out.println ( " Length of a line " +Math.sqrt(line));


    }

}

 class Main {

    public static void main(String[] args) {

        LineComparision obj = new LineComparision();
        obj.disp();
        obj.line();


    }
}


