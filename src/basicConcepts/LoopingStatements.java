package basicConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//To perform an activity for n number of times , we go for a looping statement - for , while
	
	
	@Test
	public void applyColorToStairCase()
	{
		System.out.println("Apply color to step 1");
		System.out.println("Apply color to step 2");
		System.out.println("Apply color to step 3");
		System.out.println("Apply color to step 4");
		System.out.println("Apply color to step 5");
		System.out.println("Apply color to step 1");
		System.out.println("Apply color to step 2");
		System.out.println("Apply color to step 3");
		System.out.println("Apply color to step 4");
		System.out.println("Apply color to step 5");
		System.out.println("Apply color to step 1");
		System.out.println("Apply color to step 2");
		System.out.println("Apply color to step 3");
		System.out.println("Apply color to step 4");
		System.out.println("Apply color to step 5");
		System.out.println("Apply color to step 1");
		System.out.println("Apply color to step 2");
		System.out.println("Apply color to step 3");
		System.out.println("Apply color to step 4");
		System.out.println("Apply color to step 5");
	}
	
	// starting point , end point , step size
	
	//for( int iterator=1; expression ; step size){ Duplicate Task }
	@Test
	public void applyColor()
	{
		//for(int i=1;i<100;i=i+1) // i=1 2   1<100->t 2<100->t ....99<100->t 100<100->f
		for(int i=1;i<=100;i=i+1) // 100<=100 ->t 101 <=100 -> f
		{//true
			System.out.println("Apply Color to Step :" + i);
		}
		System.out.println("Came out of for loop");
	}
	@Test
	public void applyColor_2ndDay()
	{
		//for(int i=1;i<100;i=i+1) // i=1 2   1<100->t 2<100->t ....99<100->t 100<100->f
		for(int i=101;i<=200;i++) // 100<=100 ->t 101 <=100 -> f
		{//true
			System.out.println("Apply Color to Step :" + i);
		}
		System.out.println("Came out of for loop");
	}
	
	//step size
	@Test
	public void applyGreenColorToEvenSteps()
	{
		for(int i=2;i<=100;i=i+2)
		{
			System.out.println("Apply Green Color to Step :" + i);
		}
	}
	@Test
	public void applyRedColorToOddSteps()
	{
		for(int i=1;i<=100;i=i+2)
		{
			System.out.println("Apply Red Color to Step :" + i);
		}
	}
	//WAP to print all 100 numbers
	@Test
	public void printNumbersInRow()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.print(i);
			System.out.print(",");
		}
	}
	@Test
	public void printNumbersInNewLine()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}

	//WAP to print all even numbers in the range of 1-100
	@Test
	public void printEvenNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void printOddNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if(!(i%2 == 0)) // i=1->t i=2->f
			{//true
				System.out.println(i);
			}
		}
	}
	
	//WAP to find the student 
	
	// 1 to 100 -> 1 2 3 4 5 6 7 8 .... 99 100  : 44
	@Test
	public void findStudent()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Searching Number :" + i);
			if(i==44) // i = 1 1==44->false
			{ //true
				System.out.println("Inside if condition");
				System.out.println("Found the student");
				break;
			}			
			System.out.println("After if condition");			
		}
		System.out.println("Came out of for loop");
	}
	
	//WAP to give a pen to roll 150
	@Test
	public void givePenToAllStudents()
	{
		boolean flag = false;
		for(int i=1;i<=100;i++)
		{
			if(i==50)
			{
				System.out.println("Give a Pen - " + i);
				flag = true;
				break;
			}			
		}
		System.out.println(flag);
	}
	
	//Nested loop 
	//WAP to apply color to building with 5 floors and 20 steps in each floor
	@Test
	public void applyColorToBuilding()
	{
		//Cover all five floors 
		//Outer loop
		for(int f=1;f<=5;f++) {
			System.out.println("************We are in Floor Number :" + f);
			//floor =1 
			//Inner loop
			for(int s=1;s<=20;s++) {
				System.out.println("Apply color to step number :" + s);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
