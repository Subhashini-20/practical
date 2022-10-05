//write a program using constructor ,named method,anonymous,static method
abstract class Pgm//abstract class
{
	abstract void sub();//abstract method
}	
class Anony//class creation
{
	int a,b;
	static String s="Student";//static variable
	Anony()//constructor 
	{
        System.out.println("This is constructor method");
	}
	void add()//instance method
	{
		int a=5;
		int b=2;
		System.out.println("The sum of two number is:"+(a+b));
	}
	static void change()//static method
	{
		s="Teacher";//change the static value
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Pgm p=new Pgm()//Anonymous method
		{
	       void sub()//abstract method implementation
	       {
		      int a=6;
		      int b=4;
		      System.out.println("The subtraction  of two number is:"+(a-b));
		   } 
		};
		p.sub();//call the abstract method
		Anony n=new Anony();//object creation
		n.add();//call the instance method
		Anony.change();//call static method using class name
	}
}
