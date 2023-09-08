package interfaceConcept;

//Class contains concrete functions 
//Concrete function : A function with body / implementation / definition
//Interface contains abstract functions
//Abstract function : A function without body / implementation / definition

//Class inherits another class -> ClassA extends ClassB
//Class can inherit an interface -> ClassA implements InterfaceB
public class MiniCalculator implements ICalculator
{
	public void welcomeMessage()
	{
		System.out.println("Welcome to Casio Mini Calculator");
	}
	//Implement Arithmetic operations
	public int addition(int x,int y)
	{
		int z = x+y;
		return z;
	}
	public int subtraction(int x,int y)
	{
		int z = x-y;
		return z;
	}
	public int multiplication(int x,int y)
	{
		int z = x*y;
		return z;
	}
	public int division(int x,int y)
	{
		int z = x/y;
		return z;
	}

}
