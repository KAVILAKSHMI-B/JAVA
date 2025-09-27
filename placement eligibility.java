/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main{
    public static void checkEligibility(String name, int arrears, double cgpa) {  
        System.out.println("Name of the Student:" + name);
        if ((arrears == 1 && cgpa > 70) || (arrears == 1 || arrears == 2) && cgpa > 75) {
            System.out.println(name + " is Eligible for Placement");
        } else {
            System.out.println(name + " is Not Eligible for Placement");
        }
    }

    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int arrears = scanner.nextInt();
        double cgpa = scanner.nextDouble();
        checkEligibility(name, arrears, cgpa);
        scanner.close();
    }
}