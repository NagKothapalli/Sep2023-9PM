package basicConcepts;

import org.junit.Test;

public class ConditionalStatements {
	// WAP to compare two given numbers

	int a = 22;
	int b = 24;

	// if(expression -> boolean : true / false){ Task }
	// 44 + 66 = 110 , Apple + 1 = Apple1
	@Test
	public void compareNumbers() {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (a == b) {
			// true
			System.out.println("Both A and B are equal");
		}
	}

	@Test
	public void compareNumbers_ifelse() {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (a == b) {
			// true
			System.out.println("Both A and B are equal");
		} else {
			// false
			System.out.println("Both A and B are not equal");
		}
	}

	// Unit Test
	@Test
	public void compareNumbers_ifelse_test() {
		compareNumbers_ifelse(55, 55);
		compareNumbers_ifelse(25, 55);
	}

	// Dev

	public void compareNumbers_ifelse(int x, int y) {
		System.out.println("A value :" + x);
		System.out.println("B value :" + y);
		if (x == y) {
			// true
			System.out.println("Both A and B are equal");
		} else {
			// false
			System.out.println("Both A and B are not equal");
		}
	}

	// Multiple Decisions

	// WAP to read two numbers as input and perform addition if equal , do
	// subtraction a>b, do multiplication a<b
	@Test
	public void multipleDecisions_test() // unit test case
	{
		multipleDecisions(22, 22); // 5/15 * 100 = 33.33333
		multipleDecisions(62, 22);
		multipleDecisions(22, 12);
		multipleDecisions(22, 62);
	}

	// Dev code // code debug
	public void multipleDecisions(int a, int b) {
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		if (a == b) {// true c= a+b;
			int sum = a + b; // c is a local variable
			System.out.println("Sum of Two Numbers :" + sum);
		} else if (a > b) {// true
			int diff = a - b;
			System.out.println("Difference of Two Numbers :" + diff);
		} else if (a < b) {// true
			int prod = a * b;
			System.out.println("Product of Two Numbers :" + prod);
		}
	}

	// WAP to read two numbers as input and perform the below task if and only if
	// both the inputs are above 10
	// Task : addition if equal , do subtraction a>b, do multiplication a<b
	@Test
	public void logicalOperators_test() // java function
	{
		logicalOperators(4, 8);
		logicalOperators(14, 8);
		logicalOperators(4, 88);
		logicalOperators(44, 44);
		logicalOperators(14, 44);
		logicalOperators(84, 44);
	}

	public void logicalOperators(int num1, int num2) {
		System.out.println("First Number :" + num1);
		System.out.println("Second Number :" + num2);
		boolean r1 = (num1 > 10); // t | f // == , > , < , ! - Relational Operations
		boolean r2 = (num2 > 10); // t | f // = : Assignment operator
		// T && T -> T
		if (r1 == true && r2 == true) // && logical operator
		{ // true
			// Task
			if (num1 == num2) // Nested if condition
			{
				int sum = num1 + num2; // + , - , * : Arithmetic operators
				System.out.println("Sum of two numbers :" + sum);
			} else if (num1 > num2) {
				int diff = num1 - num2;
				System.out.println("Difference of two numbers :" + diff);
			} else if (num1 < num2) {
				int prod = num1 * num2;
				System.out.println("Product of two numbers :" + prod);
			}
		} else {
			System.out.println("Any one or both Num1 and Num2 might be below 10 ");
		}

	}

	// WAP to find the given number is even
	@Test
	public void evenNumber_test() {
		evenNumber(22); // 50 %
		evenNumber(25); // 50 %
	}

	public void evenNumber(int num) {
		System.out.println("Given Number :" + num);
		int rem = (num % 2);
		if (rem == 0) {
			System.out.println("Given Number is EVEN");
		} else {
			System.out.println("Given Number is not EVEN");
		}
	}

	// WAP to find the given number is odd
	@Test
	public void oddNumber_test() {
		oddNumber(22); // 50 %
		oddNumber(25); // 50 %
	}

	public void oddNumber(int num) {
		System.out.println("Given Number :" + num);
		int rem = (num % 2);
		if (!(rem == 0)) {
			System.out.println("Given Number is ODD");
		} else {
			System.out.println("Given Number is not ODD");
		}
	}

	// WAP to find the given number is even or odd
	@Test
	public void evenOddNumber_test() {
		evenOddNumber(22); // 50 %
		evenOddNumber(25); // 50 %
	}

	public void evenOddNumber(int num) {
		System.out.println("Given Number :" + num);
		int rem = (num % 2);
		if (rem == 0) {
			System.out.println("Given Number is EVEN");
		} else {
			System.out.println("Given Number is ODD");
		}
	}

	@Test
	public void wordSplit_test() {
		String[] arr = { "apple", "bat", "cat", "rat", "hello1", "he", "hell" };
		wordSplit("hellocat", arr);
	}

	public void wordSplit(String str, String[] strarr) {
		int cnt = 0;
		String s1 = null;
		String s2 = null;
		for (int i = 0; i < strarr.length; i++) {
			if (str.contains(strarr[i])) {
				cnt++;
				s2 = strarr[i];
			}
		}
		if (cnt >= 2) {
			System.out.println("The Dictionary contains both words of the First Element");
		} else {
			System.out.println("The Dictionary does not contains both words of the First Element");
		}

	}
	// Logical operator , nested if conditions

}
