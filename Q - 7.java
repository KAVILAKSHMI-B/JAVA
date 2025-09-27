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

		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int perimeter = 2 * (length + breadth);
		int area = length * breadth;
		System.out.println("Length: "+ perimeter + " m");
		System.out.println("Area: "+ area + " sqm");
	}
}