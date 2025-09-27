/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;
        String grade;

        if (average == 100) {
            grade = "S";
        } else if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        System.out.println("Name of the Student:" + name);
        System.out.println("Total Mark:" + total);
        System.out.println("Average Mark:" + average);
        System.out.println("Grade Mark:" + grade);
        sc.close();
    }
}