//write a program using multiple inheritance
interface Red//inteface 1
{
	void add(int x,int y);//method
} 
interface Green//interface 2
{
    void sub(int x,int y);//method	
}
public class Yellow implements Red,Green//keyword implements
{
	public void add(int x,int y)//implement add method
	{
		int z;
		z=x+y;
		System.out.println("The addition of two number is:"  +z);
	}
    public void  sub(int x,int y)//implement sub method
	{
        int z;
        z=x-y;
        System.out.println("The Subtraction of two number is:"   +z);
	}

public static void main(String[] args)
{
    Yellow i=new Yellow();//object creation
    i.add(2,4);
     i.sub(8,5);
}
}