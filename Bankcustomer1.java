//write a pgogram print Bankcustomer details using package
package anudip;//package creation
public class Bankcustomer1//class name "Bankcustomers"
{
	int accno;//data members
	String cname;
	double amt;
	public void get(int x,String y,double z)//method
	{
		accno=x;
		cname=y;
		amt=z;
	}
	public void show()//method
	{
		System.out.println(accno+"   " +cname+"   "+amt);
	}	
}