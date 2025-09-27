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
        int balance = sc.nextInt();
        int process = sc.nextInt();
        switch (process) {
            case 1:
                int depositAmount = sc.nextInt();
                balance += depositAmount;
                System.out.println(balance);
                break;
            case 2:
                int withdrawAmount = sc.nextInt();
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient Balance");
                } else {
                    balance -= withdrawAmount;
                    System.out.println(balance);
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}