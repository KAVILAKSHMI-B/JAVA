/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int radius = sc.nextInt();
		int height = sc.nextInt();
		double pi = 3.14;
		double volume = pi * radius * radius * height;
		int result = (int) Math.round(volume);
		System.out.println(result);
	}
}