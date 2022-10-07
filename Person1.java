//Write a pgm "to make hierarchile inheritance"
class Person
{
	int pid;
	String pname;
	Person()//no param constructor
	{
		pid=1234567;
		pname="SUBHA";
	}
	void show()//method
	{
		System.out.println("The person id is:" +pid);
		System.out.println("The person name is:" +pname);
	}	
}
class Student extends Person//class extends from person
{
    double marks;
	Student(double y)//parameter constructor
	{
		marks=y;
	}
	void show1()
	{
		System.out.println("The Student mark is:" +marks);
	}	
}
class Emp extends Person//class extends from person
{
	double salary;
    Emp(double y)//one param constructor
	{
		salary=y;
	}
	void show2()
	{
		System.out.println("The Employee salary is:" +salary);
	}
}
public class Person1 
{	
public static void main(String[] args)
{
	Student s=new Student(100);//one param constructor
	Emp e=new Emp(40000);//one param constructor
	s.show();//person method calling
	s.show1();//student method calling
	e.show2();//emp method calling
}
}