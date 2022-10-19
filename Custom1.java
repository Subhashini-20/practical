//our own custom exception
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)//param ctr
	{
		super(s);//calling parent class constructor
	}
}
class Custom1
{
  static void check(int age)throws InvalidAgeException
  {
	  if(age<18)
	    throw new InvalidAgeException("in valid");//throw invalid age exception
	  else
		  System.out.println(" valid");//valid message
  }
public static void main(String[] args)throws InvalidAgeException
{
  Custom1 c=new Custom1();
  check(20);//call check method
}
}
 