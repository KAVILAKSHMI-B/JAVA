/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int [n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
        int Youngest=a[0];
        int Oldest=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>Oldest)
            {
                Oldest=a[i];
            }
            if(a[i]<Youngest)
            {
                Youngest=a[i];
            }
        }
        System.out.println("Youngest="+Youngest);
        System.out.println("Oldest="+Oldest);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}