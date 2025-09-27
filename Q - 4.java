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

		String name = sc.next();
		int age =  sc.nextInt();
		double cgpa = sc.nextDouble();
		char grade = sc.next().charAt(0);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Cgpa: "+cgpa);
		System.out.println("Grade: "+grade);
	}
}