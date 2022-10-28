//write a pgm with printwriter class and store different data details into "abc.txt"
import java.io.*;
public class printwriter 
{
	public static void main(String[] args)throws IOException
	{
		FileOutputStream fout= new FileOutputStream("d:\\abc.txt");//fileoutputstream class
		PrintStream pout=new PrintStream(fout);//printstream class
		pout.println("5000");//print specified interger value
		pout.println("Hello");//print specified  string value
		pout.println("34.5");//print specified double value
		pout.println('e');//print specified character value
		pout.println("56.5f");//print specified float value
		pout.println(true);//print specified boolean value
		System.out.println("Success");
	}
}