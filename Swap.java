//write a pgm using method overloading
//swap the integer,double
class Swap
{
	void swap(int x,int y)//swap two integer number
	{
       int t;
	   t=x;
	   x=y;
	   y=t;
	   System.out.println("The Swapping of two number is:");
	    System.out.print(x+"   " +y);
		System.out.println();
	}
	void swap(double x,double y)//swap two  double number
	{
       double t;
	   t=x;
	   x=y;
	   y=t;
	   System.out.println("The Swapping of two double is:");
	   System.out.print(x+"  "+y);
	}
public static void main(String[] args)
{
    Swap s=new Swap();
	s.swap(23,45);//calling two integer number
	s.swap(74.5,39.5);//calling two double number
}
}
