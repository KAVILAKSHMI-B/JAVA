/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int add = sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++) {
            if(a[i]==add) {
                index = i;
            }
        }
        if(index==-1)
        {
            System.out.println("-1");
        } else {
            System.out.printf("Door Number is %03d-DN\n",index);
        }
    
    
    
    
    }
}