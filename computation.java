/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Main {
    public static double calculateGrossSalary(int basicSalary) {
        double hra, da, grossSalary;
        
        if (basicSalary < 15000) {
            hra = 0.15 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 5000;
            da = 0.98 * basicSalary;
        }
        
        grossSalary = basicSalary + hra + da;
        return grossSalary;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        double grossSalary = calculateGrossSalary(basicSalary);
        System.out.printf("%.2f", grossSalary);
        
        sc.close();
    }
}