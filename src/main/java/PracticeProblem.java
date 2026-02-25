/** 
        * File: Lesson 1.4 - Input
		* Author: Tom Leung
		* Date Created: February 20, 2026
		* Date Last Modified: February 20, 2026
		*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner v = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name;
		name = v.nextLine();
		System.out.println(name);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner va = new Scanner(System.in);
		int int1;
		System.out.print("Input a whole number: ");
		int1= va.nextInt();
		va.nextLine();
		System.out.println(int1*2+2);


	}

	public static void q3() {
		//Write question 3 code here
		Scanner ip = new Scanner(System.in);
		double radius;
		System.out.print("Input a radius: ");
		radius = ip.nextDouble();
		ip.nextLine();
		System.out.println(radius*2*3.14);
		System.out.println(radius*radius*3.14);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner ip = new Scanner(System.in);
		String fn;
		String ln;
		String age;
		System.out.print("Input a first name: ");
		fn= ip.nextLine();
		System.out.print("Input a last name: ");
		ln = ip.nextLine();
		System.out.print("Input an age: ");
		age = ip.nextLine();

		System.out.println(ln+", "+fn+" - "+age);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner ip = new Scanner(System.in);
		String name;
		int age;
		int iq;
		System.out.print("Input a name: ");
		name = ip.nextLine();
		System.out.print("Input an age: ");
		age = ip.nextInt();
		iq = age;
		age = age+3;


		System.out.print(name);
		System.out.println(age);
        System.out.println(iq);

	}

}
