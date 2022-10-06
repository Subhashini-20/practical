//write a pgm using inheritance 
//method overriding
class Bank//parent class
{
	int intr()//method overriding
	{
		return 0;
	}
}
class Sbi extends Bank//child class 1
{
	int intr()//method overriding
	{
		return 6;
	}
}
class Axis extends Bank//child class 2
{
	int intr()//method overriding
	{
		return 7;
	}
}
class Icici extends Bank//child class 3
{
	int intr()//method overriding
	{
		return 8;
	}
}
public class Bank2
{	
    public static void main(String[] args)
    {
		Bank b=new Bank();//object creation
		Sbi s=new Sbi();
		Axis a=new Axis();
		Icici i=new Icici();
		System.out.println("The bank returns the interst is:" +b.intr());//method callig
		System.out.println("The SBI bank returns the interst is:" +s.intr());
		System.out.println("The Axis bank returns the interst is:" +a.intr());
		System.out.println("The Icici bank returns the interst is:" +i.intr());
	}
}
	
