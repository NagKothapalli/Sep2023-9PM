package basicConcepts;

//Signature CLASS : 
     // Modifier[opt]   class  Name{  Members   }

//Access Modifiers : private , default , public | protected
//Non Access Modifiers : static , final

public class CoreConcepts
{
	public CoreConcepts()
	{
		
	}
	//Members : variables / functions
	
	//Data - number , name , boolean , floating
	
	//sum of two numbers : integers
	
	//send a mail : mail address : string
	
	// Results - grades : A - character
	
	// Percentage : floating point number - 94.56
	
	// yes or no data  : boolean - true / false 
	
	//Student : rollNum , percentage , name , gender - M / F , result 
	
	//Signature of Variable : 
	   //Modifier[opt]     DataType    Name ; - Declaration        //Modifier[opt]     DataType    Name =  value;  - Assignment
	
	public static String collegeName  = "JNTU";
	
	public static final double intrestRate = 8.3;
	
	public int studentNumber = 22; // 10 , 20 , 34,45,3,45,3,453,557,34
	
	public String studentName = "Ram";
	
	private char gender = 'M';
	
	protected boolean result = false; // true | false
	
	//byte , short , int , long  , double 
	
	long population = 1545443546;
	
	//Signature of a Method 
	
	 //Modifier[opt]   ReturnType  Name(){    body   } 
	
	//Modifier[opt]   ReturnType  Name(arguments .....){    body   } 
									 //DataType arg1,DataType arg2,....
	
	//Naming Conventions for member of class : 
	
	//Dos
	 //It can start with _  , $
	 // It can start with any of  a-z  / A-Z
	 // It should follow camelCasing [ Need not follow only for Constructor of a class]
	
	int stdNum;
	int StdNum;
	int _stdNum;  int std_Num;  int stdNum_;
	int $stdNum;  int std$Num;  int stdNum$;
	int std1Num;  int stdNum1;
	
	
	//Dont's	
	// It can not have any space in b/w
	// No Special characters are allowed 
	// No Reserved key words are allowed
	
	//int std Num;
	//int std-Num;
	//int std@Num;
	//int 1StdNum;
	
	//psvm
	//project-> xxxxx -> classname.main();
	public static void main(String[] inputs) //student 1
	{
		System.out.println("Hello World  with String ");
		welcomeMessage(); // calling a function
		welcomeMessage("Welcome to Functional Automation");
		welcomeMessage("Welcome to Functional Automation with Java");
		//return 22;
	}
	public static void main(String[] inputs,int abcd) //student 1
	{
		System.out.println("Hello World  with String and integer ");
		welcomeMessage(); // calling a function
		welcomeMessage("Welcome to Functional Automation");
		welcomeMessage("Welcome to Functional Automation with Java");
		//return 22;
	}
	public static void main(int[] inputs) //student 1
	{
		System.out.println("Hello World with integer");
		welcomeMessage(); // calling a function
		welcomeMessage("Welcome to Functional Automation");
		welcomeMessage("Welcome to Functional Automation with Java");
		//return 22;
	}
		
	//no returntype ,  no input  - 0 0
	public static  void welcomeMessage() //student 2
	{
		//body - implementation
		System.out.println("Welcome to Selenium Java"); //Hard coded Message
	}
	
	public static  void welcomeMessage(String customMsg) //student 3
	{
		//body - implementation
		System.out.println(customMsg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

class Yahoo
{
	
}
class Amazon
{
	
}
