//using throws ,throw keyword
import java.util.Scanner;
class InValidLoginException extends Exception//custom exception
{
	public InValidLoginException(String s)//parameter constructor
	{
		super(s);
	}
}
class Login
{	
	static String uname;
	 static int pwd;
	void input()
	{
		Scanner sc=new Scanner(System.in);//get the input
		System.out.println("enter user name:");
	   uname=sc.next();
	  System.out.println("enter password:");
	   pwd=sc.nextInt();
	}
	
	 static void output(String x,int y)throws InValidLoginException//throws invlid login excepton
	{
		 
	  	if(x!="anudip"&& y!=2576)
			throw new InValidLoginException("invalid login");//throw invalid login
			else
						System.out.println("valid login");//valid login

       
	}
	
    public static void main(String[] args)throws InValidLoginException
	{
       Login l=new Login();//object cretaion
	  l.input();
	  output(uname,pwd);
       
	}
	
}