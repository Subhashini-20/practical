//package Constructor Overloading

class Customer 
{
    int accno;
	String acc_type;
	double amt;
	Customer()
	{
		accno=246167;
		acc_type="Savings";
		amt=50000;
	}
    Customer(int x,String y,double z)
	{
	   accno=x;
	   acc_type=y;
       amt=z;
	}
    void show()//print the details
	{
         System.out.println(accno+"   "+acc_type+"    "+amt);
    }
public static void main(String[] args)
{
   Customer s=new Customer();
   Customer s1=new Customer(124387,"checkbalance",10000);
   Customer s2=new Customer(164563,"Withdraw",40000);
   s.show();
   s1.show();
   s2.show();
}
}
